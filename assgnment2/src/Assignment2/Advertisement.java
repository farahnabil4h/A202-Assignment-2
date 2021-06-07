package Assignment2;

public class Advertisement extends HopeSoupKitchen { //2.1 Inheritance
	
	private String reward, prize;
	protected double rateTaxReduction;
	
	public Advertisement() {
		printInfo();
	}
	
	public Advertisement(String name, String location, String contactNumber) {
		super(name, location, contactNumber);
		System.out.println("\n" + "\n----------------------------------------------------------------\n" +super.getName()
				+"\nLocation: " +super.getLocation());
		
		if(name.equals("Soup Kitchen")) { //promoting program soup kitchen and donation
			setRateTaxReduction(4);
			printMenu();
			System.out.println("\nFor participants: You can get all of this for free so don't forget to register your session!"
					+ "\nFor donators: If your total donation is at least RM300 and above, you can claim for about " +getRateTaxReduction()+ "% of tax reduction!"
					+ "\nYour generosity and kindness are gratefully appreciated."
					+ "\nDonation page:\thttps://hopesoupkitchen.com/donation/");
		}
		
		else if(name.equals("Hope Virtual Run")) { //promoting program virtual run
			setPrize("medal");
			setReward("e-certificate");
			System.out.println("Running while donating - nothing can more be appealing than being healhty while helping others at the same time."
					+ "\nBesides that, in this competition, the top three runners will be given " +getPrize()+ " each and all participants will receive an " +getReward() +"."
					+ "\nLet's run for a better us!");
		}
		
		else if(name.equals("Hope Soup Kitchen")) { //promoting organization
			website();
			socialMedia();
		}
		
		System.out.println("Contact Number: " +super.getContactNumber());
		
	}
	
	public void printInfo() { //2.2 Polymorphism - printInfo method
		System.out.println("\nAdvertisement"
				+ "\nThere are many benefits that you can gain by joining our programs. \nBelow are some benefits that you can achieve: ");
	}
	
	public void printMenu() { //overriding with class - User and ProgramDescription
		System.out.println("\t\t\t\t\tM E N U\n"
				+ "\nSession 1 - Breakfast with Bihun goreng\t\t\tPrice for 1 pax: RM 3.00"
				+ "\nSession 2 - Lunch with Nasi putih + ikan + sayur\tPrice for 1 pax: RM 6.50"
				+ "\nSession 3 - Dinner with Nasi goreng kampung\t\tPrice for 1 pax: RM 4.50\n");
	}
	
	public void socialMedia() { 
		System.out.println("For more updates, find us on:"
				+ "\nInstagram - \t@hopesoupkitchen"
				+ "\nTwitter - \t@hopesoupkitchen");
	}
	
	public void website() {
		System.out.println("For more informations, visit: "
				+ "\nMain page:\thttps://hopesoupkitchen.com/"
				+ "\nProgram page:\thttps://hopesoupkitchen.com/available-programs/");
	}
	
	//2.3 Encapsulation - Setter and getter

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public double getRateTaxReduction() {
		return rateTaxReduction;
	}
	
	public void setRateTaxReduction(double rateTaxReduction) {
		this.rateTaxReduction = rateTaxReduction;
	}
	
}
