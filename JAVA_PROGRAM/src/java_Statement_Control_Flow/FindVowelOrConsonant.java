package java_Statement_Control_Flow;

import java.util.Scanner;

public class FindVowelOrConsonant {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter The Alphabet Later !!");
   char alpha=sc.next().charAt(0);
   if(alpha=='A'|| alpha=='a') {
	   System.out.println("The given Alpha is Vowel ");
	   
   }else if(alpha=='E'|| alpha=='e') {
	   System.out.println("The given Alpha is Vowel ");
	   
   }else if(alpha=='I'|| alpha=='i') {
	   System.out.println("The given Alpha is Vowel ");
   }else if(alpha=='O'|| alpha=='o') {
	   System.out.println("The given Alpha is Vowel ");
   }else if(alpha=='U'|| alpha=='a') {
	   System.out.println("The given Alpha is Vowel ");
   }else {
	   System.out.println("The Given Alpha is Consonant!!");
   }
}
}
