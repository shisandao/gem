package com.ssd.gem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.ssd.gem.*"})
@MapperScan("com.ssd.gem.**.mapper")
public class GemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GemApplication.class, args);
	}

}

