package com.example.manikandan.repo;

import com.example.manikandan.model.book;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories("com.example.manikandan.repo")
@Configuration
@Repository
public interface bookRepo extends JpaRepository<book, Integer> {

}

