package practise;

public class constructor1 {

	public static void main(String[] args) {
		  int number = 14;
		  if((isprime(number)) ==  true)
			  System.out.println("yes it is a prime number ");
		  else
			  System.out.println("no it is not a prime number");
		  
		
	}
static boolean isprime(int number){
	for(int i=2;i<number/2;i++){
		if(number%2 == 0)
			return false;
	}
	return true;
}
}
