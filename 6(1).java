// Program on creation of simple package

// File: mypackage/MyClass.java
package mypackage;

public class MyClass {
    public void displayMessage() {
        System.out.println("Hello from MyClass in mypackage!");
    }
}

// File: MainApp.java
import mypackage.MyClass;

public class MainApp {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.displayMessage();
    }
}

```bash
javac mypackage/MyClass.java
javac MainApp.java
```

Run the program:

```bash
java MainApp
```
