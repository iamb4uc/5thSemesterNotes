In Java, an object can be passed as a function argument by passing a reference to the object. This is done by passing the object's variable name as the argument when calling the function. For example, consider the following class:

```java
class Example {
    int value;

    public Example(int v) {
        value = v;
    }
}
```

An instance of this class can be created and passed as an argument to a function like this:

```java
Example ex = new Example(5);
modifyValue(ex);

public void modifyValue(Example e) {
    e.value = 10;
}
```

In this example, the `modifyValue()` function takes an `Example` object as its parameter and modifies the `value` field of the object. The changes made to the `value` field inside the function will be reflected in the `ex` object outside the function because we passed the reference of the object.

Alternatively, you can use the object's class type as the parameter type instead of the object itself. Like this:

```java
modifyValue(Example e)
```

It will work the same as passing the object itself.