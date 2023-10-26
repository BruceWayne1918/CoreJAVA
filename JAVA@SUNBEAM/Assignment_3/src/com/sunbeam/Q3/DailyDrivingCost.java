package com.sunbeam.Q3;

import java.util.Scanner;

class Drive{
	double totMiles,avgMiles,parkFee,tollsPerDay;
	static final double costPerGallon=106.03*3.78541,toll=55;
	
	public void accept() {
		System.out.println("----------------------------------------------");
		System.out.println("ENTER TOTAL MILES : ");
		this.totMiles=(new Scanner(System.in).nextDouble());
		System.out.println("ENTER VEHICLE'S AVERAGE MILES : ");
		this.avgMiles=(new Scanner(System.in).nextDouble());
		System.out.println("ENTER TOTAL PARKING FEES : ");
		this.parkFee=(new Scanner(System.in).nextDouble());
		System.out.println("ENTER TOTAL NO. OF TOLLS : ");
		this.tollsPerDay=(new Scanner(System.in).nextDouble());	
	}
	
	double calcTotDrivingCost(){return ((this.totMiles/this.avgMiles*costPerGallon) + toll*this.tollsPerDay + this.parkFee);}
	
}

public class DailyDrivingCost {

	public static void main(String[] args) {
		
		Drive D1 = new Drive(); 
		D1.accept();
		
		double cost=D1.calcTotDrivingCost();
		System.out.println("----------------------------------------------");
		System.out.print("COST PER DAY OF DRIVING TO WORK : ");
		System.out.printf("%.2f",cost);
		System.out.printf(" Rs.");
		
		

	}

}

/*The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day. ----------100 km---1.666666667gallon
b) Cost per gallon of gasoline.----------600/gallon = RS.200/ltr
c) Average miles per gallon.-----------60km/gallon
d) Parking fees per day.------------50
e) Tolls per day.-----------2*50=100 

total cost = ((totMiles/avgMiles*costPerGallon) + toll*tollsPerDay + parkFee) =
*
*/