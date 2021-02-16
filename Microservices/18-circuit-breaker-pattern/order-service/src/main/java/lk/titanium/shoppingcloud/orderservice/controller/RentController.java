package lk.titanium.shoppingcloud.orderservice.controller;

import lk.titanium.shoppingcloud.model.order.Order;
import lk.titanium.shoppingcloud.orderservice.model.Response;
import lk.titanium.shoppingcloud.orderservice.model.SimpleResponse;
import lk.titanium.shoppingcloud.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/services/orders")
public class RentController {

    @Autowired
    OrderService orderService;

    @PostMapping
    public Order save(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping(value = "/{id}")
    public Response getOrder(@PathVariable int id, @RequestParam(required = false) String type) throws ExecutionException, InterruptedException {

        if(type==null){
            return  new SimpleResponse(orderService.findById(id));
        }else{
            return orderService.findDetailResponse(id);
        }
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }
}
