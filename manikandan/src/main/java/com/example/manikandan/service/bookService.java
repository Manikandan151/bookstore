package com.example.manikandan.service;
import com.example.manikandan.model.book;

import org.springframework.stereotype.Service;

import java.util.List;


public interface bookService {

    public List<book> getAll();
    public void add(book book);
    public void delete(int id);

}
