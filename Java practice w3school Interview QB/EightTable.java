/*Write a Java program that takes a number as input and print its multiplication table up to 10 .

 Test Data: 
Input a number: 8
*/

import java.util.Scanner;
public class EightTable
{
    public static void main(String[]args)
{
        Scanner sc = new Scanner(System.in);
    System.out.print("Input a number : ");
     int number=sc.nextInt();
    for(int mul=1;mul<=10;mul++)
          {
                    //int Table=number*mul;
                    //System.out.println(Table); 
                    //System.out.println(); 
               System.out.println(number + "x" + mul +"=" + number*mul);
                        
         }
}

}