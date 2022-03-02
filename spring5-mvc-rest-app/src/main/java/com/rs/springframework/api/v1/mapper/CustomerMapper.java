package com.rs.springframework.api.v1.mapper;

//import com.rs.springframework.api.v1.model.CustomerDTO;
import com.rs.springframework.model.CustomerDTO;
import com.rs.springframework.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * created by rs 2/23/2022.
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper {
        CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

        CustomerDTO customerToCustomerDTO(Customer customer);

        Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
