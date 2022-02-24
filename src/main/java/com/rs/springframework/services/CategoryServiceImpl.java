package com.rs.springframework.services;

import com.rs.springframework.api.v1.mapper.CategoryMapper;
import com.rs.springframework.api.v1.model.CategoryDTO;
import com.rs.springframework.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by rs 2/23/2022.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryMapper categoryMapper, CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return null;
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
        return null;
    }
}
