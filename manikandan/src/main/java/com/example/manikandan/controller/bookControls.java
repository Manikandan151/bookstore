package com.example.manikandan.controller;
import com.example.manikandan.model.book;
import com.example.manikandan.service.bookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class bookControls {

    @Autowired
    private bookServiceImpl bookServiceImpl;
     @GetMapping("/bookss")
    public List<book> getAll(){
        return bookServiceImpl.getAll();
    }
   @PostMapping("/bookss")
    public void add(@RequestBody book book){
        bookServiceImpl.add(book);
    }
     @PutMapping("/bookss")
    public void update(@RequestBody book book){
         bookServiceImpl.add(book);
    }

    @DeleteMapping("/bookss/{id}")
    public void delete(@PathVariable("id") int id){
          bookServiceImpl.delete(id);
    }


}
