# COMPLETE NOTES : LOOPS

  - `for`, `while`, `do-while`
  - Break & Continue
  - Loop-based problems
  - Pattern-based problems
  - Operator-based problems

---

## 🔄 What & Why of Loops?

Loops help in repeating a block of code multiple times without rewriting it. This improves readability, reduces errors, and allows handling repetitive tasks effectively.

---

## 🔁 For Loop

### 📌 Syntax:
```java
for(initialization; condition; increment/decrement){
    // code block
}
```

### 📍 Example:
```java
for(int i = 1; i < 10; i++) {
    System.out.println("Hello World");
}
```

### 📥 Problem: Print "Hello World" `n` times
```java
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i = 0; i < n; i++) {
    System.out.println("Hello World");
}
```

---

### 🧮 Number Problems

#### ✅ Print numbers from 1 to 100
```java
for(int i = 1; i <= 100; i++) {
    System.out.println(i);
}
```

#### ✅ Print all even numbers from 1 to 100
```java
for(int i = 2; i <= 100; i += 2) {
    System.out.println(i);
}
```

#### 🏠 HW: Print all odd numbers from 1 to 100
```java
for(int i = 1; i <= 100; i += 2) {
    System.out.println(i);
}
```

#### ✅ Print table of 19
```java
for(int i = 1; i <= 10; i++) {
    System.out.println("19 x " + i + " = " + (19*i));
}
```

#### 🏠 HW: Print table of user input number `n`
```java
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i = 1; i <= 10; i++) {
    System.out.println(n + " x " + i + " = " + (n*i));
}
```

---

## 🔢 Arithmetic Progression (AP)

#### ✅ AP: 1, 3, 5, 7, ... up to `n` terms
```java
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a = 1;
for(int i = 1; i <= n; i++) {
    System.out.print(a + " ");
    a += 2;
}
```

#### 🏠 HW: AP: 4, 7, 10, 13... up to `n` terms
```java
int a = 4;
int d = 3;
for(int i = 1; i <= n; i++) {
    System.out.print(a + " ");
    a += d;
}
```

---

## 🧮 Geometric Progression (GP)

#### ✅ GP: 1, 2, 4, 8, 16... up to `n` terms
```java
int a = 1;
for(int i = 1; i <= n; i++) {
    System.out.print(a + " ");
    a *= 2;
}
```

#### 🏠 HW: GP: 3, 12, 48... up to `n` terms
```java
int a = 3;
for(int i = 1; i <= n; i++) {
    System.out.print(a + " ");
    a *= 4;
}
```

---

## ⛔ Break Statement

### ✅ Problem: Check if a number is Composite
```java
int n = sc.nextInt();
boolean isComposite = false;
for(int i = 2; i < n; i++) {
    if(n % i == 0){
        isComposite = true;
        break;
    }
}
System.out.println(isComposite ? "Composite" : "Not Composite");
```

### ✅ Problem: Check if a number is Prime
```java
boolean isPrime = true;
for(int i = 2; i <= Math.sqrt(n); i++) {
    if(n % i == 0){
        isPrime = false;
        break;
    }
}
System.out.println(isPrime ? "Prime" : "Not Prime");
```

---

## 🔁 Continue Statement

### ✅ Print all odd numbers from 1 to 100
```java
for(int i = 1; i <= 100; i++) {
    if(i % 2 == 0) continue;
    System.out.println(i);
}
```

---

## 🔄 While Loop

### 📌 Syntax:
```java
int i = 0;
while(i < 10){
    // code
    i++;
}
```

---

## 🔂 Do-While Loop

### 📌 Syntax:
```java
do {
    // code
} while(condition);
```

---

## 🧠 Predict Output

1.
```java
int x = 1;
while(x == 1)
    x = x - 1;
System.out.print(x);
```
**Output**: 0

2.
```java
int i;
while(i = 10){
    System.out.print(i);
    i++;
}
```
**Error**: Cannot convert from int to boolean.

3.
```java
while('a' < 'b')
    System.out.println("malayalam is a palindrome");
```
**Infinite Loop**

4.
**HW Output Prediction**
```java
int x = 4, y = 0;
while(x >= 0){
    x--; y++;
    if(x == y) continue;
    else System.out.println(x + " " + y);
}
```

---

## 🔢 Operator-based Questions

### ✅ Count digits of a number
```java
int n = sc.nextInt();
int count = 0;
while(n != 0){
    n /= 10;
    count++;
}
System.out.println("Digits: " + count);
```

### ✅ Sum of digits
```java
int sum = 0;
while(n != 0){
    sum += n % 10;
    n /= 10;
}
System.out.println("Sum: " + sum);
```

### 🏠 HW: Product of digits
```java
int product = 1;
while(n != 0){
    product *= n % 10;
    n /= 10;
}
System.out.println("Product: " + product);
```

### 🏠 HW: Sum of even digits
```java
int sum = 0;
while(n != 0){
    int digit = n % 10;
    if(digit % 2 == 0)
        sum += digit;
    n /= 10;
}
System.out.println("Sum of even digits: " + sum);
```

### ✅ Reverse of number
```java
int rev = 0;
while(n != 0){
    rev = rev * 10 + n % 10;
    n /= 10;
}
System.out.println("Reversed: " + rev);
```

### 🏠 HW: Sum of number and its reverse
```java
int original = n;
int rev = 0;
while(n != 0){
    rev = rev * 10 + n % 10;
    n /= 10;
}
System.out.println("Sum: " + (original + rev));
```

---

## ❗ Factorial

### ✅ Factorial of `n`
```java
int fact = 1;
for(int i = 1; i <= n; i++) {
    fact *= i;
}
System.out.println("Factorial: " + fact);
```

### 🏠 HW: Factorials of first `n` numbers
```java
for(int i = 1; i <= n; i++){
    int fact = 1;
    for(int j = 1; j <= i; j++){
        fact *= j;
    }
    System.out.println("Factorial of " + i + ": " + fact);
}
```

---

## 🧠 ASCII Values of Alphabets

### 🏠 HW: Print all ASCII values of A-Z using while loop
```java
char ch = 'A';
while(ch <= 'Z'){
    System.out.println((int)ch + " => " + ch);
    ch++;
}
```
