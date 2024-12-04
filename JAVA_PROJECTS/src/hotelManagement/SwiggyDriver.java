package hotelManagement;

import java.util.Scanner;

public class SwiggyDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Swiggy s=new Swiggy(1);
		boolean exit=true;
		while(exit) {
			System.out.println("Welcome to Swiggy \n 1. Place order \n 2. Cancel Order \n 3.Display Order Details \n 4.Update details \n 5.Exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
			{
				s.placeOrder();
			}
			break;
			case 2:
			{
				s.cancelOrder();
			}
			break;
			case 3:
			{
				s.display();
			}
			break;
			case 4:
			{
				s.update();
			}
			break;
			
			case 5:
			{
				exit=false;
				System.out.println("------------------------------- Application is close ---------------------------");
			}
			break;
			default:
			{
				System.out.println("Invalid Choice");
			}
			break;
			}
			
			}
		

	}

}
