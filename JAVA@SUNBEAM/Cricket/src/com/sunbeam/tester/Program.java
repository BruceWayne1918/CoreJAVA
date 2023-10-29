package com.sunbeam.tester;

import com.sunbeam.sport.Cricketer;
import com.sunbeam.sport.Player;

class Program {
	
public static void main(String[] args) {

	
	
Player[] team = new Player[2];

for(int i=0; i<team.length; i++) {
team[i] = new Cricketer();
team[i].accept();
}

//for(Player each :team)
	
//System.out.println(p.toString());

int totalRuns = Players.batterTotalRuns(team);
System.out.println("Total runs of all batters: " + totalRuns);
// ...

System.out.println(" ");
System.out.println("DISPLAYING STATS OF ALL CRICKETERS");
System.out.println("");
for (Player each:team) {
	Players.display(each);
}

}

}