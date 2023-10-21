package com.example.demorest.response;

public class CategoryResponseRest extends ResponseRest{

	private CategoryResponse categoriesResponse = new CategoryResponse();

	public CategoryResponse getCategoriesResponse() 
	{
		return categoriesResponse;
	}

	public void setCategoriesResponse(CategoryResponse categoriesResponse) 
	{
		this.categoriesResponse = categoriesResponse;
	}
	
}
