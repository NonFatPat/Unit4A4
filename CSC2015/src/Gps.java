import java.util.Random;
import java.util.Scanner;

public class Gps {
	

	public enum Direction {
		NORTH , EAST, WEST, SOUTH;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x2;
		int y2;
		
		// TODO Auto-generated method stub
		// the number of turns based on 60 miles per hour for an hour drive
		// GPS randomly generates the new direction every 5 minutes
		// 60/5=12
		final int TURNS = 12;
		Random rand = new Random();

		// 0=north, 1= east, 2=south, 3=west int direction;
		
		Direction aDirection = Direction.NORTH;
		for (int i = 0; i < TURNS; i++) {
			System.out.println(aDirection.values()[rand.nextInt(4)]);
			//aDirection = ;
		}
		// System.out.println(aDirection)
		System.out.println(aDirection);
	
		

		switch (aDirection) {
		case NORTH:
			System.out.println("Moving NORTH");
			break;
		case EAST:
			System.out.println("Moving EAST");
			break;
		case WEST:
			System.out.println("Moving WEST");
			break;
		case SOUTH:
			System.out.println("Moving SOUTH");
			break;
		}
		
		System.out.println("Enter # of North");
		int n = in.nextInt();
		System.out.println("Enter # of East");
		int e = in.nextInt();
		System.out.println("Enter # of South");
		int s = in.nextInt();
		System.out.println("Enter # of West");
		int w = in.nextInt();
		
		x2 = e- w;
		y2 = n - s;
		
		
		int x = x2 * x2;
		int y = y2 * y2;
		int d = x + y;
		
		double distance = Math.sqrt(d); 
		System.out.print("Distance is :"+ distance); 
	}

}