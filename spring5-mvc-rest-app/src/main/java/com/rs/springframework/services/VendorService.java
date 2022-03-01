package com.rs.springframework.services;

import com.rs.springframework.api.v1.model.VendorDTO;
import com.rs.springframework.api.v1.model.VendorListDTO;

/**
 * created by rs 2/25/2022.
 */
public interface VendorService {
    VendorDTO getVendorById(Long id);

    VendorListDTO getAllVendors();

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

    void deleteVendorById(Long id);
}
