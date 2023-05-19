package com.shop.item.service;


import java.util.List;

import com.shop.item.entity.Item;

public interface ItemService {

	Item createItem(Item item);

	Item updateItem(Item item);

	void deleteItem(Long itemId);

	List<Item> getAllItems();

	List<Item> getAllItemByIdAndName(long itemId, String itemName);
}
