package com.dev.dear_dungee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication
public class DearDungeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DearDungeeApplication.class, args);

		System.out.println("진짜 시작이다!");
		System.out.println("진짜 진짜 최종 찐으로 바로 시작이다!");
	}

}
