/* 19. Write a Java program to convert an integer an number to a Binary number
Input Data : 
Input a Decimal Number: 5;
Expected Output
Binary number is : 101
*/
import java.util. Scanner;
public class ConvBinaryToDeci
{
                       public static void main(String[]args)
                          {
                                    int  quot, i=1, j;
                                    int bin_num[] = new int [100];

                                    Scanner sc=new Scanner(System.in);
                                    System.out.println(" Enter the first input : ");
                                    int num=sc.nextInt();
                                    //quot = num;
                                    
                                    while (num !=0)
                                     {
                                             bin_num[i++] =num% 2;
                                             num = num / 2;
                                     }
                                   System.out.print("Binary number is :  ");
                                    for (j=i-1; j>0;j--)
                                        {
                                                 System.out.print(bin_num[j]);
                                         }
                                    System.out.println();
                                     
                          }


}