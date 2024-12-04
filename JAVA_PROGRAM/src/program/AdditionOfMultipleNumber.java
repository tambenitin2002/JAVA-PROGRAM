package program;

import java.util.Scanner;

public class AdditionOfMultipleNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int sum=0;
		
		boolean status= true;
		while(status) {
			
			status= false;
			
			int num=sc.nextInt();
				sum+=num;

			
		    char ch=sc.next().charAt(0);
		    if(ch=='+') {
		    	status=true;
		    }
		    	
		}
		System.out.println(sum);
		
	}

}
