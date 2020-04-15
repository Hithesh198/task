package task;

class EmployeeDe{
	int empId;
	int age;
	int salary;
	EmployeeDe(int empId,int age,int salary){
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
		EmployeeDe other = (EmployeeDe) obj;
		if (age != other.age)
			return false;
		if (empId != other.empId)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
}
public class equalsAndHashDemo {

	public static void main(String[] args) {
		EmployeeDe emp= new EmployeeDe(12,14,1500);
		EmployeeDe emp1 = new EmployeeDe(12,14,1500);
   System.out.println(emp.equals(emp1));
   if(emp.hashCode()==emp1.hashCode())
	   System.out.println("true");
   else System.out.println("Fasle");
   
	}

}
