package lk.titanium.shoppingcloud.model.customer;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String firstName;
    private String lastName;
    private String contactNumber;
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Loyalty> loyalties;
}
