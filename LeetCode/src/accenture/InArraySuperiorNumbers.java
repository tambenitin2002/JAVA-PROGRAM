package accenture;
/*
 In an array a superior element is one which is greater than all the elements to its right side.
The rightmost element itself be a superior element.
You are given a function,
int Find Number_Of_Superior_Element(int arr[], int n);
The function accepts an integer array and the size of array, Implement the function
to find the total number of superior elements present in array.
 
 Assumptions:
N> and Array index starts from 0
Input: n= 6
arr= [8,10,6,2,9,7]
Output: 3
 
 */

import java.util.Scanner;

public class InArraySuperiorNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int count = 0;
        int sup = Integer.MIN_VALUE;
        
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > sup) {
                count++;
                System.out.println(arr[i]);
                sup = arr[i];
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}
