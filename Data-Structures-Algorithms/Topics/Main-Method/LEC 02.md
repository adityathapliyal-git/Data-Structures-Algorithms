# 🌟 Lecture 02 : Object-Oriented Programming Basics (OOP)

---

## 📌 What is a Class?

A **class** is a blueprint for creating objects.  
It defines:

- **Fields (Variables):** Data members
- **Methods (Functions):** Member functions
- **Constructors:** Special methods to initialize objects

**Example:**
```java
class Student {
    int roll;
    String name;

    void eating() {
        System.out.println("Student is eating...");
    }
}
```

---

## 📌 What is an Object?

An **object** is an instance of a class.  
Each object has:

- **State:** Defined by fields
- **Behavior:** Defined by methods

**Example:**
```java
Student s1 = new Student();
s1.eating();
```

---

## 🔄 Real-Life Analogy

- **Class:** Blueprint of a house
- **Object:** Actual house built from the blueprint

---

## 📌 Printing Output in Different Languages

| Language    | Output Statement                      |
|-------------|--------------------------------------|
| C           | `printf("Hello, world!");`           |
| C++         | `cout << "Hello, world!";`           |
| C#          | `Console.WriteLine("Hello, world!");`|
| JavaScript  | `console.log("Hello, world!");`      |
| Python      | `print("Hello, world!");`            |
| Java        | `System.out.println("Hello, world!");`<br>`System.out.print("Hello, world!");`<br>`System.out.printf("Hello, world!");` |

---

## 📌 Reading Input in Different Languages

| Language    | Input Statement                       |
|-------------|--------------------------------------|
| C           | `scanf("%d", &a);`                   |
| C++         | `cin >> a;`                          |
| C#          | `a = Console.ReadLine();`            |
| JavaScript  | `a = prompt();`                      |
| Python      | `a = input();`                       |
| Java        | `Scanner scan = new Scanner(System.in);`<br>`a = scan.next();` |

---

## 📦 Object Example

```java
class Student {
    String name;
    int roll;
    String branch;

    void sleeping() {
        System.out.println("Student is sleeping...");
    }

    void studying() {
        System.out.println("Student is studying...");
    }

    void eating() {
        System.out.println("Student is eating...");
    }
}
```

**Usage:**
```java
Student s1 = new Student();
s1.sleeping();
s1.studying();
s1.eating();
```

---

## 📌 Fan Class Example

```java
class Fan {
    int no_of_wings;
    String brand;
    String color;
    boolean status;

    void start() {
        System.out.println("Fan is starting...");
    }

    void rotate() {
        System.out.println("Fan is rotating...");
    }

    void stop() {
        System.out.println("Fan is stopping...");
    }
}
```

**Usage:**
```java
Fan f1 = new Fan();
f1.start();
f1.rotate();

Fan f2 = new Fan();
f2.start();
f2.stop();

Fan f3 = new Fan();
f3.rotate();
f3.stop();
```

---

## 🧠 Object Memory Representation

| Ref. Var | Object           | Fields (Values)           |
|----------|------------------|---------------------------|
| s1       | Student object   | roll, name, branch        |
| f1       | Fan object       | wings, brand, color, etc. |

---

## ✅ Summary

- A **class** defines structure and behavior.
- An **object** is a real-world instance of a class.
- Java provides tools like constructors, methods, and fields for encapsulation.