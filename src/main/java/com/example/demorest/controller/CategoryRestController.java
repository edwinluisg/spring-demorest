package com.example.demorest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demorest.response.CategoryResponseRest;
import com.example.demorest.service.ICategoryService;

@RestController
@RequestMapping("/v1")
public class CategoryRestController {
	
	@Autowired
	private ICategoryService service;
	
	@GetMapping("/categories")
	public  ResponseEntity<CategoryResponseRest> consultaCategory() {
		ResponseEntity<CategoryResponseRest> response = service.searchCategories();
		return response;
	}
	
	@GetMapping("/categories/{id}")
	public  ResponseEntity<CategoryResponseRest> consultaCategoryId(@PathVariable Long id) {
		ResponseEntity<CategoryResponseRest> response = service.searchCategoriesId(id);
		return response;
	}
	
}
