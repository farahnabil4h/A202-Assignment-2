package Assignment2;

public class Finance implements payment{ //2.5 Interface
	
	protected int totalParticipant;
	protected double totalDonation, registrationFee, programExpenses, otherExpenses;
	
	public Finance() {
		setTotalDonation(15000);
		setRegistrationFee(10);
		setTotalParticipant(100);
		setProgramExpenses(7500);
		setOtherExpenses(2500);
		printInfo();
	}
	
	public double getPayment(double registrationFee) {
		return this.totalParticipant * registrationFee;
	}
	
	public double getPayment() { //total income 
		return this.totalDonation + this.getPayment(registrationFee) - this.calcTotalExpenses();
	}
	
	public double calcTotalExpenses() {
		return this.programExpenses + this.otherExpenses;
	}
	
	public void printInfo() { //2.2 Polymorphism - printInfo method
		System.out.printf("----------------------------------------------------------------\n"
				+ "\nHope Soup Kitchen's Finance\n"
				+ "\nTotal donation: RM%.2f"
				+ "\nRegistration fee: RM%.2f"
				+ "\nTotal participant: " +getTotalParticipant()
				+ "\nTotal registration fee: RM%.2f"
				+ "\nTotal expenses: RM%.2f"
				+ "\nTotal income: RM%.2f", getTotalDonation(), getRegistrationFee(), getPayment(registrationFee), calcTotalExpenses(), getPayment());
	}
	
	//2.3 Encapsulation - Setter and getter

	public int getTotalParticipant() {
		return totalParticipant;
	}

	public void setTotalParticipant(int totalParticipant) {
		this.totalParticipant = totalParticipant;
	}

	public double getTotalDonation() {
		return totalDonation;
	}

	public void setTotalDonation(double totalDonation) {
		this.totalDonation = totalDonation;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public double getProgramExpenses() {
		return programExpenses;
	}

	public void setProgramExpenses(double programExpenses) {
		this.programExpenses = programExpenses;
	}

	public double getOtherExpenses() {
		return otherExpenses;
	}

	public void setOtherExpenses(double otherExpenses) {
		this.otherExpenses = otherExpenses;
	}
	
}
