public class EvenDigitFactorial {
    
        public static void main(String[] args) {
            int a[] = {4, 2, 7, 6, 3};
            
            // Print the factorial of each even digit from array
            for (int i = 0; i < a.length; i++) {
                int num = a[i];
                System.out.println("\nIn Num: " + num);
    
                int rem;
                while (num > 0) {
                    rem = num % 10;  // Extract the last digit
                    
                    if (rem % 2 == 0) {  // Check if the digit is even
                        System.out.print(rem + " is even. Factorial of " + rem + " is: ");
                        
                        int fact = 1;
                        for (int j = rem; j > 0; j--) {
                            fact *= j;  // Calculate factorial
                        }
                        
                        System.out.println(fact);  // Print factorial
                    }
    
                    num /= 10;  // Reduce num to process the next digit
                }
            }
        }
    }
    

