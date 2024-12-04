/*2.Take two int values from user and print greatest among them.*/

import java.util.Scanner;
class GreatestNumber{
public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first Number : ");
    int num1=sc.nextInt();
    System.out.print("Enter the second Number : ");
    int num2=sc.nextInt();
     if(num1>num2){
    System.out.println("The Greates Number is "+num1);
}
else if (num2>num1){
System.out.println("The Greates Number is "+num2);
}

}

}