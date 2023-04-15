# Hello world
```java
public class helloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
```

# Single Dimensional Array
```java
import java.util.*;

public class oneDarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], n;
		System.out.println("Enter how many number");
		n = sc.nextInt();
		a = new int[n];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are:");
		for(int i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}
	}
	static void getArr() {
		System.out.println("Enter array elements: ");
	}
}
```


# Two Dimensional Array
```java
import java.util.*;

public class twoDarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][], n, m;

		System.out.println("Enter array row");
		n = sc.nextInt();
		System.out.println("Enter array column");
		m = sc.nextInt();

		a = new int[n][m];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elements are:");
		for(int i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}
	}
	static void getArr() {
		System.out.println("Enter array elements: ");
	}
}
```

# Java Program To Find Number Of Characters, Words And Lines In A File / Filehandling

### Input file: `sample.txt`
##### Content:
```
Java JDBC JSP Servlets
Struts Hibernate Web Services
Spring JSF
Java Threads Concurrent Programming
```

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class WordCountInFile {
    public static void main(String[] args) {
        BufferedReader reader = null; 
        //Initializing charCount, wordCount and lineCount to 0 
        int charCount = 0; 
        int wordCount = 0; 
        int lineCount = 0; 
        try {
            //Creating BufferedReader object 
            reader = new BufferedReader(new FileReader("C:\\sample.txt")); 
            //Reading the first line into currentLine
             
            String currentLine = reader.readLine();
             
            while (currentLine != null) {
                //Updating the lineCount 
                lineCount++;
                 
                //Getting number of words in currentLine
                 
                String[] words = currentLine.split(" ");
                 
                //Updating the wordCount
                 
                wordCount = wordCount + words.length;
                 
                //Iterating each word
                 
                for (String word:words) {
                    //Updating the charCount 
                    charCount = charCount + word.length();
                }
                 
                //Reading next line into currentLine 
                currentLine = reader.readLine();
            }
             
            //Printing charCount, wordCount and lineCount
             
            System.out.println("Number Of Chars In A File : "+charCount);
             
            System.out.println("Number Of Words In A File : "+wordCount);
             
            System.out.println("Number Of Lines In A File : "+lineCount);
        } catch (IOException e)  {
            e.printStackTrace();
        } finally {
            try {
                reader.close();       //Closing the reader
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }   
}
```

# Command line argument
```java
package assignment;

public class cmdArg {
	public static void main(String[] args) {
		int cnt, i = 0, n, s =0;
		cnt = args.lenght;
		while (i < cnt) {
			n = Integer.parseInt(args[i]);
			s = s + n;
			i++;
		}
		Syatem.out.println("The sum of interger is " + s);
	}
}
```

# Method Overloading 

```java
class A {
	void add() {
		int a = 10, b = 20, c;
		c = a + b;
		System.out.println(c);
	}
	void add(int x, int y) {
		int c;
		c = x + y;
		System.out.println(c);
	}
	void add(int x, double y) {
		double c;
		c = x + y;
		System.out.println(c);
	}
}

public class overload {
	public static void main(String[] args) {
		A r = new A();
		r.add();
		r.add(20, 34);
		r.add(32, 2.456);
	}
}
```

# Method Override
```java
class shape {
	void draw() {
		System.out.println("Can't say the shape type");
	}
}
class square extends shape {
	void draw() {
		System.out.println("Square shaped.");
	}
}
class demo {
	public static void main(String[] args) {
		shape r = new square();
		r.draw();
	}
}
```

# Constructor
```java
class Date {
	long time;
	Date() {
		time = currentTime();
	}
	Date( String date ) {
		time = parseDate( date );
	}
	...
}
```

## Constructor Overloading 
```java
class Car {
	String model;
	int doors;

	Car( String model, int doors ) {
		this.model = model;
		this.doors = doors;
		// Other code
		...
	}
	Car( String model ) {
		this(model, 4 /* doors */);
	}
	...
}
```

# Single level Inheritance
```java
class A {
	void disp_A() {
		System.out.println("Display A");
	}
}
class B extends A {
	void disp_B() {
		System.out.println("Display B");
	}
}
public class singleinh {
	public static void main(String[] args ) {
		B b = new B();
		b.disp_A();
		b.disp_B();
	}
}
```

# Multi-level Inheritance

```java
class A {
	void disp_A() {
		System.out.println("Display A");
	}
}
class B extends A {
	void disp_B() {
		System.out.println("Display B");
	}
}
class C extends B {
	void disp_C() {
		System.out.println("Display C");
	}
}

public class multilvl {
	public static void main(String[] args ) {
		C c = new C();
		c.disp_A();
		c.disp_B();
		c.disp_C();
	}
}
```

# Multithreading
```java
class A extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("From thread A: i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B extends Thread {
	public void run() {
		for (int j = 1; j <= 5; j++) {
			System.out.println("From thread B: j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C extends Thread {
	public void run() {
		for (int k = 1; k <= 5; k++) {
			System.out.println("From thread C: k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class thread Test {
	public static void main(String[] args) {
		new A.start();
		new B.start();
		new C.start();
	}
}
```

# Exception Handling
```java
import java.util.*;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			int[] a = new int[5];
			String a = null;
			System.out.println(a.length());
		} catch (ArithmaticException e) {
			System.out.println("Arithmatic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound");
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
		System.out.println("Rest of the code");
	}
}
```

# Interface
```java
interface Area {
	final static float pi = 3.14 F;
	float compute(float x, float y);
	String compute(double d, double e);
}

class Rectangle implements Area {
	public float compute(float x, float y) {
		return(x*y);
	}
}

class Circle implements Area {
	public float compute(float x, float y) {
		return(pi * x * x);
	}
}

class interface Test {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		Area area;
		area = rect;
		System.out.println("Area of a Rectangle" + area.compute(3.5, 5));
		area = cir;
		System.out.println("Area of a circle" + area.compute(10, 0));
	}
}
```

# Objects as function arguments
```java
class MyClass {
    int value;

    public MyClass(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(5);
        printValue(obj);
    }

    public static void printValue(MyClass o) {
        System.out.println("Value: " + o.getValue());
    }
}
```


# Applet program that adds and multiplies two numbers using two `TextBoxes` and `Buttons`

```java
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class appMul extends Applet implements ActionListener {
	TextField t1 = new TextField(10);
	TextField t2 = new TextField(10);
	TextField t3 = new TextField(10);
	TextField t4 = new TextField(10);

	Label l1 = new Label("First Number: ")
	Label l2 = new Label("Second Number: ")
	Label l3 = new Label("Sum: ")
	Label l4 = new Label("Product: ")

	Button b = new Button("Calculate Sum and Product");

	public void init() {
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(l4);
		add(t3);
		add(t4);
		add(b);
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			int n1 = Integer.parseInt(t1.getText());
			int n2 = Integer.parseInt(t2.getText());
			t3.setText(" " + (n1 + n2));
			t4.setText(" " + (n1 * n2));
		}
	}
}
```