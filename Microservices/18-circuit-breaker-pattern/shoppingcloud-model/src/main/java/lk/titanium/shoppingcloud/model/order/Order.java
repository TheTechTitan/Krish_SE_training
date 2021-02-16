package lk.titanium.shoppingcloud.model.order;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "shopping_order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int orderId;
    int customerId;
    int itemId;
    LocalDateTime orderDate;
    String shippingAddress;
    String orderStatus;
    double netTotal;

}
