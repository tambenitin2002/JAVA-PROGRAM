package programs;

public class Swap5Way {
	
	public static void main(String[] args) {
		System.out.println("This is swapping Program Practice in 5 Way");
		
		System.out.println("------------------------------------------------------------------------");
		
		int a=12, b=25;
		System.out.println("This is a initial numbers: "+a+"<->"+b);
		
		/*
		
		//The Swapping 1st way is using Temp variable
		int temp=b;
		b=a;
		a=temp;
		
		*/
		
		/*
		
		//The Swapping 2nd way is Without using third variable use Addition & substraction Operater
		 
		b=a+b;  //12+25=37
		a=b-a;  //37-12=25
		b=b-a;	//37-25=12	
		
		*/
	
		
		/*
		 
		 
		//The Swapping two number 3rd way without using third variable use Multiplication & Division Operater
		b=a*b; //300=12*25
		a=b/a; //25=300/12
		b=b/a; //12=300/25
		
		*/
		
		/*
		
		//The Swapping two numbers 4th way without using third variable but use a XOR Operater
		
		b=a^b;
		a=b^a;
		b=b^a;
		
		*/
		
		// The Swapping two numbers 5th way is a single Statement -> Here is the calculation perform L<-R

	  b=a+b-(a=b);
		
		
		System.out.println("This is a Final Swap "+a+"<->"+b);
	}

}
