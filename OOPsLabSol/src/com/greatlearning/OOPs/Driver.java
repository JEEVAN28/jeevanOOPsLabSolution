package com.greatlearning.OOPs;
import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		// Scanner Object get input
		Scanner in = new Scanner(System.in);
		// Integer Declaration
		int i = -1;
		// String Declaration
		String department="";
		
		//do {
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("0. Exit");
			// Get Scanner Input
			i = in.nextInt();
			// Switch set department value
			switch (i) {
			case 1 : department = "technical"; 
			break;
			case 2 : department = "admin"; 
			break;
			case 3 : department = "hr"; 
			break;
			case 4 : department = "legal"; 
			break;
			default :
			}
			
			Employee emp = new Employee("Jeevan","Pendhari");
			CredentialService empCS = new CredentialService();
			
			empCS.setfName(emp.getFirstName());
			empCS.setlName(emp.getLastName());
			empCS.setDepartment(department);
			empCS.showCredentials();
			
		//} while (i != 0);
		in.close();
		System.out.println("Exited\n\n");
	}
}
