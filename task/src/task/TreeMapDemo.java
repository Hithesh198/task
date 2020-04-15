package task;

import java.util.*;
/*
class Employee13{
    int empId;
    int age;
    int salary;
    Employee13(int empId,int age,int salary){
        this.empId = empId;
        this.age = age;
        this.salary = salary;
    }
    public String toString()
    {
    	return this.empId+" "+this.age;
    }
}
*/
 class sortByAGE implements Comparator<Emp1>{
   
	public int compare(Emp1 emp,Emp1 emp1) {
		
		if(emp.age == emp1.age)
            return 0;
       else if(emp.age > emp1.age)     
            return 1;
            else 
            return -1;
	}
    
}




class Sort_salary implements Comparator<Emp1>{
    public int compare(Emp1 emp, Emp1 emp1) {
		if (emp.salary == emp1.salary)
			return 0;
		else if (emp.salary > emp1.salary)
			return 1;
		else
			return -1;
	} 
}
public class TreeMapDemo{
public static void main(String[] args){
	TreeMap<Emp1,String> tm = new TreeMap<Emp1, String>(new Sort_salary());
        tm.put(new Emp1(212,23,3000), "RAM");
        tm.put(new Emp1(213,32,6000), "JOHN");
        tm.put(new Emp1(214,23,2000), "CRISH");
        tm.put(new Emp1(215,18,2400), "TOM");
        Set<Map.Entry<Emp1, String>> setObj = tm.entrySet();
        for(Map.Entry mapObj : setObj){
            System.out.println(mapObj.getKey()+" "+mapObj.getValue());
        }
      

	   }
	   
	 
  }

