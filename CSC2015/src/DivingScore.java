import java.util.Scanner;
public class DivingScore {

	static Scanner in = new Scanner(System.in);
	static double score;
	static double dod;
	static final int SIZE = 7;
	static double judge [] = new double [SIZE];
	
	public static void main(String[] args) {
		
		inputAllScores();
		inputValidDegreeOfDifficulty();
		calculateScore();
	}
	
	public static void inputValidScore(){
		score = in.nextDouble();
	}
	
	public static void inputAllScores(){
		for(int i=0; i<judge.length;i++){
			System.out.println("Enter Score for judge "+ (i+1));
			inputValidScore();
			judge [i] = score;
			}
		}	
	
	public static void inputValidDegreeOfDifficulty(){
		System.out.println("Enter degree of difficulty");
		dod= in.nextDouble();
	}
	
	public static void calculateScore(){
		double max = judge[0];
		for(int j =1;j<judge.length;j++){
			if( judge[j]>max) max = judge[j];
		}
		double min = judge[0];
		for(int k= 1;k<judge.length; k++){
			if (judge[k]<min) min=judge[k];		
		}
		
		 double finalscore=  (double) (dod *(judge [0]+judge [1]+judge [2]+judge [3]+judge [4]+
				judge [5]+judge [6])-(max+min));
		System.out.println("Final Score: "+ finalscore*0.6);
		System.out.println("max "+ max);
		System.out.println("min "+ min);
	}
}
	

