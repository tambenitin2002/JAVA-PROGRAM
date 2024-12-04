package basic;

public class Program9 {
  int i=10;
  Program9(int i){
	  this.i=i;
  }
  Program9(){
	  
  }
  class Red{
	  int j=10;
  }
  class Driver{
	  public static void main(String[] args) {
		  Program9 p=new Program9();
		  Red r=new Red();
		  p=r;
		  System.out.println(r.i);
	}
  }
}
