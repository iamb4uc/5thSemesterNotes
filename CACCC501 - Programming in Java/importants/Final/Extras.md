# Explain command line arguments with program.

- argument that is passed at the time of run-time
- here, the arguments that the user passes can be received by the java program as input.
- it provides a convenient way to check the behavior of the program for the different values.
- You can pass N (1,2,3 and so on) numbers of arguments from the command prompt.

## Program::
[[Java Programs#Command line argument]]

# Typecasting in Java
- process that converts a datatype into another datatype in both ways manually and automatically.
- Automatic conversion is done by the compiler and manual conversion performed by the programmer.

## Types of Typecasting
### Implicit typecasting
- automatically performed by the compiler
- converts a lower datatype into a higher one.
- also known as widening casting
- safe as there is no chance of loss of data
- Takes place when:
	- Both datatype are compatible with each other.
	- Target type must be larger than the source type.
 
 **Hierarchical list:**
```java
byte -> short -> char -> int -> long -> float -> double  
```
### Explicit typecasting
- manually performed by the programmer.
- converts higher datatypes into a lower one
- also known as narrowing typecasting
- If we do not perform casting then the compiler reports a compile-time error.

**Hierarchical list:**
```java
double -> float -> long -> int -> char -> short -> byte  
```


# [[StringBuffer]] class
- used to create and manipulate strings
- similar to the `String` class but it is **mutable** 
	- meaning that its values can be changed after it is created.
- it can be thought of as a container for a collection of characters.
- You can
	- add characters to the container
	- remove characters from the container
	- change the order of the characters in the container

`StringBuffer`***is generally used in situation where a large number of modifications are to be made to a string or where the performance is crucial as*** `StringBuffer` ***is mutable and thread-safe, unlike*** `String` ***which is immutable and not thread-safe.***

# [[StringTokenizer]]
- it is a class in java that is used to split a string into a series of tokens.
- *token is a sequence of characters that is considered to be a single unit.*

For example, consider the following sentence: "This is a string."

You can use the `StringTokenizer` class to split this sentence into individual words,  which are the tokens.

Here is an example of how you can use the `StringTokenizer` class to split a string into tokens:
```java
String sentence = "This is a string.";
StringTokenizer tokenizer = new StringTokenizer(sentence);

while (tokenizer.hasMoreTokens()) {
    String token = tokenizer.nextToken();
    System.out.println(token);
}
```

Here,
- `StringTokenizer` object is created
- `hasMoreTokens()` method is used to check if there are more tokens to be processed.
- `nextToken()` is used to retrieve the next token.

You can also specify a delimiter that separates the tokens. For example, you can use a space character as the delimiter to split the sentence into words:

```java
String sentence = "This,is,a,string."
StringTokenizer tokenizer = new StringTokenizer(sentence,",");

while (tokenizer.hasMoreTokens()) {
    String token = tokenizer.nextToken();
    System.out.println(token);
}
```

