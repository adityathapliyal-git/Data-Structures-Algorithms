# COMPLETE NOTES : Conditionals
---

### 🧠 Topics Covered:
- If / If-Else
- Multiple Conditions using `&&`, `||`
- Nested If-Else
- Else-If Ladder
- Ternary Operator
- Switch Case
- Practice Questions + Homework

---

## 🔹 IF / IF-ELSE

### 💡 Question:
Take positive integer input and tell if it is even or odd.
```java
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### 🏠 Homework:
Take positive integer input and tell if it is divisible by 5 or not.

---

### 💡 Question:
Take integer input and print the absolute value of that integer.
```java
if (number < 0) {
    number = -number;
}
System.out.println("Absolute value: " + number);
```

---

### 💡 Question:
If cost price and selling price of an item is input through the keyboard, write a program to determine whether:
- Profit or
- Loss or
- No Profit No Loss  
Also calculate the amount.
```java
if (sp > cp) {
    System.out.println("Profit = " + (sp - cp));
} else if (cp > sp) {
    System.out.println("Loss = " + (cp - sp));
} else {
    System.out.println("No Profit No Loss");
}
```

### 🏠 Homework:
Given the length and breadth of a rectangle, write a program to find whether the **area** is greater than the **perimeter**.

---

## 🔹 MULTIPLE CONDITIONS (`&&`, `||`)

### 💡 Question:
Take positive integer input and tell if it is a three-digit number or not.
```java
if (number >= 100 && number <= 999) {
    System.out.println("Three-digit number");
} else {
    System.out.println("Not a three-digit number");
}
```

### 🏠 Homework:
Take positive integer input and tell if it is a **five-digit** number or not.

---

### 💡 Question:
Take positive integer input and tell if it is divisible by **5 or 3**.
```java
if (number % 5 == 0 || number % 3 == 0) {
    System.out.println("Divisible by 5 or 3");
}
```

---

### 💡 Question:
Take 3 numbers input and tell if they can be the **sides of a triangle**.
```java
if (a + b > c && a + c > b && b + c > a) {
    System.out.println("Valid Triangle");
} else {
    System.out.println("Invalid Triangle");
}
```

---

### 💡 Question:
Take 3 positive integers input and print the **greatest** of them.
```java
if (a >= b && a >= c) {
    System.out.println("Greatest = " + a);
} else if (b >= c) {
    System.out.println("Greatest = " + b);
} else {
    System.out.println("Greatest = " + c);
}
```

### 🏠 Homework:
Take 3 positive integers input and print the **least** of them.

---

## 🔹 NESTED IF-ELSE

### 💡 Question:
Take 3 positive integers input and print the greatest of them (nested logic version).
```java
if (a > b) {
    if (a > c) {
        System.out.println("Greatest = " + a);
    } else {
        System.out.println("Greatest = " + c);
    }
} else {
    if (b > c) {
        System.out.println("Greatest = " + b);
    } else {
        System.out.println("Greatest = " + c);
    }
}
```

### 🏠 Homework:
If the ages of Ram, Shyam and Ajay are input, write a program to determine the **youngest** of the three.

---

## 🔹 ELSE-IF LADDER

### 💡 Question:
Take input percentage of a student and print the Grade:

| Percentage | Grade      |
|------------|------------|
| 81–100     | Very Good  |
| 61–80      | Good       |
| 41–60      | Average    |
| ≤ 40       | Fail       |

```java
if (percent >= 81) {
    System.out.println("Very Good");
} else if (percent >= 61) {
    System.out.println("Good");
} else if (percent >= 41) {
    System.out.println("Average");
} else {
    System.out.println("Fail");
}
```

### 🏠 Homework:
Given a point `(x, y)`, determine if it lies in:
- Quadrant I / II / III / IV
- On X-axis, Y-axis, or Origin

---

## 🔹 TERNARY OPERATOR

### Syntax:
```java
result = (condition) ? valueIfTrue : valueIfFalse;
```

Example:
```java
String result = (num % 2 == 0) ? "Even" : "Odd";
```

---

## 🔹 SWITCH STATEMENT

### Syntax:
```java
switch (expression) {
    case value1:
        // statements
        break;
    case value2:
        // statements
        break;
    ...
    default:
        // default statements
}
```

### 💡 Question:
Write a calculator program using switch case and functions. Input two numbers and an operator (`+`, `-`, `*`, `/`) from the user.

---

## 🔹 MCQ TIME – Predict the Output

### 🔍 Question 1:
```java
public static void main(String[] args) {
    int x = 10, y = 20;
    if (x == y); // Semicolon ends if
    System.out.print(x + " " + y);
}
```
> Output: `10 20`

---

### 🏠 Homework – Predict the Output:
```java
public static void main(String[] args) {
    int x = 3, y = 5;
    if (x == 3)
        System.out.print(x);
    else;
        System.out.print(y);
}
```
> Output: `35` (due to semicolon after `else`)