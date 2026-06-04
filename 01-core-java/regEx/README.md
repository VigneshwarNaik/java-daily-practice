# Regular Expressions (Regex) in Java

Regular Expressions (Regex) are used to **search**, **validate**, **extract**, and **replace** text in Java.

---

# Java Regex Classes

Java provides the following classes for working with regular expressions:

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;
```

## Pattern

Compiles the regular expression.

```java
Pattern p = Pattern.compile("\\d+");
```

## Matcher

Matches the compiled pattern against the input string.

```java
Matcher m = p.matcher("123");
```

## matches()

Checks whether the entire input string matches the pattern.

```java
System.out.println(m.matches());
```

**Output**

```text
true
```

---

# Simplest Example

```java
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        boolean result = Pattern.matches("\\d+", "123");

        System.out.println(result);
    }
}
```

**Output**

```text
true
```

---

# Important Regex Symbols

## Digits (`\d`)

Matches a single digit (0-9).

```java
Pattern.matches("\\d", "5");
```

✅ True

```java
Pattern.matches("\\d", "55");
```

❌ False

---

## One or More Digits (`\d+`)

```java
Pattern.matches("\\d+", "12345");
```

✅ True

---

## Zero or More Digits (`\d*`)

```java
Pattern.matches("\\d*", "");
```

✅ True

```java
Pattern.matches("\\d*", "123");
```

✅ True

---

## Zero or One Digit (`\d?`)

```java
Pattern.matches("\\d?", "5");
```

✅ True

```java
Pattern.matches("\\d?", "");
```

✅ True

---

# Quantifiers

| Regex   | Meaning               |
| ------- | --------------------- |
| `+`     | One or more           |
| `*`     | Zero or more          |
| `?`     | Zero or one           |
| `{n}`   | Exactly n times       |
| `{n,m}` | Between n and m times |

### Example

```java
Pattern.matches("\\d{3}", "123");
```

✅ True

```java
Pattern.matches("\\d{3}", "12");
```

❌ False

### Example

```java
Pattern.matches("\\d{2,5}", "1234");
```

✅ True

---

# Character Classes

## `[abc]`

Matches any one character from the set.

```java
Pattern.matches("[abc]", "a");
```

✅ True

```java
Pattern.matches("[abc]", "d");
```

❌ False

---

## `[a-z]`

Matches lowercase letters.

```java
Pattern.matches("[a-z]+", "java");
```

✅ True

---

## `[A-Z]`

Matches uppercase letters.

```java
Pattern.matches("[A-Z]+", "JAVA");
```

✅ True

---

## `[0-9]`

Matches digits.

```java
Pattern.matches("[0-9]+", "123");
```

✅ True

---

## `[a-zA-Z]`

Matches letters only.

```java
Pattern.matches("[a-zA-Z]+", "Java");
```

✅ True

---

# Predefined Character Classes

| Regex | Meaning            |
| ----- | ------------------ |
| `\d`  | Digit              |
| `\D`  | Non-digit          |
| `\w`  | Word character     |
| `\W`  | Non-word character |
| `\s`  | Space              |
| `\S`  | Non-space          |

### Example

```java
Pattern.matches("\\D+", "Java");
```

✅ True

### Example

```java
Pattern.matches("\\w+", "Java123");
```

✅ True

---

# Dot (.)

Matches any single character.

```java
Pattern.matches("a.c", "abc");
```

✅ True

```java
Pattern.matches("a.c", "axc");
```

✅ True

---

# Start and End Anchors

| Symbol | Meaning         |
| ------ | --------------- |
| `^`    | Start of string |
| `$`    | End of string   |

```java
Pattern.matches("^java$", "java");
```

✅ True

---

# Validate an Agent ID

### Requirement

```text
agent001
agent123
agent999
```

### Regex

```java
agent\\d{3}
```

### Example

```java
Pattern.matches("agent\\d{3}", "agent001");
```

✅ True

---

# Validate a Mobile Number

Exactly 10 digits:

```java
Pattern.matches("\\d{10}", "9876543210");
```

✅ True

---

# Validate an Email Address

### Regex

```java
String regex = "[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]{2,}";
```

### Examples

```text
abc@gmail.com
john123@yahoo.com
```

✅ Valid

---

# Find Matches Using Matcher

```java
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("Java123 Python456");

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
```

**Output**

```text
123
456
```

---

# Replace Text Using Regex

```java
String str = "Java123";

String result = str.replaceAll("\\d", "*");

System.out.println(result);
```

**Output**

```text
Java***
```

---

# Common Interview Regex Questions

## Validate Mobile Number

```java
\\d{10}
```

---

## Validate Agent ID

```java
agent\\d{3}
```

---

## Validate PAN Card

```java
[A-Z]{5}[0-9]{4}[A-Z]
```

### Example

```text
ABCDE1234F
```

---

## Validate Password

```java
(?=.*[A-Z])(?=.*\\d).{8,}
```

### Rules

* At least one uppercase letter
* At least one digit
* Minimum 8 characters

---

# Quick Revision

| Regex   | Meaning           |
| ------- | ----------------- |
| `\d`    | Digit             |
| `\D`    | Non-digit         |
| `\w`    | Word character    |
| `\s`    | Space             |
| `.`     | Any character     |
| `+`     | One or more       |
| `*`     | Zero or more      |
| `?`     | Optional          |
| `{3}`   | Exactly 3 times   |
| `[a-z]` | Lowercase letters |
| `[A-Z]` | Uppercase letters |
| `[0-9]` | Digits            |
| `^`     | Start of string   |
| `$`     | End of string     |

---

⭐ Master these basics and you'll be able to solve most regex-related Core Java interview questions.
