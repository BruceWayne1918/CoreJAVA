package com.sunbeam.sport;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler{
	
	static final Scanner sc=new Scanner(System.in);
    
	private int runs,inningsPlayed,notOutInnings,ballsFaced;
	
	private int wickets,totBallsBowled,runsGiven;
	
	

	public int getInningsPlayed() {
		return inningsPlayed;
	}

	public void setInningsPlayed(int inningsPlayed) {
		this.inningsPlayed = inningsPlayed;
	}

	@Override
	public void accept() {
		
		super.accept();
		
		System.out.println("Enter Innings : ");
		this.inningsPlayed=sc.nextInt();
		
		if(inningsPlayed>0) {
		System.out.println("Enter Runs : ");
		this.runs=new Scanner(System.in).nextInt();
		
		System.out.println("Enter Not Out Innings : ");
		this.notOutInnings=sc.nextInt();
		
		System.out.println("Enter Balls Faced : ");
		this.ballsFaced=sc.nextInt();
		}
		
				
		System.out.println("Enter Total Balls Bowled : ");
		this.totBallsBowled=sc.nextInt();
		
		if(totBallsBowled>0) {
		System.out.println("Enter Wickets  :");
		this.wickets=new Scanner(System.in).nextInt();
		
		System.out.println("Enter Runs Given as bowler : ");
		this.runsGiven=sc.nextInt();
		}
		
	}

	@Override
	public int getWickets() {

		return this.wickets;
	}
	

	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public String toString() {
		
		return super.toString()+"\n"+" BATTING STATS : "+" runs=" + runs + ", inningsPlayed=" + inningsPlayed + ", notOutInnings="
				+ notOutInnings + ", ballsFaced=" + ballsFaced +"\n"+" BOWLING STATS : "+ ", wickets=" + wickets + ", totBallsBowled="
				+ totBallsBowled + ", runsGiven=" + runsGiven ;
	}

	public int getTotBallsBowled() {
		return totBallsBowled;
	}

	public void setTotBallsBowled(int totBallsBowled) {
		this.totBallsBowled = totBallsBowled;
	}

	@Override
	public double getEconomy() {
		return (runs/totBallsBowled)*6;
	}

	@Override
	public int getRuns() {
		
		return runs;
	}
	
	

	@Override
	public double getBattingStrikerate() {
		
		
		return (runs/ballsFaced)*100;
	}

	@Override
	public double getBattingAverage() {
		double avg=(runs/matchesPlayed)-notOutInnings;
		return 0;
	}

	@Override
	public double getBowlingAvg() {
		double avg=runsGiven/wickets;
		
		return 0;
	}

	@Override
	public double getBowlingStrikerate() {
		
		return totBallsBowled/wickets;
	}

	
	/*Create an abstract Player class with id, name, age, and matchesPlayed as ﬁelds. Create a Batter interface with methods like getRuns(), getAverage(), and
	getStrikeRate(). Creater a Bowler interface with methods like getWickets(), and getEconomy(). Create a class Cricketer (with ﬁelds like runs, wickets, etc.)
	inherited from Player as well as Batter and Bowler interfaces. In all classes write appropriate constructors, getter/setters, accept(), toString(), and
	equals() methods. In main(),
	
	 create a team (array) of 11 players and input their details from end user. 
	 Create a new (utilility) class Players that contains
	static methods to 
	count number of batters, 
	number of bowlers, 
	total batter runs, 
	total bowler wickets, 
	return a batter with maximum runs,
	return a
	bowler with maximum wickets.
	
	*/

}
