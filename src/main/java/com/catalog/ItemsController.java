package com.catalog;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*" )
@RequestMapping ("/catalog")
public class ItemsController {

	@Autowired
	ItemRepository itemRepository;
	
	@PostMapping ("/createItem")
	 public void createItem (@RequestBody ItemEntity item) throws Exception  {
		if (this.checkIfExists(item.getItemNumber())) {
			throw new Exception();
		} else {
		long id = this.itemRepository.save(item).getItemNumber();	
		System.out.println("item #"+ id+ " created");
		}
	 }

	@GetMapping ("/{itemId}")
	public Optional<ItemEntity> getItem (@PathVariable ("itemId") long itemId) {
		 return (this.itemRepository.findById(itemId));
		 //http://localhost:8080/CouponProjectApisV2/companies/17/
	 }
	
	@DeleteMapping("/{itemId}")
	public void deleteItem (@PathVariable ("itemId") long itemId)  {
		this.itemRepository.deleteById(itemId);
	 }
	
	@PutMapping ("/updateItem")
	public void updateItem (@RequestBody ItemEntity item)  {
		this.itemRepository.save(item);
	 } 
	
	@GetMapping ("/getAll")
	public List<ItemEntity> getAllItems()  {
		 return this.itemRepository.findAll();
	}
	
	private boolean checkIfExists (long itemId) {
		if (this.itemRepository.findById(itemId).equals(Optional.empty() )) {
			return false;
		} 
		return true;
	}
}
	
	
	

