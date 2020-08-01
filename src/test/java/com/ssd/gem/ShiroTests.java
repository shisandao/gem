package com.ssd.gem;

import com.ssd.gem.sys.shiro.DatabaseRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ShiroTests {

    //定义一个内部类-保存用户账号密码
    class User {
        private String name;
        private String password;
        public User(String name, String password) {
            this.name = name;
            this.password = password;
        }
    }

    @Test
    public void testA() {
        //用户
        User userA = new User("zhao", "123");
        User userB = new User("qian", "456");
        User userC = new User("sun", "789");
        List<User> users = new ArrayList<>();
        users.add(userA);
        users.add(userB);
        users.add(userC);

        //角色
        List<String> roles = new ArrayList<>();
        roles.add("admin");
        roles.add("orderManager");

        //权限
        List<String> permits = new ArrayList<>();
        permits.add("addOrder");
        permits.add("deleteOrder");
        permits.add("updateOrder");
        permits.add("queryOrder");

        //获取安全管理者实例
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        securityManager.setRealm(new DatabaseRealm());
        //将安全管理者放入全局对象
        SecurityUtils.setSecurityManager(securityManager);

        //isAuthenticated(),hasRole,isPermitted三个方法分别校验密码、角色、权限
        for (User user : users) {

            //全局对象通过安全管理者生成Subject对象
            Subject subject = SecurityUtils.getSubject();
            //如果已经登录过了，退出
            if(subject.isAuthenticated())
                subject.logout();
            //封装用户的数据
            UsernamePasswordToken token = new UsernamePasswordToken(user.name, user.password);
            try {
                //将用户的数据token 最终传递到Realm中进行对比
                subject.login(token);
            } catch (Exception e) {
                //System.out.println("用户【"+user.name+"】登录失败！密码为:"+user.password);
            }

            if (subject.isAuthenticated()) {
                System.out.println("用户【"+user.name+"】登录成功！密码为:"+user.password);
                for (String role : roles) {
                    if (subject.hasRole(role)) {
                        System.out.println("用户【"+user.name+"】拥有角色:"+role);
                    }
                }
                for (String permit : permits) {
                    if (subject.isPermitted(permit)) {
                        System.out.println("用户【"+user.name+"】拥有权限:"+permit);
                    }
                }
            }  else {
                System.out.println("用户【"+user.name+"】登录失败！密码为:"+user.password);
            }
            System.out.println("---------------------------------------------");
        }

    }

}
