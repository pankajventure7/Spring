package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String str ="insert into dbo_books(BookID,NAME,ISBN,Author,Publication) values(?,?,?,?,?)";
		int result =jdbcTemplate.update(str,"1","Magic of thinking big","ABC2","David","penguin");
		if(result >0){
			System.out.println("data is in");

		}

	}
}
