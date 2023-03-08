package goisstudy.springframework.spring6restmvc.services;

import goisstudy.springframework.spring6restmvc.model.CustomerDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {
    Optional<CustomerDTO> getCustomerById(UUID uuid);

    List<CustomerDTO> getAllCustomers();

    CustomerDTO saveNewCustomer(CustomerDTO customer);

    void deleteCustomerById(UUID customerId);

    void updateCustomerById(UUID customerId, CustomerDTO customer);

    void patchCustomerById(UUID customerId, CustomerDTO customer);
}
