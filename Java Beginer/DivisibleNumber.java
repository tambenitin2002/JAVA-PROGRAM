import java.util.Scanner;
class DivisibleNumber
{
          public static void main (String[]args)
          {
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter The Number :");
               int num =sc.nextInt();
               if(num%3==0)
                {
               System.out.println("The Number is Divisible by 3 !!");
                }
               else if(num%5==0)
               {
               System.out.println("The Number is Divisible by 5 !!");
               }else
               {
              System.out.println("The Number is Not divisible by 3 and 5 !!");
               }
       }
}