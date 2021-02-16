package lk.titanium.shoppingcloud.itemservice.controller;

import lk.titanium.shoppingcloud.itemservice.service.ItemService;
import lk.titanium.shoppingcloud.model.item.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping
    public Item save(@RequestBody Item item) {
        return itemService.save(item);
    }

    @GetMapping(value = "/{id}")
    public Item getItem(@PathVariable int id)
    {
        System.out.println("request came on "+ LocalDateTime.now() + " ++++++++");
        return itemService.findById(id);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.findAll();
    }

}
