/* 17. Write a Java program to add  two binary number.
Input Data : 
Input first binary number: 10;
Input second binary number : 11;
Expected Output
sum of two binary numbers : 101
*/


import java.util.Scanner;
public class BinaryTwoNumSum
{
             public static void main(String[]args)
  {
               long firstBinary,secondBinary;
               int i=0 ,remainder=0;
              int[] sum=new int[20];
              

            Scanner in = new Scanner(System.in);
            System.out.print("Input first binary number : ");
             firstBinary=in.nextLong();
            System.out.print("Input second binary number : ");
             secondBinary=in.nextLong();

        while(firstBinary!=0 || secondBinary!=0)
{
           sum[i++]=(int)((firstBinary%10 + secondBinary%10 + remainder)%2);
      remainder=(int)((firstBinary%10 + secondBinary%10 + remainder)/2);

           firstBinary=firstBinary/10;
        secondBinary=secondBinary/10;
}
if(remainder !=0) {
 sum[i++] = remainder;
}

--i;

System.out.print("sum of two binary num: ");
while(i >=0 ){
       System.out.print(sum[i--]);
}
System.out.print("\n");



   }
     

}