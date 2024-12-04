import java.util. Scanner;
class Product{
  String productName ;
 double price;
int qty;
String type;

public void displayProducts(){
   System.out.println("PRODUCT NAME : "+productName);
    System.out.println("PRODUCT PRICE : "+price);
     System.out.println("PRODUCT QTY : "+qty);
      System.out.println("PRODUCT TYPE : "+type);
      
}
}
class MainApp{
public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
      
       	Product p1= new Product();
       System.out.print("Enter Product Name : ");
         p1.productName= sc.nextLine();
         System.out.print("Enter Product Price : ");
        p1.price= sc.nextDouble();
       System.out.print("Enter Product Qty : ");
         p1.qty= sc.nextInt();
         System.out.println("Enter Product Name : ");
           p1.type= sc.next();
          System.out.println("--------Display Product ---- ");
         p1.displayProducts();
 
}
}