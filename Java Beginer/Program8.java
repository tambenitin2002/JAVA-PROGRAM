class Program8{
              public static void master(){
                 System.out.println("MASTER START !!");
                 System.out.println("MASTER END !!");

}
                public static void central(){
                 System.out.println("CENTRAL START !!");
                 master();
                  System.out.println("CENTRAL END !!");
}

                    public static void main(String[]args){
                      System.out.println("MAIN START !!");
                      central();
                      System.out.println("MAIN END !!");

}

}