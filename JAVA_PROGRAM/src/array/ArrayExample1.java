package array;

public class ArrayExample1 {
	public static void main(String[] args) {
		ArrayExample1 sb=new ArrayExample1();
		
		int[] arr= {10,12,14,16,30,32,35,45,66,67,70,76,82,83,84,90,93,95,100,199,282,313,315};
		
		int result=sb.searchBinary(arr,15,0,arr.length-1);
		System.out.println("Length of array:"+arr.length);
		
		if(result==-1)
			System.out.println("Element is not Present!! " );
		else
			System.out.println("Element found at index "+result);
	}
	
	public  int searchBinary(int[] arr,int n,int st,int ed) {
		
		  
		if(st<=ed){
			System.out.println("This is Starting point: "+st);
			System.out.println("This is Starting point: "+ed);
			  int mid=(ed-st)/2+st;
			  
			  if(arr[mid]==n)
				  return mid;
			  
			  if(arr[mid]>n)
				  return searchBinary(arr,n,st,mid-1);
			  
			  
			  if(arr[mid]<n)
				  return searchBinary(arr,n,mid+1,ed);
			  
			  
			 
			  
			  
			  
			  
		  }
	   
		  return -1;

	}

}
