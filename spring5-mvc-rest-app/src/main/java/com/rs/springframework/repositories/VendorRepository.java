package com.rs.springframework.repositories;

import com.rs.springframework.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by rs 2/25/2022.
 */
public interface VendorRepository extends JpaRepository<Vendor,Long> {
}
