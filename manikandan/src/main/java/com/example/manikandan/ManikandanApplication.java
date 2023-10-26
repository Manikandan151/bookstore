package com.example.manikandan;

//mm
import com.example.manikandan.model.book;
import com.example.manikandan.repo.bookRepo;
import com.example.manikandan.service.bookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ManikandanApplication {


	public static void main(String[] args) {

//		SpringApplication.run(ManikandanApplication.class, args);



		ApplicationContext context = SpringApplication.run(ManikandanApplication.class, args);
       System.out.println("mani");
		// Access the MyService bean
		bookServiceImpl myService = context.getBean(bookServiceImpl.class);

		// Invoke the non-static method
//		myService.add(new book(2,"book2","url2",44.33));

	}

}
