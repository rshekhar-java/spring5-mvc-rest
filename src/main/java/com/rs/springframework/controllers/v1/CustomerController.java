package com.rs.springframework.controllers.v1;

import com.rs.springframework.api.v1.model.CustomerDTO;
import com.rs.springframework.api.v1.model.CustomerListDTO;
import com.rs.springframework.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by rs 2/23/2022.
 */
@Controller
@RequestMapping("/api/v1/customers/")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<CustomerListDTO> getListofCustomers(){

        return new ResponseEntity<CustomerListDTO>(new CustomerListDTO(customerService.getAllCustomers()),
                HttpStatus.OK);

    }

    @GetMapping({"{id}"})
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long id){
        return new ResponseEntity<CustomerDTO>(customerService.getCustomerById(id), HttpStatus.OK);
    }
}
