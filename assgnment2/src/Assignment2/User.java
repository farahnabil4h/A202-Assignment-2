package Assignment2;

public class User extends ProgramDescription implements payment { //2.1 Inheritance & 2.5 Interface
	
	protected String email;
	protected int session, pax;
	protected char paymentMethod;
	protected double price, rateTaxReduction, totalDonation;
	
	public User() { //empty constructor [because overriding - Overriding is when you call a method on an object and the method in the subclass with the same signature as the one in the superclass is called.]
					//if write printInfo(), output keluar 2 kali 
		
	}
	
	public User(String userName, String email, String contactNumber, String day, int session){ //register participant for soup kitchen program
		super(userName, email, contactNumber);
		this.email = email;
		this.session = session;
		System.out.println("\n----------------------------------------------------------------"
				+ "\nRegistered Details: "
				+"\nName: " +super.getName()
				+ "\nEmail: " +getEmail()
				+ "\nContact number: " +super.getContactNumber()
				+ "\nDay: " +super.getDay()
				+ "\nSession: " +getSession());
	}
	
	public User(String userName, String email, String contactNumber, char paymentMethod) { //register participant for virtual run program
		super(userName, email, contactNumber);
		this.email = email;
		this.paymentMethod = paymentMethod;
		System.out.println("\n----------------------------------------------------------------"
				+ "\nRegistered Details: " 
		+"\nName: " +super.getName()
		+ "\nEmail: " +getEmail()
		+ "\nContact number: " +super.getContactNumber());
		printPaymentMethod();
	}
	
	public User(String userName, String email, String contactNumber, int session, int pax, char paymentMethod) { //use for donating process
		super(userName, email, contactNumber);
		this.email = email;
		this.session = session;
		this.pax = pax;
		this.paymentMethod = paymentMethod;
		System.out.println("\n----------------------------------------------------------------"
				+ "\nRegistered Details: " 
		+"\nName: " +super.getName()
		+ "\nEmail: " +getEmail()
		+ "\nContact number: " +super.getContactNumber());
		if(session == 1)
			price = 3;
		else if(session == 2)
			price = 6.50;
		else if(session == 3)
			price = 4.50;
		totalDonation = getPayment(price);
		System.out.printf("Total price: RM%.2f\n", getTotalDonation());
		if(totalDonation >= 300) {
			this.rateTaxReduction = 4;
			System.out.println("Donation RM300 and above. Rate tax reduction: " +getPayment()+ "%");
		}
		else
			System.out.println("Donation below RM300. No tax reduction.");
		printPaymentMethod();
	
	}
	
	public void printMenu() { //overriding with class - Advertisement and ProgramDescription
		System.out.println("\t\t\t\t\tM E N U\n"
				+ "\nSession 1 - Breakfast with Bihun goreng\t\t\tPrice for 1 pax: RM 3.00"
				+ "\nSession 2 - Lunch with Nasi putih + ikan + sayur\tPrice for 1 pax: RM 6.50"
				+ "\nSession 3 - Dinner with Nasi goreng kampung\t\tPrice for 1 pax: RM 4.50\n");
	}
	
	public void printInfo() { //2.2 Polymorphism - printInfo method
		System.out.println("\nIn this section, you can choose either to register as a participant of Soup Kitchen or "
				+ "\nHope Virtual Run or choose to donate directly to our organisation."
				+ "\nYou can donate by inserting your own prefered amount or by picking our donation set.\n");
	}
	
	public void paymentMethod() {
		System.out.println("Payment Method:"
				+ "\nA. Online banking"
				+ "\nB. Credit/Debit card");
	}
	
	public void printPaymentMethod() {
		if(paymentMethod == 'a' || paymentMethod == 'A')
			System.out.println("Payment method: Online banking");
		else if(paymentMethod == 'b' || paymentMethod == 'B')
			System.out.println("Payment method: Credit/Debit Card");
	}
	
	
	public double getPayment() {
		return this.rateTaxReduction;
	}
	
	public double getPayment(double price) {
		return price * this.pax;
	}
	
	//2.3 Encapsulation - Setter and getter

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSession() {
		return session;
	}

	public void setSession(int session) {
		this.session = session;
	}

	public int getPax() {
		return pax;
	}

	public void setPax(int pax) {
		this.pax = pax;
	}

	public char getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(char paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRateTaxReduction() {
		return rateTaxReduction;
}

	public void setRateTaxReduction(double rateTaxReduction) {
		this.rateTaxReduction = rateTaxReduction;
	}
	
	public double getTotalDonation() {
		return totalDonation;
	}

	public void setTotalDonation(double totalDonation) {
		this.totalDonation = totalDonation;
	}
	
}
