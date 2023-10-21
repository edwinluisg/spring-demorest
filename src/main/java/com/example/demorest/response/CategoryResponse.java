package com.example.demorest.response;

import java.util.List;

import com.example.demorest.model.Category;

public class CategoryResponse {
	
	private List<Category> categories;

	public List<Category> getCategories() 
	{
		return categories;
	}

	public void setCategories(List<Category> categories) 
	{
		this.categories = categories;
	}

}
