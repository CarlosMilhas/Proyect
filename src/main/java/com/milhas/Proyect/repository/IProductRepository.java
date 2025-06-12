package com.milhas.Proyect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.milhas.Proyect.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

}