// Java Program to Find Largest Element in an Array.

import java.util.Scanner;

public class LargestElement 
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

        // Find the largest element in the array
        int largestElement = array[0]; // Assume the first element is the largest

        for (int i = 1; i < size; i++) 
        {
            if (array[i] > largestElement) 
            {
                largestElement = array[i];
            }
        }

        // Print the result
        System.out.println("The largest element in the array is: " + largestElement);

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
