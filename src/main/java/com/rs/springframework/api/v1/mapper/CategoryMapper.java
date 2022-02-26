package com.rs.springframework.api.v1.mapper;

import com.rs.springframework.api.v1.model.CategoryDTO;
import com.rs.springframework.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

/**
 * created by rs 2/23/2022.
 */

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper INSTANCE= Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
