package lk.titanium.shoppingcloud.customerservice.service;

import lk.titanium.shoppingcloud.model.customer.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    Customer findById(int id);
    List<Customer> findAll();
}
