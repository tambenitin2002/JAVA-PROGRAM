package java_Statement_Control_Flow;

import java.util.Scanner;

public class FindGreaterNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number1!!");
		int num1=sc.nextInt();
		System.out.println("Enter The Number2!!");
		int num2=sc.nextInt();
		System.out.println("Enter The Number3!!");
		int num3=sc.nextInt();
	   if(num1>num2) 
		   System.out.println("1st Number is Greater!!!");
	   if(num2>num3) {
	   		System.out.println("2nd Number is Greater!!!");
	   }else {
		   System.out.println("3rd Number is Greater!!!");
	   }
	}

}
