package program;

import java.util.Scanner;

public class CalculaturApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=sc.nextInt();
		boolean status = true;
		while(status) {
			char op=sc.next().charAt(0);
			if(op=='=') {
				break;
			}
			int n=sc.nextInt();
			
			if(op=='+') {
				ans+=n;
			}else if(op=='-') {
				ans-=n;
			}else if(op=='*') {
				ans*=n;
			}else if(op=='/') {
				ans/=n;
			}else if(op=='%') {
				ans%=n;
			}
					
		    
		}
		System.out.println("This is the Answer: "+ans);
	}

}
