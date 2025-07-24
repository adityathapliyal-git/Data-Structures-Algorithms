# 📚 Data Types in Programming

---

## 🔍 What are Data Types?

**Data Types** are the **classification or categorization** of data items.  
They define the type of data a variable can hold (e.g., integer, float, character).

**Purpose:**
- Specify what operations can be performed on the data
- Determine memory allocation
- Define binary representation (0s and 1s)

---

## ❓ Why are Data Types Needed?

When a program runs:
1. **Raw input** is converted to **binary (0s and 1s)** using a System Operating Procedure (SOP).
2. These binary values are processed in **RAM** by the **microprocessor**.
3. **Uniformity, error prevention, and optimized execution** require every data item to follow a **predefined structure**—this is enforced by data types.

---

## 🧠 Visual Representation

```text
Data 
  └── categorized into ──> Data Types
                             └── converted into ──> Binary (0s & 1s) [via SOP]
                                                           └── executed by ──> RAM & Microprocessor
```

---

## 🎯 Purpose of Data Types

- 🔐 **Type Safety:** Prevents unintended operations (e.g., adding a string to a number)
- 🧠 **Logic Clarity:** Helps write meaningful, structured code
- 💾 **Memory Management:** Allocates only the required memory
- ⚙️ **Efficient Execution:** Organizes data for better performance

---

## 🗂️ Categories of Data Types

| Category         | Description                              | Examples                     |
|------------------|------------------------------------------|------------------------------|
| **Primitive**    | Basic types provided by the language     | int, char, float, boolean    |
| **Derived**      | Types derived from primitive types       | array, pointer, function     |
| **User-defined** | Custom types created by the programmer   | struct, class, union, enum   |

---

## 🧾 Real-Life Analogy

Imagine a toolbox:
- Each compartment (data type) holds a **specific kind of tool (data)**
- Ensures tools are **easy to find** and used **correctly**
- Without organization, tools get **mixed up**, causing **errors**

---

## 🔄 Summary

- Data types are **essential** for defining data behavior in a program.
- They ensure **predictability**, **efficiency**, and **error prevention**.
- Without data types, programming would be **unstructured and unreliable**.

---

# 📘 Java Data Types and Representation

---

## 🔠 ASCII and Unicode in Java

- **ASCII:**  
  - Developed by ANSI (1960s), 7-bit (128 chars), extended to 8-bit (256 chars)
  - Multiple regional formats (ISCII, VSCII, etc.)
- **Unicode:**  
  - Introduced by Unicode Consortium (1991)
  - Goal: Unique, Unified, Universal Encoding
  - Formats:  
    - UTF-8 (1–4 bytes)  
    - **UTF-16 (2 or 4 bytes)** ← Used in Java  
    - UTF-32 (4 bytes)
  - Java `char` uses UTF-16 (16-bit = 65,536 symbols)
  - Unicode v1.0 (1991): 7,129 symbols  
    Unicode v15.1 (2023): 149,813 symbols

---

## 🔢 Default Data Types of Real Numbers in Java

- Decimal literals like `45.75` are **`double`** by default.
  - `double a = 45.75;` ✅ (optional `D`/`d` suffix)
  - `float a = 45.75;` ❌ (type error)
- **Valid float assignments:**
  1. `float a = 45.75F;` or `45.75f;`
  2. `float a = (float) 45.75;`

---

## 🧠 Floating-Point Representation

**IEEE-754 Double-Precision Format**  
For `double a = 844.726;` (64 bits = 8 bytes):
- Sign: 1 bit  
- Exponent: 11 bits (with bias of 1023)  
- Mantissa: 52 bits

```
0 | 10000001000 | 101001100101110011110110...
```

---

## 🧪 Floating-Point Literals

| Standard Notation | Power of 10         | Scientific Notation (E)        |
|-------------------|----------------------|--------------------------------|
| 123.4             | 1.234 × 10²          | 1.234E2 / 1.234e2              |
| 72.543            | 7.2543 × 10¹         | 7.2543E1                       |
| 400               | 4.0 × 10²            | 4.0e2 / 4e2                    |
| 0.354             | 3.54 × 10⁻¹          | 3.54E-1 (mandatory)            |
| -0.0003159        | -3.159 × 10⁻⁴        | -3.159e-4                      |

- `E/e` is case-insensitive  
- `E` notation is **mandatory** in scientific format

---

## 🧮 Integer Literal Prefixes (Base Representation)

| Base       | Code Example           | Memory (Binary) | Output |
|------------|------------------------|------------------|--------|
| Decimal    | `int a = 45;`          | `101101`         | 45     |
| Octal      | `int a = 045;`         | `100101`         | 37     |
| Hexadecimal| `int a = 0x45;`        | `01000101`       | 69     |
| Binary     | `int a = 0b101101;`    | `101101`         | 45     |

---

## 📉 Precision and Loss of Real Number Data

For `24.17`, binary:
- Integer part = `11000`
- Fractional part = repeating binary

```
24.17 => 11000.0010...(binary)
```

### Floating-point mantissa:
- `float`: 23-bit mantissa (loss of precision)
- `double`: 52-bit mantissa (more accurate)

---

## ➕ Positive and Negative Float Representation

Example: `float a = ±24.17f;`  
- Uses **IEEE-754 Single-Precision (32-bits)**  
  - Sign: 1 bit  
