package task;

import task.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Emp1 {

	int empId;
	int age;
	int salary;

	Emp1(int empId, int age, int salary) {
		this.empId = empId;
		this.age = age;
		this.salary = salary;
	}
}

public class EmployeeDetails {
	public static void main(String[] args) {
		//Emp1 emp = new Emp1(21, 23, 100);
	/*	Emp1 emp1 = new Emp1(22, 32, 450);
		Emp1 emp2 = new Emp1(31, 65, 321);
		Emp1 emp3 = new Emp1(41, 20, 646);
		Emp1 emp4 = new Emp1(31, 21, 287);
		Emp1 emp5 = new Emp1(65, 41, 190);
*/
		SortedSet<Emp1> employeeList = new TreeSet<Emp1>();
		employeeList.add(new Emp1(21, 23, 100));
		employeeList.add( new Emp1(22, 32, 450));
		employeeList.add(new Emp1(41, 20, 646));
	/*	employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);*/

		Iterator it = employeeList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
