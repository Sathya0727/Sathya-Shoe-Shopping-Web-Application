package com.sathya.shoes.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;
    private String image;
    private String category;
    
    public String getFormattedPrice() {
        return String.format("₹%,d.00", price);
    }
}