package com.rs.springframework.controllers.v1;

import com.rs.springframework.model.CustomerDTO;
//import com.rs.springframework.api.v1.model.CustomerListDTO;
import com.rs.springframework.model.CustomerListDTO;
import com.rs.springframework.services.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * created by rs 2/23/2022.
 */

@RestController
@Api(description = "This is my Customer Controller")
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @ApiOperation(value = "This will get a list of customers.", notes = "These are some notes about the API.")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CustomerListDTO getListOfCustomers(){

//        return new CustomerListDTO(customerService.getAllCustomers());

        CustomerListDTO customerListDTO = new CustomerListDTO();
        customerListDTO.getCustomers().addAll(customerService.getAllCustomers());
        return customerListDTO;

    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public com.rs.springframework.model.CustomerDTO getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO createNewCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.createNewCustomer(customerDTO);
    }

    @PutMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomerByDTO(id, customerDTO);
    }

    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO patchCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
        return customerService.patchCustomer(id, customerDTO);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomerById(id);
    }
}
