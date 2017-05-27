package com.aula114.springCrud.services;

import com.aula114.springCrud.springcrud.Product;


	public interface ProductService{
	
	Iterable <Product> listAllProducts();
	
	Product getProductById(Integer id);
	Product saveProduct(Product product);
	void deleteProduct(Integer id);
}