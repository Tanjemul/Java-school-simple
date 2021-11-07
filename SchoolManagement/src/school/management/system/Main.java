package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teachers liza = new Teachers(1234, "Liza", 200);
		Teachers maruf = new Teachers(1235, "Maruf", 300);
		List<Teachers> teacherList = new ArrayList<>();
		teacherList.add(maruf);
		teacherList.add(liza);
		
		Students tamanna = new Students(1, "Tamanna", 12);
		Students jamal = new Students(2, "Jamal", 12);
		
		List<Students> studentList = new ArrayList<>();
		studentList.add(jamal);
		studentList.add(tamanna);
		
		School alf = new School(teacherList,studentList);
		
		tamanna.payFees(1500);
		tamanna.payFees(5000);
		jamal.payFees(9000);
		jamal.payFees(4000);
		
		maruf.getSalary();
		
		//System.out.println("Alfaruq Academy has earned :" + tamanna.getFeesPaid() + "\nRemaining: " + tamanna.getRemainingFees() );
		System.out.println("Alfaruq Academy has earned :" + alf.getTotalMoneyEarned());
		System.out.println("Alfaruq Academy has spent as salary payment :" + alf.getTotalMoneySpent());
		System.out.println(jamal.getName() +" has paid: " + jamal.getFeesPaid());
		System.out.println(jamal.getName() +" has yet to pay : " + jamal.getRemainingFees());
	}	

}
