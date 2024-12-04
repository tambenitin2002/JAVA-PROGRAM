 /* Write a Java program to print the sum (addition),multiply, subtract,divide and remainder of two numbers.
Test Data : 
Input first number : 125;
 Input second number: 24;
*/

import java.util.Scanner;
public class Allmathoperation
{
   public static void main (String[]args)
{
     
Scanner sc = new Scanner(System.in);
System.out.print("Input first number: ");
int firstnum=sc.nextInt();
System.out.print("Input second number: ");
int secondnum= sc.nextInt();
              System.out.println(firstnum +"+"+ secondnum + "=" + (firstnum+secondnum));
          System.out.println( firstnum + "-" + secondnum + "=" + (firstnum-secondnum));
            System.out.println(firstnum + "x" + secondnum + "=" + firstnum*secondnum);
            System.out.println(firstnum + "/" + secondnum + "=" + firstnum/secondnum);
       System.out.println(firstnum + "%" + secondnum + "=" + firstnum%secondnum);
}
}