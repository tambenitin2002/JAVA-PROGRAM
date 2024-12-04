package sameClassConstructorChaining;
//What happens if we change the order of constructors?
public class SameClassWhatHappensIfWeChangeOrder {
	SameClassWhatHappensIfWeChangeOrder(){
		System.out.println("defalt");
	}
	SameClassWhatHappensIfWeChangeOrder(int x){
		this();
		System.out.println(x);
	}
	SameClassWhatHappensIfWeChangeOrder(int x,int y){
		this(5);
		System.out.println(x*y);
	}
	
	
	public static void main(String[] args) {
		new SameClassWhatHappensIfWeChangeOrder(8,15);

	}

}
