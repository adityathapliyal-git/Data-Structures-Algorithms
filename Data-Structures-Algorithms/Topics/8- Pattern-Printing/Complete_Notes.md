# COMPLETE NOTES : PATTERN PRINTING

Welcome to your **Java + DSA Pattern Printing** resource! This file includes classic Java pattern questions, complete with code and visual representation for easier understanding and practice.

---

## 🧱 Prerequisites

- Java Syntax
- Loops (`for`, `while`)
- Nested Loops

---

## 🟫 Square and Rectangle Patterns

### 🔹 1. Solid Square

```
* * * *
* * * *
* * * *
* * * *
```

```java
int n = 4;
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### 🔹 2. Solid Rectangle

```
* * * * *
* * * * *
* * * * *
* * * * *
```

```java
int rows = 4;
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### 🔹 3. Number Square

```
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
```

```java
int rows = 4, columns = 4;
for (int i = 0; i < rows; i++) {
    for (int j = 1; j <= columns; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

### 🔹 4. Alphabet Square

```
A B C D
A B C D
A B C D
A B C D
```

```java
int rows = 4;
for (int i = 0; i < rows; i++) {
    for (char ch = 'A'; ch < 'A' + rows; ch++) {
        System.out.print(ch + " ");
    }
    System.out.println();
}
```

## 🔺 Triangle Patterns

### 🔹 5. Star Triangle

```
*
* *
* * *
* * * *
```

```java
int rows = 4;
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### 🔹 6. Star Triangle Reverse

```
* * * *
* * *
* *
*
```

```java
int rows = 4;
for (int i = rows; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### 🔹 7. Number Triangle

```
1
1 2
1 2 3
1 2 3 4
```

```java
int rows = 4;
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

### 🔹 8. Odd Number Triangle

```
1
1 3
1 3 5
1 3 5 7
```

```java
int rows = 4;
for (int i = 0; i < rows; i++) {
    int num = 1;
    for (int j = 0; j <= i; j++) {
        System.out.print(num + " ");
        num += 2;
    }
    System.out.println();
}
```

### 🔹 9. Binary Triangle

```
1
0 1
1 0 1
0 1 0 1
```

```java
int rows = 4;
for (int i = 0; i < rows; i++) {
    int value = (i + 1) % 2;
    for (int j = 0; j <= i; j++) {
        System.out.print(value + " ");
        value = 1 - value;
    }
    System.out.println();
}
```

### 🔹 10. Number Triangle Flipped

```
      *
    * *
  * * *
* * * *
```

```java
int rows = 4;
for (int i = rows - 1; i >= 0; i--) {
    for (int j = 0; j < i; j++) {
        System.out.print("  ");
    }
    for (int k = i; k < rows; k++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### 🔹 11. Star Triangle Flipped

```
   *
  **
 ***
****
```

```java
int rows = 4;
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++) {
        System.out.print("*");
    }
    System.out.println();
}
```

## 💠 Special Patterns

### 🔹 12. Floyd’s Triangle

```
1
2 3
4 5 6
7 8 9 10
```

```java
int rows = 4, number = 1;
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(number++ + " ");
    }
    System.out.println();
}
```

### 🔹 13. Star Plus

```
  *
  *
*****
  *
  *
```

```java
int rows = 5;
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < rows; j++) {
        if (i == 2 || j == 2) System.out.print("*");
        else System.out.print(" ");
    }
    System.out.println();
}
```

### 🔹 14. Star Cross

```
*     *
 *   *
  * *
   *
  * *
 *   *
*     *
```

```java
int size = 5;
for (int i = 0; i < size; i++) {
    for (int j = 0; j < size; j++) {
        if (i == j || i + j == size - 1) System.out.print("* ");
        else System.out.print("  ");
    }
    System.out.println();
}
```

## 💎 Composite Patterns

### 🔹 15. Rhombus

```
   ****
  ****
 ****
****
```

### 🔹 16. Star Pyramid

```
   *
  ***
 *****
*******
```

### 🔹 17. Number Pyramid Palindrome

```
   1
  1 2 1
 1 2 3 2 1
1 2 3 4 3 2 1
```

### 🔹 18. Star Bridge

```
*******
*** ***
**   **
*     *
```

### 🔹 19. Number Bridge

```
1 2 3 4 5 6 7
1 2 3   5 6 7
1 2       6 7
1           7
```

### 🔹 20. Number Spiral

```
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
```

---

## 📌 Next Steps

In the upcoming lectures:
- Functions
- Arrays
- More advanced patterns