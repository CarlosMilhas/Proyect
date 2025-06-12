package com.milhas.Proyect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milhas.Proyect.model.Product;
import com.milhas.Proyect.service.ProductoService;

@RestController
@RequestMapping("/app")
public class ProductController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/crear")
    public void createProduct(@RequestBody Product myProduct) {

        productoService.createProduct(myProduct);
    }

}
