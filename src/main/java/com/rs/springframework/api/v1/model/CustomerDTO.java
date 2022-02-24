package com.rs.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created by rs 2/23/2022.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private String firstname;
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;
}
