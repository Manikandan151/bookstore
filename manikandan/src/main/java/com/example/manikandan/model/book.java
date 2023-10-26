package com.example.manikandan.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer  id;
    private String  name;
    private String url;
    private Double price;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getUrl(){
         return url;
    }
    public  void setUrl(String url){
        this.url = url;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
