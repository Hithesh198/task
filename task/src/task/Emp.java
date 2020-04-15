package task;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//import task.AgeComparator.Employee;

public class Emp implements Comparator{
     int empId;
     int age;
     int salary;
      Emp(int x,int y,int z){
    	  this.empId=x;
    	  this.age=y;
    	  this.salary=z;
      }
      public int compare(Object arg0, Object arg1) {
  		Employee13 emp = (Employee13) arg0;
  		Employee13 emp1 = (Employee13) arg1;
  		if(emp.age==emp1.age)  
  			return 0;  
  			else if(emp.age>emp1.age)  
  			return 1;  
  			else  
  			return -1;  
  	
      }
	public static void main(String[] args) {
	   EMP emp=new EMP(10,21,1030);
	   EMP emp1=new EMP(11,18,200);
	   EMP emp2=new EMP(12,19,145);
	   EMP emp3=new EMP(13,23,850);
	   EMP emp4=new EMP(14,24,700);
	   EMP emp5=new EMP(15,35,500);
	   
       ArrayList list=new ArrayList();
       list.add(emp);
       list.add(emp1);
       list.add(emp2);
       list.add(emp3);
       list.add(emp4);
       list.add(emp5);
       
       Collections.sort((list));  
       Iterator it=list.iterator();
     while(it.hasNext()){
         System.out.println(((EMP)it.next()).age);    //how to print age values? 
       }
       
	}

	}

