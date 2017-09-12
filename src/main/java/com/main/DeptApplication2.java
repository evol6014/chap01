package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.dao.DeptDao;

import lombok.extern.java.Log;

@SpringBootApplication
@ComponentScan("com.example")
@Log
public class DeptApplication2 implements CommandLineRunner{

	@Autowired
	DeptDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(DeptApplication2.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		log.info("@@@");
		log.info("@@@" + DeptApplication2.class);
		log.info("@@@");
		
		dao.selectAll().forEach(e -> {
			log.info(e.toString());
		});
	}

}
