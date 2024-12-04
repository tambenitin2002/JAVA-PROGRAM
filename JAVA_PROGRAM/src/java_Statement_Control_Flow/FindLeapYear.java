package java_Statement_Control_Flow;

import java.util.Scanner;

public class FindLeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year in YYYY !!");
		int year=sc.nextInt();
		if(year%4==0) {
			System.out.println("This is Leap Year!!");
		}else {
			System.out.println("This is Not Leap Year!!");
		}
	}

}
