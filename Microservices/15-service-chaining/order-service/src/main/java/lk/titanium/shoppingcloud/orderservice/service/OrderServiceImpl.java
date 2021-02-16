package lk.titanium.shoppingcloud.orderservice.service;

import lk.titanium.shoppingcloud.model.customer.Customer;
import lk.titanium.shoppingcloud.model.item.Item;
import lk.titanium.shoppingcloud.model.order.Order;
import lk.titanium.shoppingcloud.orderservice.model.DetailResponse;
import lk.titanium.shoppingcloud.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;


    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Order save(Order customer) {
        return orderRepository.save(customer);
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

        Customer customer=restTemplate.getForObject("http://localhost:8080/services/customers/"+customerId,Customer.class);
        return customer;

    }

    private Item getItem(int itemId){

        return restTemplate.getForObject("http://localhost:9191/services/items/"+itemId,Item.class);
    }


}
