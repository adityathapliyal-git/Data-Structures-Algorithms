# COMPLETE NOTES : ARRAY & ARRAYLIST

## 📌 Introduction to Arrays

- An **array** is a data structure that stores multiple values of the same type in a single variable.
- It allows **random access** to elements using **indexing**.
- Indexing in Java starts from **0**.

---

## 🧾 Syntax and Declaration

```java
// Declaration
int[] arr;
int arr[];

// Initialization
arr = new int[5];
int[] arr = {1, 2, 3, 4, 5};
```

---

## 🎯 Accessing Elements in an Array

```java
int[] arr = {10, 20, 30};
System.out.println(arr[0]); // Output: 10
```

---

## 🖨️ Taking Input & Printing Output

```java
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int[] arr = new int[size];

for(int i = 0; i < size; i++) {
    arr[i] = sc.nextInt();
}

for(int i = 0; i < size; i++) {
    System.out.print(arr[i] + " ");
}
```

---

## 📏 Length Operator

- To get the size of an array:
```java
arr.length
```

---

## 🧠 Basic Array Problems

### Q1: Print roll numbers of students scoring less than 35
```java
for (int i = 0; i < arr.length; i++) {
    if (arr[i] < 35) {
        System.out.println(i);
    }
}
```

---

### Q2: Validity of Declarations
```java
int a(25);              // ❌ Incorrect
int size = 10, b[size]; // ❌ Incorrect in Java
int[] c = {0, 1, 2};    // ✅ Correct
```

---

### Q3: Which element is `num[4]`?
- It refers to the **5th element** (index starts from 0).

---

### Q4: Predict the Output
```java
int[] num = new int[26];
num[0] = 100;
num[25] = 200;
int temp = num[25];
num[25] = num[0];
num[0] = temp;
System.out.println(num[0] + " " + num[25]); // Output: 200 100
```

---

### Q5: Sum of All Elements
```java
int sum = 0;
for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}
```

---

### Q6: Find Maximum Value
```java
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

---

### Q7: Find Second Largest Element
- Approach:
  - First find max
  - Then find max of rest (excluding the first max)

---

## ❓ MCQs

### Q: Difference between the 5’s:
```java
int num[] = new int[5];
num[5] = 11;
```
**Ans**: (2) First is array size, second is particular element

---

### Q: If subscript exceeds array size?
**Ans**: (4) Error message from the compiler

---

## ✅ TRUE or FALSE

1. `int[] num = new int[26];` has 26 elements. → ✅ True  
2. `num[1]` designates first element. → ❌ False (0-based indexing)  
3. Array must be initialized at declaration. → ❌ False  
4. `num[27]` is 28th element. → ✅ True  

---

## 🔢 Count Elements Greater Than `x`
```java
int count = 0;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] > x) {
        count++;
    }
}
```

---

## 🛠️ Point Out the Error

```java
// No error in the below code
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
    }
}
```

---

## 📤 Passing Arrays to Methods

- Arrays are passed by **reference**.
- **What gets passed?** → Address of first element  
```java
void printArray(int[] arr) {
    for (int i : arr)
        System.out.print(i + " ");
}
```

---

## 🧺 ArrayList in Java

### Basic Operations:
- `add(element)`
- `get(index)`
- `size()`
- `remove(index)`
- `contains(element)`

---

## 💡 Array Problems (Advanced)

### Q8: Two Sum (Find Doublet with Given Sum)
```java
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == x) {
            System.out.println(arr[i] + ", " + arr[j]);
        }
    }
}
```

---

### Q9: Reverse Array (No Extra Array)
```java
int start = 0, end = arr.length - 1;
while (start < end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
}
```

---

### Q10: Rotate Array by `k` Steps
```java
k = k % arr.length; // In case k > n

// Logic: Reverse parts and then whole
```

---

### Q11: Sort Array of 0s and 1s
```java
int zeroCount = 0;
for (int num : arr) {
    if (num == 0) zeroCount++;
}
for (int i = 0; i < arr.length; i++) {
    arr[i] = (i < zeroCount) ? 0 : 1;
}
```

---

### Q12: Sort Array of 0s, 1s, 2s (Dutch Flag)
```java
int low = 0, mid = 0, high = arr.length - 1;
while (mid <= high) {
    if (arr[mid] == 0) swap(low++, mid++);
    else if (arr[mid] == 1) mid++;
    else swap(mid, high--);
}
```

---

### Q13: Merge Two Sorted Arrays
- Use two-pointer approach.

---

### Q14: Next Greatest Element
- Use stack or loop in reverse order.

---

## 🙏 THANK YOU
