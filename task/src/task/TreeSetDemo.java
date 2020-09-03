package task;

import java.util.Iterator;
import java.util.TreeSet;

class EMP{
	int empId;
	int age;
	int salary;

	EMP(int empId, int age, int salary) {
		this.empId = empId;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + empId;
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (empId != other.empId)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	public String toString(){
		return this.empId+" "+this.age;
	}
}

class Emp1 implements Comparable<Emp1>{
	public int compareTo(Emp1 arg0) {
		if(this.age==arg0.age)  
		      return 0;  
		   else if(this.age>arg0.age)  
		      return 1;  
		   else  
		      return -1;  
	}
	int empId;
	int age;
	int salary;

	Emp1(int empId, int age, int salary) {
		this.empId = empId;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + empId;
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp1 other = (Emp1) obj;
		if (age != other.age)
			return false;
		if (empId != other.empId)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	public String toString(){
		return this.empId+" "+this.age;
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
			TreeSet setObj = new TreeSet();
			setObj.add(new Emp1(214,18,15000));
			setObj.add(new Emp1(212,21,18900));
			setObj.add(new Emp1(220,24,2150));
			setObj.add(new Emp1(223,15,15000));
		/*	
			TreeSet setObj1 = new TreeSet();
			setObj.add(new Emp(313,17,25000));
			setObj.add(new Emp(318,19,1800));
			setObj.add(new Emp(316,23,2180));
			setObj.add(new Emp(312,16,1505));    */
			Iterator it = setObj.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
	}

}
