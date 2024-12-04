package program;

public class FindpPrimeNumber {
	public static void main(String[] args) {
		
	    int a=1;
		int primeCount=0;
	
	 while(primeCount<=25) {
     int n=a++;		 
     int count=0;
     for(int i=1;i<=n;i++) {
    	 
    	 if(n%i==0) {
    		 count++;
    	 }
    	 
     }
     if(count==2) {
    	 System.out.println(n);
    	 primeCount++;
     }
     
	}
	 
	}

}
