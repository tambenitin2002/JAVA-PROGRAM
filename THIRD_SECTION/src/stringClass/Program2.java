package stringClass;

public class Program2 {
 public static void main(String[] args) {
	String s1="Hello";
	System.out.println("hello");
	String s2=new String("Hello");
	String s3= new String("Apple");
	String s4=new String("Hello");
	System.out.println(s2==s4);
	System.out.println(s2.equals(s4));
}
}
