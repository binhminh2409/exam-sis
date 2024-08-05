package com.exam;

import com.exam.Repository.StudentRepository;
import com.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SisApplication {
	public static void main(String[] args) {
		SpringApplication.run(SisApplication.class, args);
	}

}
