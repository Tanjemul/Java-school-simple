package school.management.system;

// This class is responsible to maintain students



public class Students {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * To create a new student initializer.
	 * Fees for every students is $30000 per year.
	 * @param id for students: unique
	 * @param name for students 
	 * @param grade for students
	 */
	
	public Students(int id, String name, int grade) {
		feesPaid = 0;
		feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	
	}
	
	// no alterig student name, id.
	
	
	/**
	 * use to update student grade
	 * @param grade new grade of the student
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * Add the fees to fees paid
	 * @param fees : paid fees
	 */
	public void payFees(int fees) {
	feesPaid += fees;
	School.updateTotalMoneyEarned(fees);
	
	}
// Getters of student
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		
		return (feesTotal - feesPaid);
	}
	
	
}


