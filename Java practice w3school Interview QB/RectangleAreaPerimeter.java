/*13.Write a Java program to print the area and  perimeter of a rectangle
Test Data: 
Width = 5.5 Heigth=8.5;
Area is 5.6 * 8.5 =47.60
Perimeter is 2 (5.6 + 8.5)=28.20
*/

public class RectangleAreaPerimeter
{
            public static void main (String[]args)
           {
                     double rectangleWidth=5.6;
                     double rectangleHeight=8.5;
                      double rectangleArea= rectangleWidth* rectangleHeight;
                      double rectanglePerimeter= 2* (rectangleWidth+ rectangleHeight);

                      
      //            System.out.println("Area is " + rectangleWidth +" * " +rectangleHeight+"="+rectangleArea);
      //           System.out.println("Perimeter is  2 * (" + rectangleWidth + " +" + rectangleHeight+") = "+ rectanglePerimeter);

System.out.printf("Area is %.1f * %.1f= %.2f \n", rectangleWidth, rectangleHeight, rectangleArea);
System.out.printf("Perimeter is 2*(%.1f+%.1f)=%.2f \n", rectangleWidth,rectangleHeight,rectanglePerimeter);
                     
}


}