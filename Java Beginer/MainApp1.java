import java.util.Scanner;
class Employee{
int empId;
String empName;
String empDept;
double sal;

public void displayEmpDetails(){
     
     System.out.println("EMPLOYEE  ID : "+empId);
    System.out.println("EMPLOYEE  NAME : "+empName);
     System.out.println("EMPLOYEE  DEPT : "+empDept);
      System.out.println("EMPLOYEE  SAL: "+sal);

}

public void hikeSalary(){
    sal=sal*1.10;
     System.out.print("EMPLOYEE UPDATED SALARY : "+sal);

}


}
class MainApp1{

public static void main(String [] args){

Scanner sc=new Scanner(System.in);
      
       	Employee p1= new Employee();
      
       System.out.print("Enter EmpId : ");
         p1.empId= sc.nextInt();
         System.out.print("Enter EmpName : ");
        p1.empName= sc.next();
       System.out.print("Enter EmpDept : ");
         p1.empDept= sc.next();
         System.out.print("Enter EmpSal : ");
           p1.sal= sc.nextDouble();
          System.out.println("--------Display Emp Details ---- ");
         p1.displayEmpDetails();
           
            
           System.out.println("--------Display Emp Details updated sal ---- ");
             
     //     p1.displayEmpDetails();
           p1.hikeSalary();
          

        

  }
}