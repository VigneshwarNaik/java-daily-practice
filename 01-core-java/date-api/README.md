# Java Date & Time API 

### Legacy Date API

* Date
* Calendar
* SimpleDateFormat

### Java 8 Date-Time API

* LocalDate
* LocalTime
* LocalDateTime
* Instant
* DateTimeFormatter
* Period
* Duration

---


### 1. What is the difference between Date and LocalDate?

**Date**

* Part of the old Java Date API.
* Stores both date and time.

**LocalDate**

* Introduced in Java 8.
* Stores only date (year, month, day).
* Immutable and thread-safe.

---

### 2. What is the difference between LocalDate, LocalTime, and LocalDateTime?

```java
LocalDate      // Date only
LocalTime      // Time only
LocalDateTime  // Date and Time
```

---

### 3. How do you get the current date?

```java
LocalDate date = LocalDate.now();
```

---

### 4. How do you create a specific date?

```java
LocalDate date = LocalDate.of(2026, 9, 2);
```

---

### 5. How do you format a date?

```java
DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd-MM-yyyy");

String formattedDate = date.format(formatter);
```

---

### 6. What is DateTimeFormatter?

`DateTimeFormatter` is used to format and parse dates in the Java 8 Date-Time API.

---

### 7. How do you validate a date?

```java
try {
    LocalDate.parse(
        "02-09-2002",
        DateTimeFormatter.ofPattern("dd-MM-yyyy")
    );
    System.out.println("Valid Date");
} catch (Exception e) {
    System.out.println("Invalid Date");
}
```

---

### 8. Difference between format() and parse()

| Method   | Purpose       |
| -------- | ------------- |
| format() | Date → String |
| parse()  | String → Date |

---

### 9. How do you compare two dates?

```java
date1.isBefore(date2);

date1.isAfter(date2);

date1.isEqual(date2);
```

---

### 10. What is Instant?

`Instant` represents a timestamp in UTC.

```java
Instant instant = Instant.now();
```

---

### 11. What is SimpleDateFormat?

`SimpleDateFormat` is an old API class used to format and parse Date objects.

```java
SimpleDateFormat sdf =
        new SimpleDateFormat("dd-MM-yyyy");
```

---

### 12. Why is DateTimeFormatter preferred over SimpleDateFormat?

* Thread-safe
* Immutable
* Better API design
* Part of Java 8 Date-Time API

---

### 13. What is Calendar?

`Calendar` is an old API class used to manipulate dates and times before Java 8.

```java
Calendar cal = Calendar.getInstance();
```

---

### 14. How do you add 10 days to a date?

```java
LocalDate newDate =
        LocalDate.now().plusDays(10);
```

---

### 15. How do you subtract a month?

```java
LocalDate newDate =
        LocalDate.now().minusMonths(1);
```

---

### 16. What is Period?

`Period` represents a date-based amount of time.

```java
Period period =
        Period.between(startDate, endDate);
```

---

### 17. What is Duration?

`Duration` represents a time-based amount such as hours, minutes, and seconds.

```java
Duration duration =
        Duration.between(time1, time2);
```

---

### 18. Is LocalDate mutable or immutable?

`LocalDate` is immutable.

```java
LocalDate date = LocalDate.now();

date.plusDays(5);
```

The original object is not modified.

---

### 19. How do you check whether a year is a leap year?

```java
LocalDate date = LocalDate.of(2024, 1, 1);

System.out.println(date.isLeapYear());
```

---

### 20. What are the most commonly used Date-Time API classes?

```java
LocalDate
LocalTime
LocalDateTime
DateTimeFormatter
Period
Duration
Instant
```

---

## Conclusion

The Java 8 Date-Time API provides a modern, thread-safe, and easy-to-use approach for handling dates and times. Understanding these concepts is essential for Java interviews and real-world development.
