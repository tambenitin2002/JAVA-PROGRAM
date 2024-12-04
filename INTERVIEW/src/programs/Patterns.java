package programs;

public class Patterns {

	public static void main(String[] args) {
		//Pattern1
		/*
		 
		  * * * * *
		  * * * * *
		  * * * * *
		  * * * * *
		  * * * * *
		  
		 */
		
		int n=5;
		
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		
		
		//Pattern2
				/*
				 
				  * 
				  * * 
				  * * *
				  * * * *
				  * * * * *
				  
				 */
		
		for(int i=0; i<n; i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		//Pattern3
				/*
				 
				  * * * * *
				  * * * * 
				  * * *
				  * * 
				  *
				  
				 */
				
			
				
				for(int i=0; i<n; i++) {
					for(int j=0;j<n-i;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				
				System.out.println();
				
				
				//Pattern4
				/*
				 
				 1
				 1 2
				 1 2 3
				 1 2 3 4
				  
				 */
				
				for(int row=1; row<=n; row++) {
					for(int col=1;col<=row;col++) {
						System.out.print(col + " " );
						
					}
					System.out.println();
					
				}
				
				
				//Pattern 5
				
				/*
				  
		          *  
		        * *
		      * * *
		    * * * *
		      * * *
		        * *
		          * 
		  
				 */
				
				System.out.println();
				
				int line=9;
				int star=1;
				int space=4;
				
				
				for(int row=0;row<line;row++) {
					
					for(int col=0;col<space;col++) {
						System.out.print(" ");
					}
					for(int col=0;col<star;col++) {
						System.out.print("*");
					}
					
					System.out.println();
					if(row<4) {
						star++;
						space--;
					}else {
						star--;
						space++;
					}
				}
				
				
				
				System.out.println();
			
				//pattern6
				/*
				 
				 
				 *
				 * *
				 * * *
				 * * * *
				 * * *
				 * *
				 * 
				 
				 
				 */
				
				 
				int line1=9;
				int star1=1;
				
				
				
				for(int row=0;row<line1;row++) {
					
					for(int col=0;col<star1;col++) {
						System.out.print("*");
					}
					
					
					
					System.out.println();
					
					
					if(row<4) {
						star1++;
						
					}else {
						star1--;
					}
				}
				
				System.out.println();
				
				//Pattern7
				
				/*
				 
				 * * * * * 
				 *       *
				 *       *
				 *       *
				 *       *
				 * * * * *
				 
				 */
				
            for(int row=0;row<=4;row++) {
					
					for(int col=0;col<=4;col++) {
						
						
						if(row==0 || col==0 || row==4 || col==4 ) {
							System.out.print("*");	
						}else {
							System.out.print(" ");
						}
						
					}
					
					
					System.out.println();
					
					
					
				}
				
			
	}
}
