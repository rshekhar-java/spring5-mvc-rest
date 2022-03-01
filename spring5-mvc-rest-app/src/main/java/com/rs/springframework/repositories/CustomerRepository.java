package com.rs.springframework.repositories;

import com.rs.springframework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by rs 2/23/2022.
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
