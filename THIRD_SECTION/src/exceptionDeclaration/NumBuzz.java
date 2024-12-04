package exceptionDeclaration;

import java.util.Scanner;

public class NumBuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int rem=num%10;
		if(rem==7 && num%7==0) {
			System.out.println("The Number is Buzz");
		}else {
			throw new NumberIsNotBuzz();
		}
	}

}
