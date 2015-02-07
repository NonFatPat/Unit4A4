import javax.swing.JOptionPane;

public class UserInput {
	public static String userinput;
	public static String passwordinput;
	
	public static void main(String[] args) {
		Authentication Aut = new Authentication();
		userinput = JOptionPane.showInputDialog(null, "Enter Username");
		passwordinput = JOptionPane.showInputDialog(null, "Enter Password");
		
		
	if(Aut.authentication(userinput,passwordinput)){
			JOptionPane.showMessageDialog(null, "Welcome");
			
		}
		else{
			JOptionPane.showMessageDialog(null, "Invalid");
		}
	}

}
