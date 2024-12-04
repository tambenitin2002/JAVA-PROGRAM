package program;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num;
		num = sc.nextInt();
		 
		int temp=num;
		int reverse=0;
		while(temp>0) {
			int reminder=temp%10;
			reverse=reverse*10+reminder;
			temp/=10;//num=num/10
			//for 1 iteration reminder 5, reverse 5 because initial reverse is 0
		}
		System.out.println("The Given input is "+ num +" when we perform operations the output is "+reverse);
			
		}
		
		
				
			}
			
		
	


