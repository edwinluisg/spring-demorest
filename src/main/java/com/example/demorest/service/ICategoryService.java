package com.example.demorest.service;

import org.springframework.http.ResponseEntity;

import com.example.demorest.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> searchCategories();

}
