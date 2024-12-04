/*1. Take values of length and breadth of a rectangle from user and check if it is square or not.*/

import java.util.Scanner;
class CheckSquare{

public static void main(String[]args){
 Scanner sc =new Scanner(System.in);
System.out.println("Enter the Length: " );
 int length = sc.nextInt();
System.out.println("Enter the breadth: " );
 int breadth = sc.nextInt();
if (length==breadth){
System.out.println("As per given values It's a square ");
}
else{
System.out.println("As per given values It's not a square ");
}


}


}