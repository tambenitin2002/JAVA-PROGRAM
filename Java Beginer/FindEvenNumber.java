import java.util.Scanner;
class FindEvenNumber{
public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number!!!");
 int num=sc.nextInt();
int r= num%2;
if (r==0)
{
System.out.println("The Number is Even!!");
}
else{
 System.out.println("The Number is odd!!");
}

}

}