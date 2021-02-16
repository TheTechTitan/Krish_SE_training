package lk.titanium.shoppingcloud.itemservice.service;

import lk.titanium.shoppingcloud.itemservice.repository.ItemRepository;
import lk.titanium.shoppingcloud.model.item.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;


    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }


    @Override
    public Item findById(int id) {
        Optional<Item> item = itemRepository.findById(id);

        if (item.isPresent())
            return item.get();
        else
            return new Item();

    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }
}
