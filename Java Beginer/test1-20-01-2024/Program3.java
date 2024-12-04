import java.util.Scanner;
class Program3{
 public static void area(){
          Scanner sc= new Scanner(System.in);
           System.out.print("Enter the L value: ");
           int l=sc.nextInt();
          System.out.print("Enter the w value: ");
           int w=sc.nextInt();
         double areaRec=l*w;
         System.out.print("Area of Rectangle: "+areaRec);
}
 public static void main(String[]args){
      
        area();
       
}
 
}