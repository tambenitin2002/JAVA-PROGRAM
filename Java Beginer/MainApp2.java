class Sample{
    public void display()
      {
         System.out.println("Display Method   : " +this);

       }
}
class MainApp2{
      public static void main(String [] args){
         Sample s1=new Sample();
         s1.display();
         System.out.println("---------------------------------------");
         Sample s2=new Sample();
         s2.display();
     }



}