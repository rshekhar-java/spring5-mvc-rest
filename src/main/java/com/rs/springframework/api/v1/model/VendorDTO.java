package com.rs.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created by rs 2/25/2022.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {
    private String name;

    @JsonProperty("vendor_url")
    private String vendorUrl;
}

