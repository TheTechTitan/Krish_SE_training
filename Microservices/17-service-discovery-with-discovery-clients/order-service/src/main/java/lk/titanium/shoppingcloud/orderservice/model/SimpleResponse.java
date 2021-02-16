package lk.titanium.shoppingcloud.orderservice.model;

import lk.titanium.shoppingcloud.model.order.Order;

public class SimpleResponse implements Response{

    Order order;

    public SimpleResponse(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
