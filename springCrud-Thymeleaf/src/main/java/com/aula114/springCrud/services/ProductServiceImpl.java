package com.aula114.springCrud.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula114.springCrud.springcrud.Product;
import com.aula114.springCrud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	
	
	public Iterable<Product> listAllProducts(){
		return productRepository.findAll();	
	}
	
	
	public Product getProductById(int id){
		return productRepository.findOne(id);	
	}

	
	public Product saveProduct(Product product){
		return productRepository.save(product);	
	}

	public void deleteProduct(int id){
		 productRepository.delete(id);	
	}

	


}
