package org.jjiinfo.product.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.jjiinfo.product.model.Product;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductControllerTest {
	
	MockMvc mockMvc;
	
	@Autowired
	ProductController productController;
	
	@Before
	public void setup() {
		mockMvc = standaloneSetup(this.productController).build();
	}

	
	@Test
	public void getProductByID() throws Exception {
		Product p = new Product("One Plus");
		 mockMvc.perform(get("/product/1"))
		 .andExpect(status().isOk())
		 .andDo(print());
		
		
	}

}
