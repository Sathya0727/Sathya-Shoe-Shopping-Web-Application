package com.sathya.shoes.controller;

import com.sathya.shoes.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/sathya")
    public String home(Model model) {
        model.addAttribute("products", productService.getProducts());
        model.addAttribute("categories", productService.getCategories());
        return "index";
    }

    @GetMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("categories", productService.getCategories());
        return "cart";
    }
}