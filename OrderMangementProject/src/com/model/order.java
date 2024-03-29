package com.model;

public class order {
  private int orderId;
  private String itemName;
  private Double price;
  
  public order() {
	// TODO Auto-generated constructor stub
}

public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

@Override
public String toString() {
	return "order [orderId=" + orderId + ", itemName=" + itemName + ", price=" + price + "]";
}

public order(int orderId, String itemName, Double price) {
	super();
	this.orderId = orderId;
	this.itemName = itemName;
	this.price = price;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}
	

}
