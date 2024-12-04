package java_Statement_Control_Flow;

import java.util.Scanner;

public class SolveQurdraticEqvation {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The A's Value!!");
		double a=sc.nextDouble();
		System.out.println("Enter The B's Value!!");
		double b=sc.nextDouble();
		System.out.println("Enter The C's Value!!");
		double c=sc.nextDouble();
		double root=0;
		double x=0;
		root=b * b - 4.0 * a * c;
		if(root>0.0) {
			double r1 = (-b + Math.sqrt(root)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(root)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);

		}else if (root == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }


	}

}
