/*5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25;
Input second number: 5;

*/

import java.util.Scanner;

public class Usrinputmul
{
    public static void main(String[] args)
{
       
            Scanner sc = new Scanner(System.in);
       System.out.print("Input first number : ");
       int firstnum=sc.nextInt();
        System.out.print("Input second number : ");
       int secondnum=sc.nextInt();
       System.out.println(firstnum + " x " + secondnum + " = " + firstnum*secondnum);       
}
}

