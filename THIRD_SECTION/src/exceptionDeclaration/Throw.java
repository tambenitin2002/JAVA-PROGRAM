package exceptionDeclaration;

import java.util.Scanner;

public class Throw {

	
		public static void main(String[] args) {
			System.out.println("main start");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num=sc.nextInt();
		    if(num%2==0) {
		    	System.out.println("Even Number ");
		    }else {
		    	throw new NumberOddWException();
		    }
		    System.out.println("main end");
		}

	

}
