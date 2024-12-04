package program;

import java.util.Scanner;

public class ArithmaticOperationWhileLoop {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int sub=0;
		int mul=1;
		int div=1;
		int mod=1;
		boolean status=true;
		while(status) {
			System.out.println(" Choose one operation --> ");
			System.out.println(" 1. Addition !! ");
			System.out.println(" 2. Substraction !! ");
			System.out.println(" 3. Multiplication !! ");
			System.out.println(" 4. Division !! ");
			System.out.println(" 5. Modulas !! ");
			System.out.println(" 6. Exit ");
		    int choose=sc.nextInt();
		    if(choose==1) {
		    	
				System.out.println("You Choose Addition !!");
				boolean status1= true;
				while(status1) {
					
					status1= false;
					
					int num=sc.nextInt();
						sum+=num;

					
				    char ch=sc.next().charAt(0);
				    if(ch=='+') {
				    	status1=true;
				    }
				    	
				}
				System.out.println(sum);
		    }else if(choose==2) {
		    	System.out.println("You Choose Substraction !!");
				
				boolean status1= true;
				while(status1) {
					
					status1= false;
					
					int num=sc.nextInt();
						sub-=num;

					
				    char ch=sc.next().charAt(0);
				    if(ch=='-') {
				    	status1=true;
				    }
				    	
				}
				System.out.println(sub);
		    }else if(choose==3) {
		    	
		    	System.out.println("You Choose Multiplication !!");
				boolean status1= true;
				while(status1) {
					
					status1= false;
					
					int num=sc.nextInt();
					
						mul*=num;
				

					
				    char ch=sc.next().charAt(0);
				    if(ch=='*') {
				    	status1=true;
				    }
				    	
				}
				System.out.println(mul);
		    }else if(choose==4) {
		    	
		    	System.out.println("You Choose Division !!");
				 boolean status1= true;
				while(status1) {
					
					status1= false;
					
					int num=sc.nextInt();
					if(num!=0) {
					div/=num;
					}else {
					    System.out.println("Not Divide by Zero");
					}

					
				    char ch=sc.next().charAt(0);
				    if(ch=='/') {
				    	status1=true;
				    }
				    	
				}
				System.out.println(div);
		    }else if(choose==5) {
		    	
		    	System.out.println("You Choose Modulas !!");
				 boolean status1= true;
				while(status1) {
					
					status1= false;
					
					int num=sc.nextInt();
					if(num!=0) {
						mod%=num;
					}else {
					  System.out.println("cannot perform modulas with zero");	
					}
					
					
				    char ch=sc.next().charAt(0);
				    if(ch=='%') {
				    	status1=true;
				    }
				    	
				}
				
		
		    }else if(choose==6) {
		    	status=false;
		    }
		    
		    
		    
		}
		
		
	}

}
