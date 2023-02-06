/**
 *  @class ConvertSeconds
 *  @author Sonal Sekhda
 *  @course: ITEC -04, Spring 2023
 *  @date: February 3, 2023
 *  program that converts total seconds into hours, minutes and seconds
 */
import java.util.Scanner;
public class ConvertSeconds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of seconds : ");
        int totalNumberSeconds = input.nextInt(); //Declare total number of seconds
        int hours = totalNumberSeconds / 3600; // Convert seconds in hours
        int r = totalNumberSeconds % 3600; //Declare the remainder of hours
        int minutes = r / 60; // Declare minutes with remainder divide with 60

        int seconds = r % 60; //Declare seconds
        System.out.print(  totalNumberSeconds + " Total seconds: ");//Output of the total seconds
        System.out.println( hours +" hours " + minutes + " minutes "+ seconds + " seconds");



    }
}

