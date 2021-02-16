package lk.titanium.shoppingcloud.orderservice.repository;

import lk.titanium.shoppingcloud.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
