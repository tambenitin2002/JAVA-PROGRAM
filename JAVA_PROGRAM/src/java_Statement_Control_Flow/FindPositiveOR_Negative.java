package java_Statement_Control_Flow;

import java.util.Scanner;

public class FindPositiveOR_Negative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number!!");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("The Given Number "+num+" is Positive!!!");
		}else {
			System.out.println("The Given Number "+ num+" is Negative!!!");
		}
		
	}

}
