/**
 *  @class AreaOfCylinder
 *   @author Sonal Sekhda
 *   @course: ITEC -04, Spring 2023
 *   @date: February 3, 2023
 *   program that calculate base area and volume of cylinder
 */
import java.util.Scanner;
public class AreaOfCylinder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of the radius : ");
        int radius = scan.nextInt(); // Declare the radius
        System.out.print("Enter the value of the length : ");
        int length = scan.nextInt(); //Declare the length

        double area = (2 * 3.1416 * radius * length) + (2 * 3.1416 * radius * radius);
        System.out.printf("Area of the Cylinder is : %.3f " ,area);//Output area of the cylinder
        System.out.println();
        double volume = 3.1416 * radius * radius * length;
        System.out.printf("Volume of the cylinder is : %.3f " ,volume); //Output volume of the cylinder
    }

}
