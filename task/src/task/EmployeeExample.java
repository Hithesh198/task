package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class Employee{
	
	String empName;
    int empId;
    int age;
    int salary;
    int designation;
    
    Employee(String emp_name,int empId, int age,int salary, int des){
    	
    	this.empName = emp_name;
        this.empId = empId;
        this.age = age;
        this.salary = salary;
        this.designation = des;
    }
    
     public String toString(){ 
    	 
        return this.empId + " " + this.empName ; 
    } 
    
}

 class SortAge implements Comparator<Employee13>{
	 
	public int compare(Employee13 emp, Employee13 emp1) {
		
		if (emp.age == emp1.age)
			return 0;
		else if (emp.age > emp1.age)
			return 1;
		else
			return -1;
	} 
 }
 
 class SortDesignation implements Comparator<Employee13>{
	 
	public int compare(Employee13 emp, Employee13 emp1) {
		
		if (emp.designation == emp1.designation)
			return 0;
		else if (emp.designation > emp1.designation)
			return 1;
		else
			return -1;
	} 
}

 class SortDataBySalary implements Comparator<Employee13>{
	 
	public int compare(Employee13 emp, Employee13 emp1) {
		if (emp.salary == emp1.salary)
			return 0;
		else if (emp.salary > emp1.salary)
			return 1;
		else
			return -1;
	} 
 }
 
public class EmployeeExample {

	public static void main(String[] args) {
		
		Employee13 emp = new Employee13("Hithesh", 1, 13, 566, 4);
		Employee13 emp1 = new Employee13("Ravi", 2, 15, 700, 2);
		Employee13 emp2 = new Employee13("Prakash", 13, 21, 1235, 1);
		Employee13 emp3 = new Employee13("Hemanth", 16, 11, 150, 3);

		ArrayList empList = new ArrayList();
		System.out.println(emp);

		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		System.out.println("Sorting BY age:");
		Collections.sort(empList, new SortAge());

		Iterator it = empList.iterator();
		while (it.hasNext()) {
			System.out.println(((Employee13) it.next()));
		}

		System.out.println();
		System.out.println("Sorting BY Desgination:");
		Collections.sort(empList, new SortDesignation());

		Iterator itr1 = empList.iterator();
		while (itr1.hasNext()) {
			System.out.println(((Employee13) itr1.next()));
		}

		System.out.println();
		System.out.println("Sorting BY salary:");
		Collections.sort(empList, new SortDataBySalary());

		Iterator itr = empList.iterator();
		while (itr.hasNext()) {
			System.out.println(((Employee13) itr.next()));
		}

	}
}
