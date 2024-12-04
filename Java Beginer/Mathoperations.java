class Mathoperations
         {
                            public static void add(int a, int b)
                               {
                                       int add=a+b;
                                       System.out.println("Addition of "+a+ " and " +b+ " is :" +add);

                               }
                             public static void sub(int a, int b)
                               {
                                      int sub=a-b;
                                     System.out.println("substraction of  " +a+ " and " +b+ " is : "+sub);
                                }
                              public static void mul(int a, int b)
                                {
                                        int mul=a*b;
                                  System.out.println("multiplication of " +a+ " and " +b+ " is : " +mul);
                                }
                             public static void divide(int a, int b)
                              {
                                       double divide=a/b;
                                        System.out.println("divide of " +a+  " and " +b  +" is :" + divide);
                              }
                      public static void main(String[]args)
                            {
                                     add(10,20);
                                     sub(10,20);
                                     mul(10,20);
                                     divide(30,20);
                            }
}