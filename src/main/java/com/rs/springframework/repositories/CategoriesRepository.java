package com.rs.springframework.repositories;

import com.rs.springframework.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by rs 2/18/2022.
 */
public interface CategoriesRepository extends JpaRepository<Category, Long> {

}
