package studentProject;

import java.util.Scanner;

public class SSDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Area ");
		String area=sc.next();		
		School s1=new School("Kendriy Vidyalay",area);
		
		boolean exit=true;
		while(exit) {
			System.out.println("Enter the Choice \n 1. Login \n 2. Logout \n 3. Student Details \n 4. Update std \n 5. Exit");
            int choice=sc.nextInt();
            switch (choice)
            {
            case 1:
            {
            	s1.login();
            }
            break;
            case 2:
            {
            	s1.logout();
            }
            break;
            
            case 3:
            {
            	s1.studentDetails();
            }
            break;
            case 4:
            {
            	s1.updatestd();
            }
            break;
            case 5:
            {
            	exit=false;
            }
            break;
            default:
            {
                System.out.println("Invalid Choice");
            }
            }
		}

	}

}
