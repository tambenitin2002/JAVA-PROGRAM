package easy;
/*
 Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class IsPalindrome {
	
	    public boolean isPalindrome(int x) {
	           if(x<0){
	            return false;
	            }
					int finals=x;
					int rev=0;
					int rem;
					while(x!=0) {
						 rem=x%10;
						rev=rev*10+rem;
						x=x/10;
	                }
	                if(finals==rev) {
						return true;
					}else {
						return false;
					}
					   
	    }
	    public static void main(String[]args){
	    	IsPalindrome ip=new IsPalindrome();
	        ip.isPalindrome(121);
	        ip.isPalindrome(-121);
	        ip.isPalindrome(10);
	    }
	

}
