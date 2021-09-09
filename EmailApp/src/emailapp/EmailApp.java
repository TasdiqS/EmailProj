package emailapp;
import java.util.Scanner;


public class EmailApp {
	public static void main(String[] args) {
		System.out.println("Enter first name and last name: ");
		Scanner fname = new Scanner(System.in);
		Scanner lname = new Scanner(System.in);
		String ss= fname.nextLine();
		String ss1= lname.nextLine();
		
		Email em1 = new Email(ss,ss1);
		System.out.println(em1.showInfo());
				
		//em1.changePassword(password);
		//em1.setAlternateEmail("shaikhtasdiq@gmail.com");
		//System.out.println(em1.getAlternateEmail());
		//em1.setMailboxCapacity(capacity);
	//	Scanner pw = new Scanner(System.in);
		//String pwo = pw.nextLine();
	}
}