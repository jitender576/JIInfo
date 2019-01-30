package org.jjiinfo.product.controller;

import org.jjiinfo.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

	@GetMapping("/product/{productId}")
	public Product getProductById(@PathVariable String productId) {
		Product product = new Product("One Plus");
		
		return product;
	}
}
