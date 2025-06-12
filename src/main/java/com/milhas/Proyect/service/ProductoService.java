package com.milhas.Proyect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milhas.Proyect.model.Product;
import com.milhas.Proyect.repository.IProductRepository;

@Service
public class ProductoService {

    @Autowired
    private IProductRepository myProductRepository;

    public void createProduct(Product myProduct) {
        myProductRepository.save(myProduct);
    }

}
