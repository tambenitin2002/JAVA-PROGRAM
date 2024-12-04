/* 12.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/
import java.util.Scanner;
public class AvarageInput{
    public static void main (String[]args){
           Scanner sc = new Scanner(System.in);
          System.out.print("Enter first number: ");
          int a=sc.nextInt();
          System.out.print("Enter second number: ");
          int b=sc.nextInt();
        System.out.print("Enter third number: ");
          int c=sc.nextInt();
     
     int avarage= (a+b+c)/3;
  System.out.println(avarage);
}

}    