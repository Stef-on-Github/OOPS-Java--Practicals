//Program on Exception Handling.

class Main 
{
    public static void main(String[] args) 
    {
        try {
            // code that generates exception
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        System.out.println("Rest of the code after try-catch block");
    }
}
