import java.util.Scanner;
class Program4 {

           public static void main(String[]args){
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter The Number : ");
             int num=sc.nextInt();
                 if(num%3==0 && num%5==0 ){
                     System.out.println("The No is divisible by 3 and 5 : "+num);
                   }
                else if(num%5==0){
              System.out.print("The No is divisible by 3 : "+num);
                }
             else if(num%5==0){
              System.out.print("The No is divisible by 5 : "+num);
          }
           }
        }