package stringBuilderClass;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr the string: ");
		String str=sc.next();
		System.out.println("My string is: "+str);// Hello

		StringBuilder sb=new StringBuilder(str);
		
		
		System.out.println(sb.capacity());// 21
		System.out.println(sb.charAt(2));// l
		System.out.println(sb.length());//5
		System.out.println(sb.indexOf("hello"));//0
		System.out.println(sb.insert(2, 'k'));//Hekllo
		System.out.println(sb.append('F'));//HeklloF
		sb.setCharAt(5, 'L');//HekllLF
		System.out.println(sb);
		System.out.println(sb.delete(3, 5));
		
				
		

	}

}
