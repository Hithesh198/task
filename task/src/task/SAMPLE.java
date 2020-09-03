package task;

import java.util.HashSet;
import java.util.Set;

public class SAMPLE {
	int rollNumber;
	String name;
	

	SAMPLE(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SAMPLE other = (SAMPLE) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}

	
	
	public static void main(String[] args) {
		 Set<SAMPLE> s = new HashSet<SAMPLE>(); 
	        s.add(new SAMPLE(14, "Juneja")); 
	        s.add(new SAMPLE(14, "Juneja")); 
	        System.out.println(s.contains(new SAMPLE(14, "Juneja"))); 
	        System.out.println();
	}

}
