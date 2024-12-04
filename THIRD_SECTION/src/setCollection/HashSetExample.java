package setCollection;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
	   HashSet h1=new HashSet(); 
	   h1.add(false);
	   h1.add("war");
	   h1.add('h');
	   System.out.println(h1);
	   h1.remove('h');
	   System.out.println(h1);
	   HashSet h2=new HashSet();
	   h2.add("First");
	   h2.add('a');
	   System.out.println(h2);
	   h2.addAll(h1);
	   System.out.println(h2);
	   h2.add(null);
	   System.out.println(h2);
	   h2.add(null);
	   System.out.println(h2);// In hashset we can add only one null value
	   h2.add(false);
	   System.out.println(h2);// In hasset we can not add dublicate
	   
		
		
	}

	

}
