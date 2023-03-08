package goisstudy.springframework.spring6restmvc.services;

import goisstudy.springframework.spring6restmvc.model.Customer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {
    Optional<Customer> getCustomerById(UUID uuid);

    List<Customer> getAllCustomers();

    Customer saveNewCustomer(Customer customer);

    void deleteCustomerById(UUID customerId);

    void updateCustomerById(UUID customerId, Customer customer);

    void patchCustomerById(UUID customerId, Customer customer);
}
