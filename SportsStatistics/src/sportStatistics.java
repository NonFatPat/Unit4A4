import java.util.Scanner;

public class sportStatistics {

	public static void main(String[] args) {
		
		person per = new person(null, 0, 0, 0);
		powerlifting power = new powerlifting(0, 0, 0);
		soccer soc = new soccer(null,0,0,0);
		hockey hoc = new hockey(0,0,0);
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		power.setName(in.next());
		System.out.println("Enter Weight:");
		power.setWeight(in.nextInt());
		System.out.println("Enter Height Feet:");
		power.setHeightft(in.nextInt());
		System.out.println("Enter Height Inches:");
		power.setHeightin(in.nextInt());
		System.out.println("Enter Max Bench");
		power.setBench(in.nextInt());
		System.out.println("Enter Max Squat");
		power.setSquat(in.nextInt());
		System.out.println("Enter Max Deadlift");
		power.setDeadlift(in.nextInt());
		
		System.out.println(power.toString());
		
		System.out.println("Enter Name:");
		soc.setName(in.next());
		System.out.println("Enter Weight:");
		soc.setWeight(in.nextInt());
		System.out.println("Enter Height Feet:");
		soc.setHeightft(in.nextInt());
		System.out.println("Enter Height Inches:");
		soc.setHeightin(in.nextInt());
		System.out.println("Enter Team Name:");
		soc.setTeam(in.next());
		System.out.println("Enter # of Goals:");
		soc.setGoals(in.nextInt());
		System.out.println("Enter # of Blocks:");
		soc.setBlocks(in.nextInt());
		System.out.println("Enter # of Steals:");
		soc.setSteals(in.nextInt());
		
		
		System.out.println(soc.toString());
		
		
		System.out.println("Enter Name:");
		hoc.setName(in.next());
		System.out.println("Enter Weight:");
		hoc.setWeight(in.nextInt());
		System.out.println("Enter Height Feet:");
		hoc.setHeightft(in.nextInt());
		System.out.println("Enter Height Inches:");
		hoc.setHeightin(in.nextInt());
		System.out.println("Enter # of fights:");
		hoc.setFights(in.nextInt());
		System.out.println("Enter # of Penalty:");
		hoc.setGames(in.nextInt());
		System.out.println("Enter # of Games Played:");
		hoc.setpIM(in.nextInt());
		
		
		System.out.println(hoc.toString());
		}
	

}
