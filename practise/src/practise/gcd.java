package practise;

public class gcd {
 static int  gcd(int a, int b){
	 if(a == 0)
		 return b;
	 else if(b== 0)
	  return a;
	   return gcd(b , (a%b));
 }		 
 public static void main(String[] args){
	 int a=6,b=0;
	 System.out.println(gcd(a,b));
 }

}
		