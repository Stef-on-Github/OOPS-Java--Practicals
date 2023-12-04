// Java Program to Print Even and Odd Elements in an Array.

import java.util.Scanner;

public class EvenOddElements 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Prompt the user to enter elements for the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) 
        {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Print even elements
        System.out.print("Even elements: ");
        for (int i = 0; i < size; i++) 
        {
            if (array[i] % 2 == 0) 
            {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(); // Move to the next line

        // Print odd elements
        System.out.print("Odd elements: ");
        for (int i = 0; i < size; i++) 
        {
            if (array[i] % 2 != 0) 
            {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(); // Move to the next line

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
