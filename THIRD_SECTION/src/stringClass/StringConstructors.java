package stringClass;
import java.lang.String;
public class StringConstructors {

	public static void main(String[] args) {
	 
//		char [] ch= {'A','B','C','D','E'};
//		
//		String s1= new String(ch);
//		System.out.println(s1.getClass() .getName());
//		System.out.println(s1);
		
		
		String s1="Hello Nitin, How are you";
		
		String s2="God is greate";
		
		String s3="Hello";
		String s4="Hello";
		
		String s5="hello";
		
		String s6="   hi  ";
		
		// Return Type String
		System.out.println("-------------------------------- Return type String ---------------------------");

		
		System.out.println(s5.toUpperCase());//HELLO
		System.out.println(s4.toLowerCase());//hello
		System.out.println(s1.concat(" "+s2));//Hello Nitin, How are you God is greate
		System.out.println(s6.trim());//hi
		System.out.println(s4.substring(2));//llo
		System.out.println(s4.substring(1, 4));//ell
		
		// Return type is Char
		System.out.println("-------------------------------- Return type is Char ---------------------------");

		
		System.out.println(s5.charAt(2));//l
		
		// Return type is int
		System.out.println("-------------------------------- Return type is int ---------------------------");
		
		System.out.println(s5.indexOf("l"));//2
		System.out.println(s5.lastIndexOf('l'));//3
		System.out.println(s5.indexOf('c',2));//-1
		System.out.println(s5.indexOf('l',2));//2
		System.out.println(s1.indexOf("Nitin"));//6
		System.out.println(s1.indexOf("Nitin",2));//6
		System.out.println(s5.length());//5
		
		
		// Return type boolean
		System.out.println("-------------------------------- Return type boolean ---------------------------");
		
		System.out.println(s3.equals(s4));//true
		System.out.println(s5.equalsIgnoreCase(s4));//true
		System.out.println(s3.contentEquals(s4));//true
		System.out.println(s3.contains("Nitin"));//false
		System.out.println(s1.contains("Nitin"));//true
		System.out.println(s3.contentEquals("Hello"));//true
	
		
		
		
		
		
		
		
		
		
		
		 

	}

	

}
