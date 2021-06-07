package Assignment2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ProgramDescription organisation_program = new ProgramDescription(); //shows organization info & available programs
		ProgramDescription program1 = new ProgramDescription("Soup Kitchen", "Jalan Sultanah, Alor Setar", "Monday to Saturday");
		ProgramDescription program2 = new ProgramDescription("Hope Virtual Run", "Home or anywhere you are", "Saturday");
		
		System.out.print("Login in as:"
				+ "\n1. User"
				+ "\n2. Admin"
				+ "\nEnter your choice: ");
		int login = sc.nextInt();
		
		if (login == 1){
			User userInfo = new User();
			
			System.out.print("Which action would you like to proceed:"
					+ "\n1. Registering for program Soup Kitchen"
					+ "\n2. Registering for program Hope Virtual Run"
					+ "\n3. Donating"
					+ "\nEnter action: ");
			int action = sc.nextInt();
			
			System.out.print("Enter name: ");
			String name = sc.next();
			System.out.print("Enter email: ");
			String email = sc.next();
			System.out.print("Enter contact number: ");
			String contactNumber = sc.next();
			
				if(action == 1) {//participant for soup kitchen, the participant receive free foods
			
					userInfo.printMenu();
					System.out.print("Enter day: ");
					String day = sc.next();
					System.out.print("Enter session: ");
					int session = sc.nextInt();
					User participantSoupKitchen = new User(name, email, contactNumber, day, session);
		
				}
			
				else if(action == 2) {//participant for virtual run
					
					double fee = 10;
					System.out.printf("Total fee: RM%.2f\n" ,fee);
					userInfo.paymentMethod();
					System.out.print("Enter payment method: ");
					char paymentMethod = sc.next().charAt(0);
					User participantVirtualRun = new User(name, email, contactNumber, paymentMethod);
		
				}
			
				else if (action == 3) {//Donation's user
					userInfo.printMenu();
					System.out.print("Would you like to donate using the menu set price or your own price?"
						+ "\n1. Menu price "
						+ "\n2. Own price"
						+ "\nEnter choice: ");
					int choice = sc.nextInt();
					
						if (choice == 1) {//donation price refer to menu 
					
							System.out.print("Enter session: ");
							int session = sc.nextInt();
							System.out.print("Enter pax: ");
							int pax = sc.nextInt();
							userInfo.paymentMethod();
					System.out.print("Enter payment method: ");
					char paymentMethod = sc.next().charAt(0);
					User donatorSet = new User(name, email, contactNumber, session, pax, paymentMethod);
					
				}
						else if (choice == 2) {//usually for company members
					System.out.print("Enter total donation: RM");
					double donation = sc.nextDouble();
					userInfo.paymentMethod();
					System.out.print("Enter payment method: ");
					char paymentMethod = sc.next().charAt(0);
					System.out.println("\n----------------------------------------------------------------"
							+ "\nRegistered Details: ");
					System.out.println("Name: " +name);
					System.out.println("Contact number: " +contactNumber);
					System.out.println("Email: " +email);
					System.out.printf("Total donation: RM%.2f\n", donation);
					if(donation >= 300) {
						double rateTaxReduction = 4;
						System.out.println("Donation RM300 and above. Rate tax reduction: " +rateTaxReduction+ "%");
					}
					else
						System.out.println("Donation below RM300. No tax reduction.");
					userInfo.printPaymentMethod();
				}
				
			}
			
			System.out.println("\n----------------------------------------------------------------");
			//user can see the promotion/rewards
			Advertisement advertise = new Advertisement();
			Advertisement advertiseSoupKitchen_Donation = new Advertisement("Soup Kitchen", "Jalan Sultanah, Alor Setar", "04123456789");
			Advertisement advertiseVirtualRun = new Advertisement("Hope Virtual Run", "Home or anywhere you are", "0123456789");
			Advertisement advertiseOrganisation = new Advertisement("Hope Soup Kitchen", "Jalan Sultanah, Alor Setar", "04123456789");
			
			}
		
		else if (login == 2) {//admin access finance
			
			Finance f = new Finance();
		}
		
		else { 
			System.out.println("Invalid!");
			System.exit(0);
			
		}
	}
}
	


