# 💻 Lecture 05: Object File vs Executable File & Compiler vs Interpreter

---

## 📁 Object File vs Executable File

### 📦 Compilation Process

```
Source Code (.c / .cpp / .java etc.)
        |
        v
   Preprocessor
        |
        v
   Compiler
        |
        v
 Object File (.obj / .o)
        |
        v
    Linker (Static/Dynamic Linking)
        |
        v
 Executable File (.exe / .out)
```

- **Object File:** Intermediate binary file containing machine code, but incomplete for execution.
- **Executable File:** Final binary file ready to run on the system.

---

### 🧠 Memory Representation

- **Hard Disk Drive (HDD):**  
  Stores source files, object files, libraries, linker, compiler, and the executable.
- **RAM (Random Access Memory):**  
  Stores the executable image loaded from the HDD and executed by CPU.
- **CPU:**  
  Executes the instruction set from the executable file and produces output.

---

## 🛠️ Compiler vs Interpreter

### 🔁 Compiler-Based Execution

```
Source File 
    |
    v
Compiler --> Error Checking --> Object File --> Linker --> Executable File
                                                        |
                                                        v
                                                      Loaded into RAM
                                                        |
                                                        v
                                                       CPU
                                                        |
                                                        v
                                                     Output
```

- **Pros:** Faster execution after compilation, error checking before execution.
- **Cons:** Compilation time required, platform dependency.

---

### 🔂 Interpreter-Based Execution

```
Source File
    |
    v
Interpreter
    |
    v
 Line-by-line execution in RAM
    |
    v
  CPU → Output
```

- **Pros:** Easier debugging, platform-independent.
- **Cons:** Slower than compiled code, execution stops on first error.

---

## 📝 Key Definitions

- **Compilation:**  
  Conversion of high-level language into machine-level language, producing an object file (intermediate code, not directly executable until linked).

- **Linking:**  
  Combining object files and required libraries to generate a final executable file.

- **Loading:**  
  Copying executable files from secondary memory (HDD) into RAM for execution by CPU.

---

### ⚖️ Comparison Table

| Aspect          | Compiler                              | Interpreter                           |
|----------------|----------------------------------------|----------------------------------------|
| **Speed**          | Fast (after compilation)               | Slow (line-by-line execution)         |
| **Error Checking** | Entire program at once                 | Line-by-line                          |
| **Output**         | Executable File                        | Direct output                         |
| **Usage**          | C, C++, Java (partially)               | Python, JavaScript, Ruby              |

---

> **Summary:**  
> These are the fundamental differences and processes involving object files, executable files, and how compilers vs interpreters operate in program execution.
