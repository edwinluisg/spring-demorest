package com.example.demorest.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demorest.model.Category;
import com.example.demorest.model.dao.ICategoryDao;
import com.example.demorest.response.CategoryResponseRest;

@Service
public class CategoryServiceImpl implements ICategoryService{
	
	private static final Logger log = LoggerFactory.getLogger(CategoryServiceImpl.class);
	
	@Autowired
	private ICategoryDao categoryDao;
	

	@Transactional(readOnly = true)
	public ResponseEntity<CategoryResponseRest> searchCategories() {
		log.info("init searchCategories");
		CategoryResponseRest response = new CategoryResponseRest();
		try {
			List<Category> category = (List<Category>) categoryDao.findAll();
			response.getCategoriesResponse().setCategories(category);
			response.setMetadata("Response OK", "00", "Response success");
		} catch (Exception e) {
			response.setMetadata("Response NO", "-1", "Response error");
			log.error("Error in searchCategories:", e.getMessage());
			e.getStackTrace();
			return new ResponseEntity<CategoryResponseRest>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<CategoryResponseRest>(response,HttpStatus.OK);
	}

}
