package com.sunbeam.q1;

public class Toy implements Shop {
	
	private double price=500,vat=5;
	double totAmount,totTax;

	@Override
	public double[] calcAmount() {double detailedPrice[]= {0,0};
	
	double basicAmount= price - (price * Shop.discount / 100);
	
	detailedPrice[0]=basicAmount;
	
	detailedPrice[1]=basicAmount*(vat/100);
	
	return detailedPrice;
	
}

}
