package com.sunbeam.q1;

import com.sunbeam.q1.Shop;

public class Album implements Shop {
	
	private double price=300,tax=10;
	double totAmount=0,totTax=0;
	
	public Album() {
		super();
		this.price = price;
		this.tax = tax;
		this.totAmount = totAmount;
		this.totTax = totTax;
	}
	

	@Override
	public double[] calcAmount() {
		
		double detailedPrice[]= {0,0};
		
		
		double basicAmount = 300 - (this.price * Shop.discount / 100);
		
		detailedPrice[0]=basicAmount;
		
		detailedPrice[1]= basicAmount*(tax/100);
		
		return detailedPrice;
		
	}

}
