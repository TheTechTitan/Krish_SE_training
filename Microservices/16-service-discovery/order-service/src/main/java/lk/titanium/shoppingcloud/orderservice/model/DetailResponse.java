package lk.titanium.shoppingcloud.orderservice.model;

import lk.titanium.shoppingcloud.model.customer.Customer;
import lk.titanium.shoppingcloud.model.item.Item;
import lk.titanium.shoppingcloud.model.order.Order;

public class DetailResponse implements Response{

    Order order;
    Customer customer;
    Item item;


    public DetailResponse(Order order, Customer customer, Item item) {
        this.order = order;
        this.item = item;
        this.customer = customer;
    }

    public Order getOrder() {
        return order;
    }

    public Item getItem() {
        return item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
