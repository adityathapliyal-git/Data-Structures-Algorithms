# 📘 Lecture 03 : Java Programming Basics

---

## ✅ Phases of a Case-Sensitive Programming Language (e.g., Java)

1. **Classroom or Manual Case Conversion**
2. **Electronic to Manual**
3. **Non-Validations to Non-Defined Conversion**
4. **Modification**
5. **Defined Phases to Defined Case Conversion**
6. **Mechanism to Algorithmic (Compiler + Rules)**

---

## 🧠 Naming Conventions in Java

- **PascalCase:** Class names  
  _Example: `StudentDetails`_
- **camelCase:** Method names  
  _Example: `calculateTotal()`_
- **kebab-case:** Not used in Java
- **snake_case:** Occasionally for constants  
  _Example: `MAX_SIZE`_

---

## 📥 Input in Java (Using `Scanner`)

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

**Common Scanner Methods:**
- `nextInt()`
- `nextFloat()`
- `nextBoolean()`
- `nextDouble()`
- `nextLine()`
- `next()`

---

## 🖨️ Output in Java

**Display output message:**
```java
System.out.print("Hello, world!");
```

**Display error message:**
```java
System.err.print("Invalid Input!");
```

---

## ⚙️ Main Method in Java

### Operating System → Programming Language

| OS                   | Programming Language         |
|----------------------|-----------------------------|
| Windows (Microsoft)  | C/C++ (MT to MEXE)          |
| Linux (UNIX)         | C (Environment)             |
| macOS                | Java (source → bytecode → JVM) |

---

## 📝 Main Method Structure

The main method is the **entry point** of a Java program.  
It allows the OS to call the program through the JVM without creating an object of the class.

**Standard Syntax:**
```java
public static void main(String[] args)
```

**Keywords Explained:**
- `public`: Access modifier (visible to JVM)
- `static`: No need to create object
- `void`: No return type
- `main`: Method name
- `String[] args`: Accepts command line arguments

---

## 📌 Notes

- The main method is **mandatory** in a Java program.
- Without `static`, the OS cannot access `main()` directly.
- Without `public`, the method won’t be visible to JVM.
- Without `String[] args`, the program won't accept command-line inputs.
- The method signature **must match exactly**.

> 💡 **Standard Signature:**
> ```java
> public static void main(String[] args)
> ```
