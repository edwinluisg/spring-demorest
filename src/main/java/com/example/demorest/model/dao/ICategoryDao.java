package com.example.demorest.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demorest.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
