class Program19{
public static void main(String[] agrs){
display(10);

}
public static void display(int a){
if (a>0){
System.out.println("Display Method ");
display(a-1);

}

}
}