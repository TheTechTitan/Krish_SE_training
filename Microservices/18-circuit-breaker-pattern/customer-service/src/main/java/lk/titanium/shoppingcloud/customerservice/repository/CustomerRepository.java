package lk.titanium.shoppingcloud.customerservice.repository;

import lk.titanium.shoppingcloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
