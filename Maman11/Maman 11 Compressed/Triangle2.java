/**
 * Omer Miloh 
 * ID: 314832106
 * The program get from the 3 Numbers, and decide if the 3 numbers can form A triagnle or not,
 * And if yes it determine the triangle type */

import java.util.Scanner;
public class Triangle2
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        
        // Asking the user for 3 whole numbers;
        System.out.println("This program determine if 3 whole numbers make a triangle, if yes it then determine if "
        + "the triangle  \nis equilateral, isosceles, right angle or a common triangle");
        System.out.println ("Please enter the three lengths of the triangle's sides");
        
        // input from user of the lengths of the 3 lines of the triangle
        int sideA = scan.nextInt();
        int sideB = scan.nextInt();
        int sideC = scan.nextInt();
        
        String printMessage = "";        
        boolean sidesGretaerThenZero, validTriangle;
        
        // Determine if any of the sides is smaller or equal to 0, therfore not valid sides;
        if (sideA <=0 || sideB <= 0 || sideC <= 0) {
            sidesGretaerThenZero = false;
        } else {
            sidesGretaerThenZero = true;
        }
        
        // Determine if the sides form a valid triangle
        if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB)) {
            validTriangle = true;
        } else {
            validTriangle = false;
        }

        // Determine The triangle type and if it's valid
        if (sidesGretaerThenZero && validTriangle ) {
            // Determine if the triangle is equilateral
            if (sideA == sideB && sideA == sideC) {
                printMessage = "The numbers: " + sideA + ", " + sideB + " and " + sideC + " represent an equilateral triangle";
            } 
            // Determine if the triangle is isosceles
            else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                printMessage = "The numbers: " + sideA + ", " + sideB + " and " + sideC + " represent an isosceles triangle";
            } 
            // Determine if it is a right triangle
             else if ((sideA * sideA == sideB * sideB + sideC * sideC) || (sideB * sideB == sideA * sideA + sideC * sideC) || (sideC * sideC == sideA * sideA + sideB * sideB)) {
                printMessage =  "The numbers: " + sideA + ", " + sideB + " and " + sideC + " represent a right-angle triangle";
            } else {
                printMessage =  "The numbers: " + sideA + ", " + sideB + " and " + sideC + " represent a common triangle";
            }
            
        } else {
            printMessage = "The numbers: " + sideA + ", " + sideB + " and " + sideC + " cannot represent a triangle";
        }
        System.out.println(printMessage);
    }
}
