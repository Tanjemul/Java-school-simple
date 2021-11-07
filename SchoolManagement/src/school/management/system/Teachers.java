package school.management.system;
/**
 * For teachers
 * @author islam.tanjemul
 *
 */

public class Teachers {

	private int id;
	private String name;
	private int salary;
	
	
	/**
	 * Initializer for teacher object
	 */
	
	public Teachers(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		
	}
	
	/**
	 * Return salary, name, id of teachers
	 * @return
	 */
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void getSalary() {
		School.updateTotalMoneySpent(salary);
	}
	
	public void setSalary(int salary) {
		this.salary= salary;
	}
	
}
