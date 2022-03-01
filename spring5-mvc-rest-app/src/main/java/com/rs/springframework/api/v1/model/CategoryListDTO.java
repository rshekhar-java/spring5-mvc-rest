package com.rs.springframework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * created by rs 2/23/2022.
 */
@Data
@AllArgsConstructor
public class CategoryListDTO {
    List<CategoryDTO> categories;
}
