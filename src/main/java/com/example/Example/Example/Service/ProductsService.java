package com.example.Example.Example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Example.Example.Model.Products;

@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepository productRepository;
	
	public List<Products> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Products getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}
}
