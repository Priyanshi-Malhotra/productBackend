package com.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.entities.ProductEntities;
import com.backend.entity.ProductEntity;

@RestController
public class ProductController {
	
	List<ProductEntity> list=new ArrayList<>();
	
	@Autowired
	public ProductEntities productEntities;

	@RequestMapping("products/getId")
	public ProductEntity getProduct(@RequestParam(name="id") int id) {
		return productEntities.getEntity(id);
	}
}
