`StringTokenizer` is a class in Java that is used to split a string into a series of tokens. A token is a sequence of characters that is considered to be a single unit.

For example, consider the following sentence: "The quick brown fox jumps over the lazy dog." You can use the `StringTokenizer` class to split this sentence into individual words, which are the tokens.

Here is an example of how you can use the `StringTokenizer` class to split a string into tokens:
```java
String sentence = "The quick brown fox jumps over the lazy dog.";
StringTokenizer tokenizer = new StringTokenizer(sentence);

while (tokenizer.hasMoreTokens()) {
    String token = tokenizer.nextToken();
    System.out.println(token);
}
```

In this example, a `StringTokenizer` object is created and initialized with the sentence. The `hasMoreTokens()` method is used to check if there are more tokens to be processed and the `nextToken()` method is used to retrieve the next token.

You can also specify a delimiter that separates the tokens. For example, you can use a space character as the delimiter to split the sentence into words:
```java
String sentence = "The,quick,brown,fox,jumps,over,the,lazy,dog";
StringTokenizer tokenizer = new StringTokenizer(sentence,",");

while (tokenizer.hasMoreTokens()) {
    String token = tokenizer.nextToken();
    System.out.println(token);
}
```

In this example, the delimiter is set to comma(,) and it will use comma as the separator and split the sentence into words.

It's important to note that the StringTokenizer class is considered as legacy and not recommended to use in new codes, instead, you can use split method from the String class or regular expressions (regex) to achieve the same functionality in a more efficient and readable way.