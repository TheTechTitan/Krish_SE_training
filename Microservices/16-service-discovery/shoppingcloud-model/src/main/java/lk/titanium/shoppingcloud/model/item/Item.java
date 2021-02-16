package lk.titanium.shoppingcloud.model.item;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="item")
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String type;
    double price;
    int quantity;
    String brand;

}
