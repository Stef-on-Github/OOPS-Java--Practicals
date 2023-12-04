//Program on String class

import java.util.*;

class StringClass 
{
    public static void main(String[] args) 
    {
        // create first string
        String first = "Java ";
        System.out.println("First String: " + first);

        // create second string
        String second = "Programming";
        System.out.println("Second String: " + second);

        // join two strings
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);
    }
}
