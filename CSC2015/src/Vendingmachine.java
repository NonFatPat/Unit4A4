import java.util.*;
public class Vendingmachine {
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Change out = new Change();
		// variables
		double money = 1;
		double ammount = 0;
		double nis = 1.45;
		double hon = 1.55;
		double mit = 2.65;
		double sub = 3.75;
		double bmw = 4.85;
		double change;
		int x;
		
		int Quarters;
		int Dimes;
		int Nickels;
		int Penny;
		// promt user guide
		System.out.println("Keychain Vending machine");
		System.out.println("1) Nissan Emblem\t 1.45 \n2) Honda Emblem\t\t 1.55 \n3) Mitsubishi Emblem\t 2.65 \n4) Subaru Emblem\t 3.75 \n5) BMW Emblem\t\t 4.85 \n ");
		System.out.println("Insert Amount, only takes 1 & 5");
		System.out.println("Press 0 when finished");
		
		
		
		
		//loop to input money
		while (money != 0){
			money = in.nextInt();
			if (money != 1 && money != 5){
				System.out.println("error in bills");
			}
			else
			ammount = ammount + money;
		}
		System.out.println("Current ammount is: " + ammount);
		
		
		if (money < 5 )
			{
			
		
		// switch case to choose the product and out put the change
		System.out.println("select your choice");
		x = in.nextInt();
			
		switch ( x){
		case 0: change = ammount;
			if (change < 0){
			System.out.println("Bro your broke");
		}
		else{
			Quarters = (int) (change / .25);
			double OneChange=change - ( Quarters * .25);

			Dimes = (int) (OneChange / .10);
			double TwoChange = OneChange - (Dimes *.10);

			Nickels= (int) (TwoChange / .05);
			double ThreeChange= TwoChange - (Nickels * .05);

			Penny = (int) (ThreeChange / .01);
					 
			System.out.println ("Your change is:" +  "\nQuarter: "+ Quarters + "\nDimes: " + Dimes + "\nNickel: " + Nickels + "\nPenny: " + Penny); // replace with method which give out exact change in quarters dimes nickles and pennies
		}
		break;
		case 1: change = ammount - nis;
				out.setChange(change);
				if(change < 0){
					System.out.println("Insufficent funds");
				}
				else{
					Quarters = (int) (change / .25);
					double OneChange=change - ( Quarters * .25);

					Dimes = (int) (OneChange / .10);
					double TwoChange = OneChange - (Dimes *.10);

					Nickels= (int) (TwoChange / .05);
					double ThreeChange= TwoChange - (Nickels * .05);

					Penny = (int) (ThreeChange / .01);
							 
					System.out.println ("Your change is:" +  "\nQuarter: "+ Quarters + "\nDimes: " + Dimes + "\nNickel: " + Nickels + "\nPenny: " + Penny); // replace with method which give out exact change in quarters dimes nickles and pennies
				}
				break;
		case 2: change = ammount - hon;
				out.setChange(change);
				if(change < 0){
					System.out.println("Insufficent funds");
				}
				else{
					Quarters = (int) (change / .25);
					double OneChange=change - ( Quarters * .25);

					Dimes = (int) (OneChange / .10);
					double TwoChange = OneChange - (Dimes *.10);

					Nickels= (int) (TwoChange / .05);
					double ThreeChange= TwoChange - (Nickels * .05);

					Penny = (int) (ThreeChange / .01);
							 
					System.out.println ("Your change is:" +  "\nQuarter: "+ Quarters + "\nDimes: " + Dimes + "\nNickel: " + Nickels + "\nPenny: " + Penny); // replace with method which give out exact change in quarters dimes nickles and pennies
				}
				break;
		case 3: change = money - mit;
				out.setChange(change);
				if(change < 0){
					System.out.println("Insufficent funds");
				}
				else{
					Quarters = (int) (change / .25);
					double OneChange=change - ( Quarters * .25);

					Dimes = (int) (OneChange / .10);
					double TwoChange = OneChange - (Dimes *.10);

					Nickels= (int) (TwoChange / .05);
					double ThreeChange= TwoChange - (Nickels * .05);

					Penny = (int) (ThreeChange / .01);
							 
					System.out.println ("Your change is:" +  "\nQuarter: "+ Quarters + "\nDimes: " + Dimes + "\nNickel: " + Nickels + "\nPenny: " + Penny); // replace with method which give out exact change in quarters dimes nickles and pennies
				}
				break;
		case 4: change = ammount - sub;
				out.setChange(change);
				if(change < 0){
					System.out.println("Insufficent funds");
				}
				else{
					Quarters = (int) (change / .25);
					double OneChange=change - ( Quarters * .25);

					Dimes = (int) (OneChange / .10);
					double TwoChange = OneChange - (Dimes *.10);

					Nickels= (int) (TwoChange / .05);
					double ThreeChange= TwoChange - (Nickels * .05);

					Penny = (int) (ThreeChange / .01);
							 
					System.out.println ("Your change is:" +  "\nQuarter: "+ Quarters + "\nDimes: " + Dimes + "\nNickel: " + Nickels + "\nPenny: " + Penny); // replace with method which give out exact change in quarters dimes nickles and pennies
				}
				break;
		case 5: change = ammount - bmw;
				out.setChange(change);
				if(change < 0){
					System.out.println("Insufficent funds");
				}
				else{
					Quarters =  (int) (change / .25);
					double OneChange=change - ( Quarters * .25);

					Dimes = (int) (OneChange / .10);
					double TwoChange = OneChange - (Dimes *.10);

					Nickels= (int) (TwoChange / .05);
					double ThreeChange= TwoChange - (Nickels * .05);

					Penny = (int) (ThreeChange / .01);
							 
					System.out.println ("Your change is:" +  "\nQuarter: "+ Quarters + "\nDimes: " + Dimes + "\nNickel: " + Nickels + "\nPenny: " + Penny); // replace with method which give out exact change in quarters dimes nickles and pennies
				}
				break;
		default: System.out.println("error wrong selection");
			
				}
			
			}
		else{
			System.out.println("Incorrect Bill");
			in.close();
		}
	}

}
