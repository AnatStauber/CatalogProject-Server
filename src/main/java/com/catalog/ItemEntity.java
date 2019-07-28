package com.catalog;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class ItemEntity {

	@Id 
//	@Column(name="itemNumber")
	private long itemNumber;
	
//	@Column(name="itemName", nullable=true)
	private String itemName;
	
//	@Column(name="itemAmount", nullable=true)
	private int itemAmount;
	
//	@Column(name="inventoryCode", nullable=true)
	private String inventoryCode;
	
	// constructors
	
		public ItemEntity()  {}
		
		public ItemEntity(long itemNumber, String itemName, int itemAmount, String inventoryCode) {
			super();
			this.itemNumber = itemNumber;
			this.itemName = itemName;
			this.itemAmount = itemAmount;
			this.inventoryCode = inventoryCode;
		}

		//Getters & Setters
		
		public long getItemNumber() {
			return itemNumber;
		}

		public void setItemNumber(long itemNumber) {
			this.itemNumber = itemNumber;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public int getItemAmount() {
			return itemAmount;
		}

		public void setItemAmount(int itemAmount) {
			this.itemAmount = itemAmount;
		}

		public String getInventoryCode() {
			return inventoryCode;
		}

		public void setInventoryCode(String inventoryCode) {
			this.inventoryCode = inventoryCode;
		}

		//toString
		
		@Override
		public String toString() {
			return "Item [itemNumber=" + itemNumber + ", itemName=" + itemName + ", itemAmount=" + itemAmount
					+ ", inventoryCode=" + inventoryCode + "]";
		}
		
	
}
