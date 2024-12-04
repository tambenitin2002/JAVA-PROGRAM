class HikeCal
{
          public static void HikeCalculator(String ename, double  salary,int hike_prc)
            {

                      double incre= salary*1.50;
                      System.out.println("Employee Name: "+ename);
                      System.out.println("Salary of Employee: "+salary);
                      System.out.println("Hike Percentage :"+hike_prc);                                  

                     System.out.println("Increment :       "+incre); 

             }

                      public static void main(String []args)
                         { 
                                HikeCalculator("Nitin", 25000,50);
                          }

}