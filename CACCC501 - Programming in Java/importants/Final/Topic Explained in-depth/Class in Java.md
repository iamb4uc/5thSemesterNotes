In Java, a class is a blueprint for creating objects (a particular data structure), providing initial values for state (member variables or attributes), and implementations of behavior (member functions or methods).

A class can be defined using the "class" keyword, followed by the class name. The class body is enclosed in curly braces {}.

Here is an example of a simple class in Java:

```java
public class Example {
    int value;

    public Example(int v) {
        value = v;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }
}
```

This class, named "Example," has one member variable called "value" and two methods, a constructor and a printValue method. The constructor is used to initialize the value of the member variable, and the `printValue` method is used to print the value of the member variable.

You can create an instance of this class like this:

```java
Example ex = new Example(5);
```

and call the method like this:

```java
ex.printValue();
```

This will print "Value: 5".

In addition to the member variables and methods, a class can also have static variables and methods, inner classes, and interfaces.