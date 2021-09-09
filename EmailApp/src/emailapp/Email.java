package emailapp;
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity=50;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	//constructor to recieve the first and last name
	public Email(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
		//System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		
		//call a method asking for department, return department.
		this.department = setDepartment();
		//System.out.println("Department is : "+this.department);
		
		//call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : "+this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		//System.out.println("Your email is : "+email);
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.println("Department codes\n 1 for sales\n 2 for Development\n 3 for accounting\n 0 for none Enter the department code: ");
		Scanner in = new Scanner(System.in);
		int depchoice = in.nextInt();
		if (depchoice == 1) { return "sales"; }
		else if (depchoice == 2) { return "dev"; }
		else if (depchoice == 3) { return "acc"; }
		else {return "";}
	}
	
	//Generate a random password
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*?";
			char[] password = new char[length];
			for(int i=0; i<length; i++) {
				int rand = (int) (Math.random()* passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password);
		}
	
	//set mailbox capacity
		public void setMailboxCapacity(int capacity) {
			this.mailBoxCapacity = capacity;	
		}
	
	//set alternate email
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
	
	//change password
		public void changePassword(String password) {
			this.password = password;
		}
		
		//Instead of defining and interacting with these properties direwctly we are accessing them through methods
		// Thats is about Encapsulation databinding and data hiding
		public int getMailBoxCapacity() {
			return mailBoxCapacity;
			}
		public String getAlternateEmail() {
			return alternateEmail;
			}
		
        public String showInfo() {
	    return "DISPLAY NAME: "+firstName+" "+lastName+
			"\nCOMPANY EMAIL: "+email+
			"\nMAILBOX CAPACITY: "+mailBoxCapacity+"mb";
}
}
	
