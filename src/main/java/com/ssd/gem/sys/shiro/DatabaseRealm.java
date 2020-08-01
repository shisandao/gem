package com.ssd.gem.sys.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DatabaseRealm extends AuthorizingRealm {

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //能进入到这里，表示账号已经通过验证了
        String userName =(String) principalCollection.getPrimaryPrincipal();
        //通过DAO获取角色和权限
        //Set<String> permissions = new DAO().listPermissions(userName);
        //Set<String> roles = new DAO().listRoles(userName);
        List<String> roles = new ArrayList<>();
        roles.add("admin");
        roles.add("orderManager");

        //权限
        List<String> permissions = new ArrayList<>();
        permissions.add("addOrder");
        permissions.add("deleteOrder");
        permissions.add("updateOrder");
        permissions.add("queryOrder");

        //授权对象
        SimpleAuthorizationInfo s = new SimpleAuthorizationInfo();
        //把通过DAO获取到的角色和权限放进去
        s.setStringPermissions(permissions.stream().collect(Collectors.toSet()));
        s.setRoles(roles.stream().collect(Collectors.toSet()));
        return s;
    }

    /**
     * 鉴权-登录验证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取账号密码
        UsernamePasswordToken t = (UsernamePasswordToken) authenticationToken;
        String userName= authenticationToken.getPrincipal().toString();
        String password= new String( t.getPassword());
        //获取数据库中的密码
        //String passwordInDB = new DAO().getPassword(userName);
        String passwordInDB = "456";

        //如果为空就是账号不存在，如果不相同就是密码错误，但是都抛出AuthenticationException，而不是抛出具体错误原因，免得给破解者提供帮助信息
        if(null==passwordInDB || !passwordInDB.equals(password))
            throw new AuthenticationException();

        //认证信息里存放账号密码, getName() 是当前Realm的继承方法,通常返回当前类名 :databaseRealm
        SimpleAuthenticationInfo a = new SimpleAuthenticationInfo(userName,password,getName());
        return a;
    }
}
