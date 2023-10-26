package com.example.manikandan.service;

import com.example.manikandan.model.book;
import com.example.manikandan.repo.bookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.manikandan.service.bookService;
@EnableJpaRepositories("com.example.manikandan.repo")
@Service
public class bookServiceImpl implements bookService {
     @Autowired
    private bookRepo bookRepo;




     @Override
     public List<book> getAll(){
         return bookRepo.findAll();
     }
     @Override
     public void add(book book){

           bookRepo.save(book);
     }

     @Override
     public void delete(int id){
         book book = new book();
        book.setId(id);
         bookRepo.delete(book);
     }



}
