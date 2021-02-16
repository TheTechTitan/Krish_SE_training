package lk.titanium.shoppingcloud.orderservice.service;

import lk.titanium.shoppingcloud.model.customer.Customer;
import lk.titanium.shoppingcloud.model.item.Item;
import lk.titanium.shoppingcloud.model.order.Order;
import lk.titanium.shoppingcloud.orderservice.model.DetailResponse;
import lk.titanium.shoppingcloud.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order findById(int id) {
        Optional<Order> order = orderRepository.findById(id);

        if (order.isPresent())
            return order.get();
        else
            return new Order();
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public DetailResponse findDetailResponse(int id) {
        Order order=findById(id);
        Customer customer=getCustomer(order.getCustomerId());
        Item item= getItem(order.getItemId());

        return new DetailResponse(order,customer,item);
    }

    private Customer getCustomer(int customerId){

        Customer customer=restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
        return customer;
    }

    private Item getItem(int itemId){

        return restTemplate.getForObject("http://item/services/items/"+itemId,Item.class);
    }


}
