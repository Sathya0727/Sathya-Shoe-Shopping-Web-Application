package com.sathya.shoes.service;

import com.sathya.shoes.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {
        return Arrays.asList(

            new Product(13, "Puma Buzz Sneakers", 1499, "/images/shoes/shoe44.jpg", "running"),

            new Product(2, "Sparx SM 23", 899, "/images/shoes/shoe2.jpg", "running"),
            new Product(3, "Addidas", 1299, "/images/shoes/shoe6.jpg", "basketball"),
            new Product(4, "U.S. POLO ASSN.", 1999, "/images/shoes/shoe9.jpg", "lifestyle"),
            new Product(5, "Adidas Ultraboost 22", 1995, "/images/shoes/shoe5.jpg", "running"),
            new Product(6, "Adidas Stan Smith", 1899, "/images/shoes/shoe3.jpg", "lifestyle"),
            new Product(7, "Puma RS-X Turbo", 1455, "/images/shoes/shoe7.jpg", "lifestyle"),

          
            new Product(0, "Puma Cali Dream", 985, "/images/shoes/shoe14.jpg", "lifestyle"),

            new Product(9, "Reebok Classic Leather", 1595, "/images/shoes/shoe4.jpg", "lifestyle"),
            new Product(10, "Reebok Club C 85", 1569, "/images/shoes/shoe10.jpg", "lifestyle"),
            new Product(11, "Sparx SM-408 Sports", 1999, "/images/shoes/shoe11.jpg", "sports"),
            new Product(12, "Sparx SX0455 Running", 1895, "/images/shoes/shoe12.jpg", "running")
        );
    }

    public List<String> getCategories() {
        return Arrays.asList(
            "Nike", "Adidas", "Puma", "Reebok", "Sparx",
            "Running", "Basketball", "Training & Gym",
            "Football", "Skateboarding", "Lifestyle", "Sports"
        );
    }
}
