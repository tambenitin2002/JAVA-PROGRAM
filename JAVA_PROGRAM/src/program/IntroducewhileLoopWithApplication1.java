package program;

import java.util.Scanner;

public class IntroducewhileLoopWithApplication1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean status=true;
		while(status) {
			System.out.println("Select following one  Operations !!");
			System.out.println(" 1. Transfer Money !! ");
			System.out.println(" 2. View History !!");
			System.out.println(" 3. View Bank Details !! ");
			System.out.println(" 4. Check Balance !! ");
			System.out.println(" 5. Exit !! ");
			
			System.out.print(" Enter Your Operation Number : ");
			
			int ch=sc.nextInt();
			 if(ch==1) {
				 System.out.println(" Transfer Money !! ");
				  
			 }else if(ch==2) {
				 System.out.println(" View History !! ");
			 }else if(ch==3) {
				 System.out.println(" 3. View Bank Details !! ");
			 }else if(ch==4) {
				 System.out.println(" 4. Check Balance !! ");
			 }else if(ch==5) {
				 status=false;
			 }
			 
			 System.out.println("********************************************************");
		}
	}

}
