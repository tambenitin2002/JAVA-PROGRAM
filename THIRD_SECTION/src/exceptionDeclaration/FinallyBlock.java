package exceptionDeclaration;

import java.util.Scanner;

public class FinallyBlock {
  public static void main(String[] args) {
	
	System.out.println(" Main  Start ");
	String s1=null;
	try {
		System.out.println(s1.length());
	}catch(ArithmeticException n) {
		System.out.println("Cannot access null value");
	}finally {
		System.out.println("I am finally block ");
	}
	System.out.println("Main End");
	}
}
