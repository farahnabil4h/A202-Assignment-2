package Assignment2;

public abstract class HopeSoupKitchen { //2.4 abstraction - superclass as abstract
	
	protected String name, location, contactNumber;
	private int foundedYear;
	
	public HopeSoupKitchen() { //empty constructor
	}
	
	public HopeSoupKitchen(String name, String location, String contactNumber) {
		this.name = name;
		this.location = location;
		this.contactNumber = contactNumber;
	}

	public void printInfo() { //2.2 Polymorphism - printInfo method
		setName("Hope Soup Kitchen");
		setLocation("Jalan Sultanah, Alor Setar");
		setContactNumber("04123456789");
		System.out.println("Organisation Information"
				+ "\n----------------------------------------------------------------"
				+ "\nOrganisation name: " +getName()
				+ "\nLocation: " +getLocation());
		setFoundedYear(2018);
		System.out.println("Contact number: " +getContactNumber()
				+ "\nEstablishment year: " +getFoundedYear()
				+ "\nOur main mission is to ensure that food, as one of the basic"
				+"\nnecessities, is available to everyone especially those needed."
				+ "\n----------------------------------------------------------------");
	}
	
	//2.3 Encapsulation - Setter and getter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getFoundedYear() {
		return foundedYear;
	}

	public void setFoundedYear(int foundedYear) {
		this.foundedYear = foundedYear;
	}

	public abstract void printMenu(); // 2.4 abstraction - define method as abstract/method that has no implementation
	
}
