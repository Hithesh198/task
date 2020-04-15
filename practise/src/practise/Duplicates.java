package practise;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
		}
		
	sort(array,n);
		int[] temp = new int[array.length];
		int j=0;
	for(int i=0;i<array.length-1;i++){
			if(array[i] != array[i+1]){
				temp[j] = array[i];
				j++;
			}
		}
		temp[j] = array[array.length-1];
		
		
		for(int i=0;i<= j;i++){
			System.out.println(temp[i])
			;
		}
	}
   static void   sort(int[] array,int n){
	   int temp;
	   for(int i=0;i<n-1;i++){
		   for(int j=0;j<n-i-1;j++){
			   if(array[j] > array[j+1]){
				   temp = array[j];
				   array[j] = array[j+1];
				   array[j+1] = temp;
			   }
		   }
	   }
	   
   }
}