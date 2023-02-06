/**
 * @class GallonsOfPaint
 * @author Sonal Sekhda
 * @course: ITEC -04, Spring 2023
 * @date: February 3, 2023
 * program will calculate gallons and quarts of paint needed to paint room
 */
import java.util.Scanner;
public class GallonsOfPaint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the room in feet: ");
        int length = scan.nextInt(); // Declare the length

        System.out.print("Enter the width of the room in feet: ");
        int width = scan.nextInt(); //Declare the width

        System.out.print("Enter the height of the room in feet :");
        int height = scan.nextInt(); //Declare the height

        System.out.print("Enter the number of windows : ");
        int numberOfWindows = scan.nextInt(); // Declare the number of windows

        System.out.print("Enter the number of Doors : ");
        int numberOfDoors = scan.nextInt(); //Declare the number of doors

        int area = (2 * length * height) + (2 * width * height); // assigns the room area without ceiling and floor
        System.out.println("Area of the room without ceiling and floor : " + area +" Sq.ft");
        int windowSize = 15; // window size in square feet
        int windows = numberOfWindows * windowSize;
        int doorSize = 21; // door size in square feet
        int doors = numberOfDoors * doorSize;
        int countArea;
        countArea = area - (windows + doors);
        System.out.println("Total area of the room to paint : " + countArea + " Sq. ft");
        int gallon = countArea / 350; // count number of gallons
        int r = countArea % 350;
        double quart = r * 4.0 /  350; // 1 gallon = 4 quarts
        System.out.print("Number of gallons and quarts paint needs to paint room : ");
        System.out.print( gallon + " Gallons "); // output gallons of paint
        System.out.printf("and %.3f Quarts.",quart); // output quarts of paint


    }

}