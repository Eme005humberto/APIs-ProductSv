package com.example.Example.Example.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Example.Example.Model.Products;

public interface ProductsRepository extends JpaRepository<Products,Integer>{
  
}
