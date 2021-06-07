package Assignment2;

public class ProgramDescription extends HopeSoupKitchen{ //2.1 Inheritance 
	
	protected String time, day, date;
	protected double programFee;
	
	public ProgramDescription(){ 
		printInfo();
		
	}
	
	public ProgramDescription(String programName, String location, String day){ 
		super(programName, location, day);
		this.day = day;
		
		if(programName.equals("Soup Kitchen")) {
			System.out.println("Program Details:"
					+ "\nName:     " +super.getName()
					+ "\nLocation: " +super.getLocation()
					+ "\nDay:      " +getDay());
			setTime("9am until 8pm");
			System.out.println("Time:     " +getTime());
			printMenu();
		}
		
		else if(programName.equals("Hope Virtual Run")) {
			System.out.println("Program Details:"
					+ "\nName:     " +super.getName()
					+ "\nLocation: " +super.getLocation()
					+ "\nDay:      " +getDay());
			setTime("10am until 1pm");
			setDate("17 July 2021");
			setProgramFee(10);
			System.out.println("Time:     " +getTime());
			System.out.println("Date:     " +getDate());
			System.out.printf("Fee:      RM%.2f\n", getProgramFee());
			System.out.println("\n----------------------------------------------------------------");
		}
		
	}
	
	public void printInfo() { //2.2 Polymorphism - printInfo method
		super.printInfo();
		System.out.println("\nSince our country is currently undergoing PKP, below are the only ongoing programs:"
				+ "\n1. Soup Kitchen"
				+ "\n2. Hope Virtual Run\n");
	}
	
	public void printMenu() { 	//overriding with class - User and Advertisement
								//shows the food menu available for participants in soup kitchen program
		System.out.println("\nM E N U"
				+ "\nSession 1 - Breakfast with Bihun goreng"
				+ "\nSession 2 - Lunch with Nasi putih + ikan + sayur"
				+ "\nSession 3 - Dinner with Nasi goreng kampung\n");
	}
		
	//2.3 Encapsulation - Setter and getter

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getProgramFee() {
		return programFee;
	}

	public void setProgramFee(double programFee) {
		this.programFee = programFee;
	}
	
}
