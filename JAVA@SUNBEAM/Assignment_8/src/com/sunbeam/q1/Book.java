package com.sunbeam.q1;


public class Book implements Shop {
	
	private double price=250;
	double totAmount,totTax;

	@Override
	public double[] calcAmount() {
		double detailedPrice[]= {0,0};
		totAmount=price-this.discount;
		detailedPrice[0]=totAmount;
		return detailedPrice;			
	}

}
