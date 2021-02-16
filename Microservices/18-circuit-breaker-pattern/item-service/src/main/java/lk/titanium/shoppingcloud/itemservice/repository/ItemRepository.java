package lk.titanium.shoppingcloud.itemservice.repository;

import lk.titanium.shoppingcloud.model.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
