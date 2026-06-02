
# Java Date-Time API 

## Overview

This repository contains real-world scenario-based interview questions using the Java 8 Date-Time API. These examples help developers understand practical applications of:

* LocalDate
* LocalTime
* LocalDateTime
* DateTimeFormatter
* Period
* Duration
* ChronoUnit

---

## 1. Calculate Employee Age

### Scenario

An employee enters their date of birth. Calculate their current age.

```java
LocalDate dob = LocalDate.of(2002, 9, 2);

int age = Period.between(dob, LocalDate.now()).getYears();

System.out.println(age);
```

---

## 2. Check Voting Eligibility

### Scenario

A user can vote only if they are 18 years or older.

```java
LocalDate dob = LocalDate.of(2010, 5, 10);

int age = Period.between(dob, LocalDate.now()).getYears();

if(age >= 18) {
    System.out.println("Eligible");
} else {
    System.out.println("Not Eligible");
}
```

---

## 3. Validate User Input Date

### Scenario

Validate a date entered by the user in dd-MM-yyyy format.

```java
String date = "31-02-2026";

DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd-MM-yyyy");

try {
    LocalDate.parse(date, formatter);
    System.out.println("Valid Date");
} catch(Exception e) {
    System.out.println("Invalid Date");
}
```

---

## 4. Check Product Expiry Date

### Scenario

Determine whether a product has expired.

```java
LocalDate expiryDate =
        LocalDate.of(2026, 12, 31);

if(expiryDate.isBefore(LocalDate.now())) {
    System.out.println("Expired");
} else {
    System.out.println("Valid");
}
```

---

## 5. Calculate Days Left for Project Deadline

### Scenario

Find the remaining days before a project deadline.

```java
LocalDate deadline =
        LocalDate.of(2026, 12, 31);

long days =
        ChronoUnit.DAYS.between(
                LocalDate.now(),
                deadline);

System.out.println(days);
```

---

## 6. Check Whether Birthday is Today

### Scenario

Display a birthday message if today matches the user's birthday.

```java
LocalDate birthday =
        LocalDate.of(2002, 6, 2);

LocalDate today = LocalDate.now();

if(birthday.getMonth() == today.getMonth()
        && birthday.getDayOfMonth() == today.getDayOfMonth()) {

    System.out.println("Happy Birthday!");
}
```

---

## 7. Calculate Employee Experience

### Scenario

Calculate the number of years an employee has worked.

```java
LocalDate joiningDate =
        LocalDate.of(2021, 7, 1);

int years =
        Period.between(
                joiningDate,
                LocalDate.now())
                .getYears();

System.out.println(years);
```

---

## 8. Calculate Loan Tenure

### Scenario

Find the duration between loan start and end dates.

```java
LocalDate start =
        LocalDate.of(2025, 1, 1);

LocalDate end =
        LocalDate.of(2027, 1, 1);

Period period =
        Period.between(start, end);

System.out.println(period.getYears() + " Years");
```

---

## 9. Check Weekend or Working Day

### Scenario

Determine whether today is a weekend or a working day.

```java
LocalDate today = LocalDate.now();

if(today.getDayOfWeek().getValue() >= 6) {
    System.out.println("Weekend");
} else {
    System.out.println("Working Day");
}
```

---

## 10. Find Next Sunday

### Scenario

Display the next Sunday from today.

```java
LocalDate date = LocalDate.now();

while(date.getDayOfWeek().getValue() != 7) {
    date = date.plusDays(1);
}

System.out.println(date);
```

---

## 11. Generate Subscription Renewal Date

### Scenario

Generate the renewal date after 30 days.

```java
LocalDate today = LocalDate.now();

LocalDate renewalDate =
        today.plusDays(30);

System.out.println(renewalDate);
```

---

## 12. Calculate Login and Logout Duration

### Scenario

Calculate how many hours a user spent in the application.

```java
LocalDateTime login =
        LocalDateTime.of(2026, 6, 2, 9, 0);

LocalDateTime logout =
        LocalDateTime.of(2026, 6, 2, 18, 0);

long hours =
        Duration.between(login, logout)
                .toHours();

System.out.println(hours);
```

---

## 13. Check Meeting Status

### Scenario

Determine whether a scheduled meeting is completed or upcoming.

```java
LocalDateTime meetingTime =
        LocalDateTime.of(2026, 6, 2, 15, 0);

if(meetingTime.isBefore(LocalDateTime.now())) {
    System.out.println("Meeting Completed");
} else {
    System.out.println("Upcoming Meeting");
}
```

---

## 14. Find Last Day of Current Month

### Scenario

Generate reports on the last day of every month.

```java
LocalDate date = LocalDate.now();

System.out.println(date.lengthOfMonth());
```

---

## 15. Calculate Working Days Between Two Dates

### Scenario

Count business days between two dates.

```java
LocalDate start =
        LocalDate.of(2026, 6, 1);

LocalDate end =
        LocalDate.of(2026, 6, 10);

long workingDays = 0;

while(!start.isAfter(end)) {

    if(start.getDayOfWeek().getValue() < 6) {
        workingDays++;
    }

    start = start.plusDays(1);
}

System.out.println(workingDays);
```

---

## Frequently Asked Interview Scenarios

* Age Calculation
* Date Validation
* Experience Calculation
* Product Expiry Check
* Working Days Calculation
* Subscription Renewal Date
* Birthday Reminder System
* Date Difference Calculation
* Weekend Detection
* Login/Logout Duration

---

## Conclusion

These scenario-based problems demonstrate how the Java Date-Time API is used in real-world applications. Mastering these examples will help you confidently answer practical interview questions and build production-ready Java applications.

