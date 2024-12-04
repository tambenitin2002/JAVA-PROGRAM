class Program12
{ 
            int a= 10;
             public void display()
             {
                     System.out.println("DISPLAY METHOD !!");
                     text();
              } 
              public void text()
              {
                        Syatem.out.println(" TEXT METHOD !!"); 
               }
 
      public static void main(String[]args)
        {
              Program12 p1 = new Program12();
              System.out.println(p1.a);
              p1.display();

         }

        }

}