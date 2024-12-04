class Program1{
   public static void avg(double a,double b ,double c, double d , double e)
  {
           double avg=(a+b+c+d+e)/5;
            double sqAvg=avg*avg;
            System.out.println("Avg : "+avg);
            System.out.println("SqAvg : "+sqAvg);
  }
    public static void main(String[]args){
         avg(4.5,5.2,6.3,8.6,5.5);
         
}

}