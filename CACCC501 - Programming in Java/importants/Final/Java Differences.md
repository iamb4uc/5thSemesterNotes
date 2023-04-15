A [[Point-wise notes JAVA]] sub-page for all the differences in JAVA (all units).

# JVM vs JDK
| JVM | JDK |
| --- | --- |
| Java Virtual machine or JVM is a runtime environment in which Java byte-code can be executed. It is a virtual machine that has its own virtual processor that helps it convert the byte code instructions into the love-level machine code. It is a sandbox that provides features such as memory management, code verification, execution and provides the runtime environment for the program. Due to it acting as a sandbox, it provies most of the security and resources a program needs. |JDK or Java Development Kit is a collection of tools and utilities that are crucial for the development of a Java program. It provides all the packages, tools required by a
programmer to write and execute a Java program. Without the Java Development Kit, we cannot write code, compile or even execute a Java Program. In other words, it provides the foundation of an environment capable
of creating and executing Java programs. |

# Method overloading vs Method overriding
| Method Overloading | Method Overriding |
|---|---|
| It is a compile time polymorphism | It is a runtime polymorphism |
|Helps to increase the readability of the program | Used to grant specific implementation of the method which is already provided by its parent class or superclass.|
| Occurs within the class | Performed in two classes with inheritance relationships. |
| May or may not require inheritance | Always requires inheritance |
| methods must have the same name and different signatures | methods must have same name as well as same signatures |
| the return type can or cannot be the same, but we just have to change the parameter. | the return type must be the same or co-variant. |
| Static binding is being used for overloaded methods. | Dynamic binding is being used for overriding methods. |
| Poor performance | Better performance |
| private and final methods can be overloaded. | private and final methods can't be overridden. |
| argument list should be different | argument list should be the same |


# Thread vs Runnable
|Basis for comparison | Thread | Runnable |
|---|---|---|
| Basic | Each thread creates a unique object and gets associated with it. | Multiple threads share the same objects. |
| Memory | As each thread creates a unique object, more memory required. | As multiple threads share the same object less memory is used. |
| Extending | In Java, multiple inheritance not allowed hence after a class extends Thread class, it cannot extend any other class. | If a  class define thread implementing the Runnable interface it has a change of extending one class. |
| Use | A user must extend thread class only if it wants to override the other methods in Thread class. | If you only want to specialize run method then implementing Runnable is a better option. |
| Coupling | Extending Thread class introduces tight coupling as the class contains code of Thread class and also the job assigned to the thread | Implementing Runnable interface introduces loose coupling as the code of Thread is separate from the job of Threads. |

# Abstract class vs Interface
| Abstract class | Interface |
|---|---|
| To declare an abstract class, we use abstract keyword | To declare an interface we use interface keyword |
| A class extend only one abstract class. | A class implement more than one interfaces. |
| In abstract class relationship we say A in B | In interface relationship, we say A has C, D, & E. |

# Class vs Interface
| Class | Interface |
|---|---|
| The member of a class can be constant or variable. | The member of interface are always declared as constant i.e. their values are final. |
| The class definition can contain the code for each of its method i.e. methods can be abstract or non-abstract. | The method in an interface are abstract in value i.e. there is no code associated with them. |
| It can be initiated by declaring object | It cannot be used to declare object |
| It can use various access specifiers like public, private and protected | It can only use the public access specifier.|

# Swing vs AWT
| Swing | AWT |
|---|---|
| Platform independent |  Not Platform Independent|
| Lightweight | Heavyweight |
| Support pluggable look and feel | Does not support pluggable look and feel |
| Provides more no. of component class | Less no of components |
| Follows MVC | Does not follow MVC |

# Constructor vs Method
| Constructor | Method |
|---|---|
| A block of code that initialize at the time of creating a new object of the class is called constructor. | A set of statements that performs specific task with and without returning value to the caller is known as method. |
| mainly used for initializing the object. | mainly used to reuse the code without writing the code again. |
| implicitly invoked by the system. | called by the programmer. |
| The new keyword plays an important role in invoking the constructor. | Method calls are responsible for invoking methods. |
| It has no return type. It can or cannot return any value to the caller. | has a return type. |
| constructor name will always be the same as the class name. | can use any name for the method name, such as `addRow`, `addNum` and `subNumbers` etc. |
| A class can have more than one parameterized constructor. But constructors should have different parameters. | A class can also have more than one method with the same name but different in arguments and datatypes. |
| Sub-class cannot inherit parent class constructor. | Sub-class can inherit the method of the parent class. |


