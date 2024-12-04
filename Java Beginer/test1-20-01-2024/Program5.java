import java.util.Scanner;
class Program5{
     

public static void main (String[]args){
      
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter The qty : ");
        int qty=sc.nextInt();
 
        System.out.print("Enter The price : ");
        int price=sc.nextInt();
          int prodBill=productBill(qty,price);
        System.out.println("Product bill is : "+prodBill);

}


   public static  int productBill(int qty, int price){
     
     
      return qty*price;
  
}



}