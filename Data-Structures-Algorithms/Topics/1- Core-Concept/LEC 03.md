# 🧠 Lecture 03: Memory Organization of a Computer

---

## 🖥️ Components Overview

- **Input Unit**
- **Output Unit**
- **Main Component:** ALU / CPU (Control Unit + Registers)
- **Technology:** Semiconductor Devices
- **Communication Bus:**  
  - Address Bus  
  - Data Bus  
  - Control Bus

---

## 🗂️ Memory Classification

### 1. **Primary Memory**
- Directly accessed by CPU
- **Volatile Memory** (data lost on power off)
- **Types:**
  - **RAM (Random Access Memory):**
    - Dynamic RAM (**DRAM**)
    - Static RAM (**SRAM**)
  - **Cache Memory**
  - **Registers**
- **Technology:** Semiconductor
- **Data Movement:** Byte ↔ Bus ↔ CPU
- **Working:**
  - Data Loading
  - Data Execution
  - Temporary Storage
- **OS Role:** Loads programs from secondary to primary memory for execution

---

### 2. **Secondary Memory**
- **Non-volatile Memory** (data persists after power off)
- Used for **long-term storage**
- **Types:**
  - **HDD (Hard Disk Drive)**
  - **SSD (Solid State Drive)**
  - **Optical Drives** (CD/DVD)
  - **USB / Pen Drives**
  - **SD Cards**
  - **ROM (Read Only Memory)**

#### 🧲 HDD Structure
- **Platters** (magnetic disk surface)
- **Tracks**
- **Sectors**
- **Spindle**

#### ⚡ SSD
- No moving parts
- Faster access time
- Uses flash memory

#### 💿 Optical Disk
- Read using laser light (electromagnetic radiation)

---

## 🔄 Data Flow (Execution Process)

1. Data is saved in secondary memory (HDD, SSD)
2. OS loads data to primary memory (RAM)
3. CPU fetches data from RAM via BUS
4. Data is processed and temporarily stored
5. Output is generated and sent to Output Unit

---

## 📝 Key Terms

- **Bit:** Basic unit of data (0 or 1)
- **Byte:** 8 bits
- **DRAM:** Needs refreshing, slower, used in main memory
- **SRAM:** No refresh needed, faster, used in cache
- **Bus:** Transfers data between components
- **Semiconductor:** Underlying tech for RAM, CPU, Cache

---

## 🖥️ Role of Operating System (OS)

- Interface between hardware and software
- Loads programs from secondary to primary memory
- Manages memory allocation
- Ensures efficient processing

---

## 📊 Additional Notes

- **Speed Hierarchy:**  
  Registers > Cache > RAM > Secondary Storage
- **Volatility:**  
  - Primary Memory (RAM, Cache): **Volatile**
  - Secondary Memory (HDD, SSD, ROM): **Non-volatile**
