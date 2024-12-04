package program;

import java.util.Scanner;

public class FindNoOfPrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number !! ");
        int num=sc.nextInt();
        int primecount=0;
        for(int a = 1;a<=num; a++) {
        int n=a;
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				
				
				count++;
			}
		}
		if(count==2){
			primecount++;
		   
		  }
        
        }
        System.out.println(primecount);
		
		
	     
        
		}
		
}


