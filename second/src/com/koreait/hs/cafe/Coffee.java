package com.koreait.hs.cafe;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee(MenuItem mi) {
		this.name = mi.getName();
		this.price = mi.getPrice();
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
