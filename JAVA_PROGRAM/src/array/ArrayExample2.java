package array;

public class ArrayExample2 {
	public static void main(String[] args) {
		double[]arr= {110,112,122,130,131,115};
		double max1=arr[0];
		double max2=arr[1];
		double chemical=0;
		
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max1) {
				 max2=max1;
				 max1=arr[i];
				 
			 }else if(arr[i]!=max1 && arr[i]>max2) {
				 max2=arr[i];
			 }
		}
		System.out.println("This is the Max1 :"+max1);
		System.out.println("This is the Max2 :"+max2);
		chemical=max1+max2;
		System.out.println("This is a Powerful Chemical Mixture: "+chemical);	
	}

}

