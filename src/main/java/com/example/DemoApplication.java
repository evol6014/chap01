package com.example;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.dao.DeptDao;
import com.example.domain.Dept;

//import com.example.dao.DeptDao;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class DemoApplication {

	// @Autowired
	// DeptDao dao; // DI (Dependency Injection) 의존 주입

	@Bean
	public Dept dept() {
		log.info("***");
		log.info("*** DemoApplication.dept()");
		log.info("***");
		return new Dept(90, "xxx", "yyy");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		SpringApplication.run(DemoApplication.class, args).close();

//	@Override
//	public void run(String... arg0) throws Exception {
//		log.info("###");
//		log.info("### DemoApplication run(...)");
//		log.info("###");
//		log.info(dao.selectAll().toString());
	}
}
