/* 20. Write a Java Program to convert a decimal number to a octal number.
 Input Data:
Input a decimal number : 15
Expected Output 
Hexadecimal number: F
*/
 import java.util.Scanner ;
public class ConvDeciToOct
{
        public static void main(String[]args)
          {
                    int i=1,j=0;
                     int octNum[]=new int[100];             
 
                   Scanner sc = new Scanner(System.in);
                   System.out.print("Enter the your Decimal number : " );
                   int  deciNum=sc.nextInt();
                    
                  while( deciNum != 0)
                    { 
                           octNum[i++]=deciNum%8;
                           deciNum=deciNum/8;
                      }
                 System.out.print(" Octal Num is : ");
                 for (j = i-1 ; j>0  ; j-- )
                 { 
                      System.out.print(octNum[j]);             
                 }
                System.out.println();

           }

 
}