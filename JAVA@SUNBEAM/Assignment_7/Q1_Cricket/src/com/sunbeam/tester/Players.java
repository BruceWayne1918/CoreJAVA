package com.sunbeam.tester;

import com.sunbeam.sport.Batter;
import com.sunbeam.sport.Bowler;
import com.sunbeam.sport.Cricketer;
import com.sunbeam.sport.Player;

public class Players {

	public static int batterTotalRuns(Player[] team) {

		int runs = 0;

		for (Player p : team) {
			if (p instanceof Batter) {
				Batter b = (Batter) p;
				runs = runs + b.getRuns();
			}
		}
		return runs;
	}

	public static int bowlerTotalWickets(Player[] arr) {

		int runs = 0;
		for (Player p : arr) {
			if (p instanceof Bowler) {
				Bowler b = (Bowler) p;
				runs = runs + b.getWickets();
			}
		}

		return runs;

	}

	public static int countBatters(Player[] arr) {

		int runs = 0;

		for (Player p : arr) {
			if (p instanceof Bowler) {
				Cricketer c = (Cricketer) p;

				if (c.getInningsPlayed() > 0) {
					runs = runs + 1;
				}
			}
		}
		return runs;
	}

	public static int countBowlers(Player[] arr) {

		int runs = 0;

		for (Player p : arr) {
			if (p instanceof Bowler) {
				Cricketer c = (Cricketer) p;

				if (c.getTotBallsBowled() > 0) {
					runs = runs + 1;
				}
			}
		}
		return runs;
	}

	public static Player maxRunBatter(Player[] arr) {

		
		int runs=0;
		for (Player p : arr) {
			if (p instanceof Bowler) {
				Cricketer c = (Cricketer) p;

				if (c.getRuns() > runs) {
					runs = c.getRuns();
					return c;
				}
			}
			
			
		}
		
		/*
		for(Player each : arr)
		{
			Cricketer c1 =(Cricketer) each;
			if(c1.getRuns()==runs)
			{
				return c1;
			}
		}
		
		return null;
		*/
		return null;
	}

	public static Player maxWicketBowler(Player[] arr) {

		int runs = 0;

		for (Player p : arr) {
			if (p instanceof Bowler) {
				Cricketer c = (Cricketer) p;

				if (c.getWickets() > 0) {
					runs = c.getWickets();
					return c;
				}
			}
		}
		return null;
	}

	public static void display(Player each) {
		
		System.out.println("-----------------------------------------------------------");
		Cricketer c1=(Cricketer)each;
		System.out.println(c1.toString());		
	}

}
