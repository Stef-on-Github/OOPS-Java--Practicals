//Program on Polymorphism

class Shape 
{
    void draw() 
    {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape 
{
    void draw() 
    {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape 
{
    void draw() 
    {
        System.out.println("drawing circle...");
    }
}

class Triangle extends Shape 
{
    void draw() 
    {
        System.out.println("drawing triangle...");
    }
}

class TestPolymorphism
{
    public static void main(String args[]) 
    {
        Shape s;

        // Polymorphism: The reference variable 's' can point to objects of different types.
        // The actual method called is determined at runtime based on the type of the object.
        s = new Rectangle();
        s.draw();

        s = new Circle();
        s.draw();

        s = new Triangle();
        s.draw();
    }
}
