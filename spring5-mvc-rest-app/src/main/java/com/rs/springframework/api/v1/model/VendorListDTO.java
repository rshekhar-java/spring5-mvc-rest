package com.rs.springframework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * created by rs 2/25/2022.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorListDTO {
    List<VendorDTO> vendors;
}
