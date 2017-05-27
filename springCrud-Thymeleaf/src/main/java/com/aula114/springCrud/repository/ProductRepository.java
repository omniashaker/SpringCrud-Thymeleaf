package com.aula114.springCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.aula114.springCrud.springcrud.Product;

@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
}
