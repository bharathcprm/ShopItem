package com.shop.item.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.item.entity.Item;
import com.shop.item.repository.ItemRepository;
import com.shop.item.service.ItemService;
import com.shop.item.service.payload.request.ItemRequest;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class ItemControllerTest {
	
	@Autowired
	ItemController itemController;
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	ItemRepository itemRepository;

	
	@Order(1)
	@Test
	public void createItemTest() {
		ItemRequest itemRequest = new ItemRequest();
		itemRequest.setItemId(103);
		itemRequest.setItemName("Apple");
		itemController.createItem(itemRequest);
		Item item = new Item();
		item.setItemId(itemRequest.getItemId());
		item.setItemName(itemRequest.getItemName());
		itemService.createItem(item);
		Item itemResponse = itemRepository.save(item);
		assertThat(itemResponse.getItemId()).isGreaterThan(0);
	}
	
	
	@Order(2)
	@Test
	public void getAllItemsTest() {
		itemController.getAllItems();
		itemService.getAllItems();
		List<Item> listItems = itemRepository.findAll();
		assertThat(listItems.size()).isGreaterThan(0);
	}
	
	
	@Order(3)
	@Test
	public void getAllItemByIdAndNameTest() {
		long itemId=103;
		String itemName="Apple";
		itemController.getAllItemByIdAndName(itemId, itemName);		
		itemService.getAllItemByIdAndName(itemId, itemName);
		List<Item> listItems = itemRepository.findByItemIdAndItemName(itemId, itemName);
		assertThat(listItems.size()).isGreaterThan(0);
	}
	
	
	@Order(4)
	@Test
	public void updateItemTest() {
		ItemRequest itemRequest = new ItemRequest();
		itemRequest.setItemId(103);
		itemRequest.setItemName("Orange");
		itemController.updateItem(itemRequest);
		Item item = new Item();
		item.setItemId(itemRequest.getItemId());
		item.setItemName(itemRequest.getItemName());
		itemService.updateItem(item);
		Item itemResponse = itemRepository.save(item);
		assertThat(itemResponse.getItemId()).isEqualTo(103);
		assertThat(itemResponse.getItemName()).isEqualTo("Orange");
	}
	
	@Order(5)
	@Test
	public void deleteItemTest() {
		long itemId=103;
		itemController.deleteItem(itemId);
	}
}
