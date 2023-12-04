// Java Program to print weekdays according to integers from 1 to 7.

import java.util.Scanner;

public class Weekdays 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number for the day of the week
        System.out.print("Enter a number (1 to 7): ");

        // Read the input number
        int dayNumber = scanner.nextInt();

        // Determine the corresponding day of the week
        String dayOfWeek;

        switch (dayNumber) 
        {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day number";
                break;
        }

        // Print the result
        System.out.println("Day of the week: " + dayOfWeek);

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
