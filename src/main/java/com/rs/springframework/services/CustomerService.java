package com.rs.springframework.services;

import com.rs.springframework.api.v1.model.CustomerDTO;

import java.util.List;

/**
 * created by rs 2/23/2022.
 */
public interface CustomerService {
    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);
}
