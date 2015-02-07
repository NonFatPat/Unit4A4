import java.util.Scanner; 

import javax.swing.JOptionPane;

public class Authentication {
	
	static Scanner in = new Scanner(System.in);	
	static String username = "Pat";
	static String password = "123";
	static String userinput;
	static String passwordinput;
	
	
	public static boolean authentication(String userinput, String passwordinput){
		boolean status = false;
		if(username.equalsIgnoreCase(userinput)){
			if(password.equals(passwordinput)){
				status = true;
			}
			else{
			}
		}
		else{
			status = false;
		}
		return status;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter Username");
		userinput = in.next();
		System.out.println("Enter Password");
		passwordinput = in.next();
		
		if(authentication(userinput, passwordinput)){
			System.out.println("welcome");
		}
		else{
			System.out.println("Invalid");
		}
	}
	

}
