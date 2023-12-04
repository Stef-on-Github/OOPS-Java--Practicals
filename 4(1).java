// Java program to find whether the given no. is positive or negative.

import java.util.Scanner;

public class PositiveNegative 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the input number
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) 
        {
            System.out.println("The entered number is positive.");
        } 
        else if (number < 0) 
        {
            System.out.println("The entered number is negative.");
        } 
        else 
        {
            System.out.println("The entered number is zero.");
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
