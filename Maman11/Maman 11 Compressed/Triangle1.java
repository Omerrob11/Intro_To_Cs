
/**
 * Omer Miloh 
 * ID: 314832106
 * The program get from the user 3 Natural numbers, that represent 3 lines of a triangle.
 * The program then print the sides, perimeter and the area of the triangle.
 */
import java.util.Scanner;

public class Triangle1
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("This program calculates the area and the perimeter of a given triangle.");
        System.out.println("Please enter the three lengths of the triangle's sides");
        
        // Getting data from user of the lengths of the 3 lines of the triangle
        int lineA = scan.nextInt();
        int lineB = scan.nextInt();
        int lineC = scan.nextInt();
        
        // Calculating the perimeter (natural number);
        int perimeter = lineA + lineB + lineC;
        
        // Calculating the are of the triangle using Heron method
        double halfPerimeter = (double)perimeter / 2;
        double area = Math.sqrt(halfPerimeter*(halfPerimeter - lineA)*(halfPerimeter - lineB)*(halfPerimeter - lineC));
        
        // Output
        System.out.println("The lengths of the triangle sides are: " + lineA + ", " + lineB + ", " + lineC + ".");
        System.out.println("The perimeter of the triangle is: " + perimeter);
        System.out.println("The area of the triangle is: " + area);
    } // end of method main
} // end of class Triangle

 