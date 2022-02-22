package com.rs.springframework.api.v1.mapper;

import com.rs.springframework.api.v1.model.CategoryDTO;
import com.rs.springframework.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * created by rs 2/22/2022.
 */
@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    CategoryDTO categoryToCategoryDTO(Category category);
}
