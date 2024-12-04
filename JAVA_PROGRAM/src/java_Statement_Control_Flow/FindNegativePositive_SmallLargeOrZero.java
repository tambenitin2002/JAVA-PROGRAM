package java_Statement_Control_Flow;

import java.util.Scanner;

public class FindNegativePositive_SmallLargeOrZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Number!!!");
		int num=sc.nextInt();
		if(num>0) {
			if(num<1){
				System.out.println("The Number is Small Positive!!!");
			}else if(num>1000000) {
				System.out.println("The Number is Large Positive!!!");
			}
		}else if(num<0) {
			if(num<-1) {
				System.out.println("The Number Small Negative!!!");
			}else if(num>-1000000) {
				System.out.println("The Number Large Negative!!!");
			}
		}else {
			System.out.println("The Number is Zero!!!");
		}
	}

}
