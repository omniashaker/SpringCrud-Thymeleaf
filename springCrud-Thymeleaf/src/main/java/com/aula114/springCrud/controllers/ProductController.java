package com.aula114.springCrud.controllers;

import com.aula114.springCrud.services.ProductService;
import com.aula114.springCrud.springcrud.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/product")
public class ProductController{
	@Autowired
	private ProductService productService;

	@RequestMapping(value="/products",method=RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("products",productService.listAllProducts());
		return "products";
	}
	
	@RequestMapping("product/{id}")
	public String showProduct(@PathVariable int id,Model model){
		model.addAttribute("product",productService.getProductById(id));
		return "productshow";
	}

	@RequestMapping("product/edit/{id}")
	public String edit(@PathVariable int id,Model model){
		model.addAttribute("product",productService.getProductById(id));
		return "productform";
	}

	@RequestMapping("product/new")
	public String newProduct(Model model){
		model.addAttribute("product",new Product());
		return "productform";
	}
	
	@RequestMapping(value="product",method=RequestMethod.POST)
	public String saveProduct(Product product){
		productService.saveProduct(product);
		return "redirect:/product/"+product.getId();
	}

	@RequestMapping("product/delete/{id}")
	public String delete(@PathVariable int id){
		productService.deleteProduct(id);
		return "redirect:/products";
	}
}
