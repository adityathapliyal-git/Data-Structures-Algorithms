# 🌐 Lecture 06: Platform Dependent vs Platform Independent Languages

---

## 🧩 Platform Dependent Languages

> Require recompilation for each operating system. Execution relies directly on the underlying OS.

### 📌 Examples
- **C**
- **C++**
- **Assembly Language**

### ⚙️ OS-Specific Compilation
- Code compiled on **Windows** ➝ Executable runs only on Windows
- Code compiled on **Linux** ➝ Executable runs only on Linux
- Code compiled on **Mac** ➝ Executable runs only on Mac

#### 🔁 Compilation Flow
```
Source Code (.c/.cpp) ➝ Compiler (OS-specific) ➝ Machine Code (OS-dependent)
```

---

## 🌍 Platform Independent Languages

> Can run on any OS without modification, typically via a virtual machine or interpreter.

### 📌 Examples
- **Java**
- **Python**
- **.NET** (with CLR)
- **Kotlin** (JVM)

### 💡 Key Concept
- Compiled to an intermediate form (**Bytecode**), which is interpreted or executed by a platform-specific **Virtual Machine (VM)**.

#### 🔁 Execution Flow (Java Example)
```
Source Code (.java)
      ⬇
  Java Compiler
      ⬇
   Bytecode (.class)
      ⬇
JVM (Java Virtual Machine)
```
- JVM exists for **Windows**, **Linux**, **Mac** ➝ Bytecode runs anywhere!

---

## 🔧 Dependency Overview

### 📎 Platform Dependent
```
   Source Code
        ↓
    OS-Specific Compiler
        ↓
   Machine Code (OS-Specific)
```

### 🖥 Platform Independent
```
   Source Code
        ↓
  Intermediate Code (Bytecode)
        ↓
Virtual Machine (OS-Specific)
        ↓
 Machine Code (OS-Specific)
```

---

## 🔍 Real World Comparison

| Language | Compilation Output | Runs On | Recompile Needed? |
|----------|---------------------|---------|--------------------|
| **C**        | Machine Code         | Same OS | ✅ Yes             |
| **Java**     | Bytecode (.class)    | Any OS  | ❌ No              |
| **Python**   | Bytecode (.pyc)      | Any OS  | ❌ No              |

---

## 🧠 Key Points

- **Platform Independent Languages** use a **Virtual Machine (VM)** layer to abstract the OS.
- Java uses **JVM**, .NET uses **CLR**—both enable cross-platform execution.
- Platform dependent code is **tied to the OS** and must be recompiled for each platform.
- Java bytecode remains the same across OSs; **only the JVM differs**.
- This makes Java a **write once, run anywhere** language.

---

## 📝 Summary

- **Platform Dependent:** OS-bound executables (C, C++)
- **Platform Independent:** VM-bound executables (Java, Python)
- Intermediate languages like **Bytecode** or **MSIL** allow code to be portable.
- **VM** is the magic that bridges cross-platform compatibility.
