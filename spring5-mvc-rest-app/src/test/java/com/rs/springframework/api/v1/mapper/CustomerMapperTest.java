package com.rs.springframework.api.v1.mapper;

//import com.rs.springframework.api.v1.model.CustomerDTO;
import com.rs.springframework.model.CustomerDTO;
import com.rs.springframework.domain.Customer;
import com.rs.springframework.model.CustomerDTO;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by rs 2/23/2022.
 */
public class CustomerMapperTest {
    public static final String FIRSTNAME = "Jimmy";
    public static final String LASTNAME = "Fallon";
    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void customerToCustomerDTO() throws Exception {
        //given
        Customer customer = new Customer();
        customer.setFirstname(FIRSTNAME);
        customer.setLastname(LASTNAME);

        //when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        //then
        assertEquals(FIRSTNAME, customerDTO.getFirstname());
        assertEquals(LASTNAME, customerDTO.getLastname());

    }

}