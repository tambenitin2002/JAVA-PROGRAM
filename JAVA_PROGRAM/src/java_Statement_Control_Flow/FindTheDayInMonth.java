package java_Statement_Control_Flow;

import java.util.Scanner;

public class FindTheDayInMonth {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Month: ");
		int month=sc.nextInt();
		System.out.println("Enter the Year: ");
		int year=sc.nextInt();
		int NoOfDays=0;
		String monthOfName="UnKnown";
		 
		switch (month) {
		case 1: {
			monthOfName="January";
			NoOfDays=31;
			break;
		}
		case 2: {
			monthOfName="February";
			if(year%4==0) {
			NoOfDays=29;
			}else {
				NoOfDays=28;
			}
			break;
		}
		case 3:{
			monthOfName="March";
			NoOfDays=31;
			break;
		}
		case 4: {
			monthOfName="April";
			NoOfDays=30;
			break;
		}
		case 5:{
			monthOfName="May";
			NoOfDays=31;
			break;
		}
		case 6: {
			monthOfName="Jun";
			NoOfDays=30;
			break;
		}
		case 7: {
			monthOfName="July";
			NoOfDays=31;
			break;
		}
		case 8: {
			monthOfName="August";
			NoOfDays=30;
			break;
		}
		case 9: {
			monthOfName="September";
			NoOfDays=30;
			break;
		}
		case 10: {
			monthOfName="October";
			NoOfDays=30;
			break;
		}
		case 11: {
			monthOfName="Novmber";
			NoOfDays=30;
			break;
		}
		case 12: {
			monthOfName="December";
			NoOfDays=30;
			break;
		}
	
			
		}
//		February 2016 has 29 days
		
		System.out.println(monthOfName + year + " has " + NoOfDays +" days");
		
	}

}
