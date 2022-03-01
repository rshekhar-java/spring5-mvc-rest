package com.rs.springframework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * created by rs 2/23/2022.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerListDTO {
    List<CustomerDTO> customers;
}
