import javax.swing.JOptionPane;

import java.util.Scanner;

public class Temp {
	static Scanner in = new Scanner(System.in);
	static public int set;
	public static int  grid [] [] = new int [12] [2];
	
	public static void main(String[] args){
		//Month month = Month.JANUARY;
		//JOptionPane.showMessageDialog(null,month.toString());
		inputTempForYear();
		calculateAverageHigh();
		calculateAverageLow();
		findHighestTemp(grid);
		findLowestTemp(grid);
		for(Month mon: Month.values())
			System.out.printf("%s\t%s\t%s\n", mon, mon.getHigh(), mon.getLow());
	}
	
	public static enum Month{
		JANUARY		(grid [0][0], grid [0][1] ),
		FEBUARY 	(grid [1][0], grid [1][1] ), 
		MARCH 		(grid [2][0], grid [2][1] ), 
		APRIL 		(grid [3][0], grid [3][1] ), 
		MAY			(grid [4][0], grid [4][1] ), 
		JUNE		(grid [5][0], grid [5][1] ), 
		JULY		(grid [6][0], grid [6][1] ),
		AUGEST		(grid [7][0], grid [7][1] ),
		SEPTEMBER	(grid [8][0], grid [8][1] ), 
		OCTOBER		(grid [9][0], grid [9][1] ), 
		NOVEMBER	(grid [10][0], grid [10][1] ),
		DECEMBER	(grid [11][0], grid [11][1] );
		
		public final int high;
		public final int low;
		Month (int hi, int lo){
			high = hi;
			low = lo;
		}
		public int getHigh(){
			return high;
			}
		public int getLow(){
			return low;
		}
		
	}
	
	public static void inputTempForMonth(){	
			set =in.nextInt();
		}
	
	public static void inputTempForYear(){
		System.out.println("Enter High and Low for the Month");
		System.out.println("Enter " + grid.length + " rows and " + grid[0].length + " columns: ");
		
				for (int row = 0; row < grid.length; row++) {
					//System.out.println(Month.values()[row]);
					System.out.println("Month"+(row+1));
				  for (int column = 0; column < grid[row].length; column++) {
					inputTempForMonth();
				    grid[row][column] = set; 
				  }
				}	
	}
	
	public static void calculateAverageHigh(){
		int sum = (grid [0][0]+
				grid [1][0]+
				grid [2][0]+
				grid [3][0]+
				grid [4][0]+
				grid [5][0]+
				grid [6][0]+
				grid [7][0]+
				grid [8][0]+
				grid [9][0]+
				grid [10][0]+
				grid [11][0])/12;
		
		System.out.println("Average High for the year: "+ sum);
		}
	
	public static void calculateAverageLow(){
		int sum = (grid [0][1]+
				grid [1][1]+
				grid [2][1]+
				grid [3][1]+
				grid [4][1]+
				grid [5][1]+
				grid [6][1]+
				grid [7][1]+
				grid [8][1]+
				grid [9][1]+
				grid [10][1]+
				grid [11][1])/12;
		
		System.out.println("Average Low for the year: "+ sum);		
	}
	
	public static int findHighestTemp(int [][] grid){
		
	        int max = grid[0][0];
	        for (int col = 0; col < grid.length; col++) {
	            for (int row = 0; row < grid[col].length; row++) {
	                if (max < grid[col][row]) {
	                    max = grid[col][row];
	                }
	            }
	        }
	        System.out.println("Highest Temp of the year: "+ max );
	        return max;
	        //
	        
	    }
		
	public static int findLowestTemp(int [][]grid){
		  int min = grid[0][0];
	        for (int col = 0; col < grid.length; col++) {
	            for (int row = 0; row < grid[col].length; row++) { 
	                if (min > grid[col][row]) {
	                    min = grid[col][row];
	                }
	            }
	        }
	        System.out.println("Lowest Temp of the year: "+ min);
			return min;
	    }
	 
	}


