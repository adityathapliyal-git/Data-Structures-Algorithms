# COMPLETE NOTES : Basics

---

## 🖨️ Output in Java

* `System.out.print("text")` → Prints text on the **same line**
* `System.out.println("text")` → Prints text **followed by a new line**

### 🔸 Example:

```java
System.out.print("Hello PW");
System.out.print("Hello CW");
// Output: Hello PWHello CW

System.out.println("Hello PW");
System.out.print("Hello CW");
// Output:
// Hello PW
// Hello CW
```

---

## 🧮 Variables and Their Declaration

* Think of **variables as containers**
* Focus on `int` type initially

```java
int x = 5;
System.out.println(x); // 5

x = 7;
System.out.println(x); // 7

x = x + 6; // 13
x = x - 20; // -7
System.out.println(x);
```

---

## ➕ Arithmetic Operations (`int`)

```java
int x = 5, y = 2;
System.out.println(x + y);  // 7
System.out.println(x - y);  // 3
System.out.println(x * y);  // 10
System.out.println(x / y);  // 2 (integer division)
```

---

## 🔁 Increment & Decrement

### ❌ Incorrect in PPT:

```java
x +;
x -;
+x;
--x;
```

### ✅ Correct Syntax:

```java
x++; // Post-increment
x--; // Post-decrement
++x; // Pre-increment
--x; // Pre-decrement
```

---

## 🔢 Data Types

```java
double d = 3.1;
float f = 2.87f;
char ch = 'a';
```

---

## 📐 Examples

* **Area of Circle** → `area = 3.14 * r * r`
* **Volume of Sphere** → `volume = (4/3) * 3.14 * r * r * r`
* **Simple Interest** → `SI = (P * R * T) / 100`

---

## 💬 Variable Naming Rules

* Can start with: **letter**, **underscore `_`**, or **dollar sign `$`**
* **No spaces**, **no special characters** (except `_` and `$`)
* **Keywords not allowed**

### ❌ Invalid Examples:

```
#MEAN
population in 2006
team’svictory
422
basic-hra
```

### ✅ Valid Examples:

```
_basic
$salary
mindOverMatter
queue2015
```

---

## 🔢 Taking Input

```java
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
System.out.println("Sum: " + (num1 + num2));
```

### Example: Square of a number

```java
int x = sc.nextInt();
System.out.println(x * x);
```

---

## ➗ Modulus Operator

```java
System.out.println(5 % 2); // Output: 1
```

---

## 🔁 Typecasting

```java
int x = 5;
System.out.println((double)x / 2); // Output: 2.5
```

---

## ⚙️ Operator Hierarchy

```java
int i = 2 * 3 / 4; // i = 6 / 4 = 1
```

* Priority: `*`, `/`, `%` before `+`, `-`
* Left to right associativity

---

## 🔤 Char and ASCII

```java
char ch = 'a';
System.out.println((int)ch); // Output: 97
```

---

## ❓ MCQs & Homework

### 🧠 Homework:

1. Calculate **Volume of a Sphere**
2. Calculate **Simple Interest**

### ❓ MCQs:

1. `b = 6.6 / a + 2 * n;` → What executes first?

   * ✅ `2 * n` (highest precedence)

2. Which statement is **false**?

   * ❌ Blank spaces **cannot** be inserted **within** a variable name

3. `double a = 7 / 22 * (3.14 + 2) * 3 / 5;`

   * Output: `0.0` (integer division issue)

4. `int x = 4 + 2 % -8;`

   * `%` result is 2, so `x = 4 + 2 = 6`
   * ✅ Answer: 6

---

> 🔚 These are fundamental building blocks of Java + DSA. Mastering them is key to writing efficient and correct programs.
