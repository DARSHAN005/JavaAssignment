package org.capge.springcoreCol;

public class Order {
	private int orderId;
	private String orderName;
	private String orderCity;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderCity() {
		return orderCity;
	}
	public void setOrderCity(String orderCity) {
		this.orderCity = orderCity;
	}
	public Order(int orderId, String orderName, String orderCity) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderCity = orderCity;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
