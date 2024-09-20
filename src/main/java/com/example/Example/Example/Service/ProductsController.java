 package com.example.Example.Example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Example.Example.Model.Products;
import com.example.Example.Example.Service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	private ProductsService service;
	
	@GetMapping
	public List<Products> getAllProducts(){
		return service.getAllProducts();
	}
}
