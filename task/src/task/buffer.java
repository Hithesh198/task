package task;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class DetailsOfEmployee{
	String FirstName;
	String LastName;
	String Hiredate;
	String salary;
	String Age;
	//String DOB;
	
	public DetailsOfEmployee(String firstName, String lastName, String hiredate,
			String salary, String age) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Hiredate = hiredate;
		this.salary = salary;
		Age = age;
		//DOB = dOB;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getHiredate() {
		return Hiredate;
	}
	public void setHiredate(String hiredate) {
		Hiredate = hiredate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	
}

public class buffer {
  // static ArrayList<DetailsOfEmployee> setObj = new ArrayList<>();
	public static void main(String[] args) throws IOException  {
     new buffer().getdata();
      
	}


	void printsal() throws IOException{
		getdata();
	//	 Comparator<? super DetailsOfEmployee> sal;
	     
		
	}
	
	 void getdata()throws IOException{
		File f = new File("F:\\New folder (2)\\DataOfEmployee.csv");
	    BufferedReader rd = new BufferedReader(new FileReader(f));
		String line = null;
		while ((line = rd.readLine()) != null){
		 getLines(line);
	   }
	   rd.close();
	   
	}
	
   void getLines(String line1) {
	     String[] value = line1.split(",");
	     DetailsOfEmployee emp = new DetailsOfEmployee(value[0],value[1],value[2],value[3],value[4]);
	
	System.out.println(emp.getFirstName());
	
	     	
   }

}

