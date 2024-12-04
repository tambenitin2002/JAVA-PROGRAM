package array;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Size !! ");
		int size=sc.nextInt();
		int[] arr= new int[size];
		int sum=0;
		 
		 System.out.println(" enter "+size+" number:");
		for(int i=0;i<size ;i++) {
			 arr[i]=sc.nextInt();
			 sum+=arr[i];
			 
		}
		
		for(int a: arr)
		System.out.println(a);
		double avg=sum/size;
		System.out.println(" This is a Avg : "+avg);
	}

}

