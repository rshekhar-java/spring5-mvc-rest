package com.rs.springframework.services;

import com.rs.springframework.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * created by rs 2/23/2022.
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
