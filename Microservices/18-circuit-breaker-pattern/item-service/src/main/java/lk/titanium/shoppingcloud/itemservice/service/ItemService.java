package lk.titanium.shoppingcloud.itemservice.service;

import lk.titanium.shoppingcloud.model.item.Item;

import java.util.List;

public interface ItemService {

    Item save(Item item);
    Item findById(int id);
    List<Item> findAll();
}
