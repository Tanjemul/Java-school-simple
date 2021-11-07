package school.management.system;

import java.util.List;
import java.util.ArrayList;

/**
 * create Array list of students and teachers
 * @author islam.tanjemul
 *
 */
public class School {
	
	private List<Teachers> teachers;
	private List<Students> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	
	public School(List<Teachers> teachers,List<Students> students ) {
		this.students = students;
		this.teachers = teachers;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}


	public List<Teachers> getTeachers() {
		return teachers;
	}


	public void addTeachers(Teachers teacher) {
		teachers.add(teacher);
	}


	public List<Students> getStudents() {
		return students;
	}


	public void addStudents(Students student) {
		students.add(student);
	}


	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}


	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}


	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}


	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
		totalMoneySpent += MoneySpent;
		
	}
	
	
	
	
	

}
