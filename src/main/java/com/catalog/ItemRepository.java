package com.catalog;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

//@Component
public interface ItemRepository extends CrudRepository<ItemEntity, Long> {
	
	 //create new item 
	ItemEntity save(ItemEntity persisted);
	
	//find item by ID.
	Optional<ItemEntity> findById(Long itemNumber);
	
	//delete item
	void deleteById (Long itemId);
	
	//return list of all items
	List<ItemEntity> findAll();

	
}
