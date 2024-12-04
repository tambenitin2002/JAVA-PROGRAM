package bankManagement;

import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Branch");
		String area=sc.next();
		Bank b=new Bank("SBI",area);
		
		boolean exit=true;
		while(exit) {
			System.out.println("Enter the choice: \n 1. Create Account \n 2. Delete Account \n 3. Account Details \n 4. Update the Details \n 5. Withdraw \n 6. Deposite \n 7. Check Bal \n 8. Change pin \n 9.Exit");
		     int choice=sc.nextInt();
		     switch (choice)
		     {
		     case 1: 
		     {
		    	b.createAccount(); 
		     }
		     break;
		     case 2: 
		     {
		    	 b.deleteAccount();
		     }
		     break;
		     case 3:
		     {
		    	 b.accountDetails();
		     }
		     break;
		     case 4:
		     {
		    	 b.updateDetails();
		     }
		     break;
		     case 5:
		     {
		    	 b.withdraw();
		     }
		     break;
		     case 6:
		     {
		    	 b.deposite();
		     }
		     break;
		     case 7:
		     {
		    	 b.checkBalance();
		     }
		     break;
		     case 8:
		     {
		    	 b.changePin();
		     }
		     break;
		     case 9:
		     {
		    	 exit=false;
		     }
		     default:
		     {
		    	 System.out.println("Invalid Choice ");
		     }
		     }
		}

	}

}
