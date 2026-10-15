# 👨‍💼 Employee Management System

## 📌 Question 2

A simple **Employee Management System** developed using **Java Object-Oriented Programming (OOP)** concepts.

This program demonstrates how to create and manage Employee objects, compare employees using their IDs, calculate the average salary, and identify the highest-paid employee.

---

## 📦 Package

```text
employeeutils
```

---

## 📁 Project Files

```text
employeeutils/
├── Employee.java
├── EmployeeUtils.java
├── Main.java
└── README.md
```

### File Responsibilities

| File | Responsibility |
|---|---|
| `Employee.java` | Defines the Employee class and its properties |
| `EmployeeUtils.java` | Provides utility methods for Employee objects |
| `Main.java` | Creates objects and demonstrates all operations |
| `README.md` | Contains project documentation |

---

# 👨‍💼 Employee.java

The `Employee` class represents an employee in the system.

### Employee Attributes

```text
employeeId
name
department
salary
```

All attributes are declared as `private` to achieve **encapsulation**.

### Class Features

- Parameterized constructor
- Private fields
- Public getter methods
- `toString()` method
- `equals()` method
- `hashCode()` method

### Example Employee

```text
Employee ID: 101
Name: Rahul
Department: IT
Salary: 65000.0
```

---

# 🛠️ EmployeeUtils.java

`EmployeeUtils` is a **utility class** that contains static methods for performing operations on an array of Employee objects.

## 📊 Calculate Average Salary

```java
calculateAverageSalary(Employee[] employees)
```

This method calculates the average salary of all employees.

### Example

```text
Employee 1: 60000
Employee 2: 70000
Employee 3: 50000

Average Salary: 60000.0
```

---

## 🏆 Find Highest-Paid Employee

```java
findHighestPaidEmployee(Employee[] employees)
```

This method searches the array and returns the employee who has the highest salary.

The utility methods also handle:

- `null` arrays
- Empty arrays

This helps avoid common runtime errors.

---

# ▶️ Main.java

The `Main` class is the entry point of the program.

It creates multiple Employee objects and demonstrates the functionality required by the practical.

### Operations Demonstrated

- Displaying Employee objects using `toString()`
- Comparing Employee objects using `equals()`
- Checking hash codes using `hashCode()`
- Calculating average salary
- Finding the highest-paid employee
- Testing employees with duplicate IDs

---

# 🧠 OOP Concepts Used

## 🔐 1. Encapsulation

The Employee attributes are declared as private:

```java
private int employeeId;
private String name;
private String department;
private double salary;
```

The values are accessed through public getter methods.

This keeps the internal data of the object protected from direct access.

---

## 🔧 2. Parameterized Constructor

A parameterized constructor is used to initialize Employee objects.

```java
Employee(int employeeId, String name, String department, double salary)
```

Example:

```java
Employee e1 = new Employee(101, "Rahul", "IT", 65000.0);
```

---

## 📝 3. `toString()`

The `toString()` method is overridden to provide a readable representation of an Employee object.

It makes it easier to display employee information using:

```java
System.out.println(employee);
```

---

## ⚖️ 4. `equals()`

The `equals()` method is overridden to define **logical equality** between Employee objects.

Two Employee objects are considered equal when they have the same employee ID.

Example:

```text
Employee ID 101 == Employee ID 101
              ↓
            Equal
```

---

## 🔢 5. `hashCode()`

The `hashCode()` method is overridden consistently with `equals()`.

Employees having the same ID produce the same hash code.

This follows the important Java rule:

> If two objects are equal, they must have the same hash code.

---

## 🛠️ 6. Static Utility Methods

The methods in `EmployeeUtils` are declared as `static`.

Therefore, an object of `EmployeeUtils` is not required.

Example:

```java
EmployeeUtils.findHighestPaidEmployee(employees);
```

---

# 🔄 Program Flow

```text
        👨‍💼 Create Employee Objects
                  ↓
          📦 Store in an Array
                  ↓
            📝 toString()
                  ↓
             ⚖️ equals()
                  ↓
            🔢 hashCode()
                  ↓
        📊 Calculate Average Salary
                  ↓
       🏆 Find Highest-Paid Employee
                  ↓
             📤 Display Result
```

---

# ▶️ How to Run

### Step 1: Open the Project

Open the project in **IntelliJ IDEA**.

### Step 2: Open Main.java

Navigate to:

```text
src/employeeutils/Main.java
```

### Step 3: Run the Program

Right-click inside the `main()` method and select:

```text
Run 'Main.main()'
```

### Step 4: Check Console Output

The results will be displayed in the IntelliJ IDEA console.

---

# 📤 Expected Output

The program displays output similar to:

```text
=== Employee Information ===
Employee{employeeId=101, name='Rahul', department='IT', salary=65000.0}
Employee{employeeId=102, name='Priya', department='HR', salary=58000.0}

=== Testing equals() ===
e1.equals(e6): true
e1.equals(e2): false

=== Testing hashCode() ===
e1.hashCode(): 101
e6.hashCode(): 101

=== Utility Methods ===
Average Salary: 61666.67
Highest Paid Employee: Employee{employeeId=103, name='Amit', department='Finance', salary=72000.0}
```

> Note: The exact output depends on the employee data defined in `Main.java`.

---

# 🎯 Learning Objectives

After completing this practical, we understand:

- How to create and use custom packages
- How to implement encapsulation
- How constructors initialize objects
- How to use arrays of objects
- How to override `toString()`
- How to implement logical equality using `equals()`
- How `hashCode()` works with `equals()`
- How to create static utility methods
- How to calculate values from multiple objects
- How to find the employee with the highest salary

---

# 💻 Technologies Used

- ☕ **Java**
- 💡 **IntelliJ IDEA**
- 🧩 **Object-Oriented Programming**
- 📦 **Custom Packages**
- 📚 **Arrays of Objects**
- 🛠️ **Static Utility Methods**

---

# 📌 Question 2 Summary

The **Employee Management System** demonstrates the practical use of Java OOP concepts through three classes:

```text
Employee
   ↓
EmployeeUtils
   ↓
Main
```

The `Employee` class manages employee data, `EmployeeUtils` provides reusable operations, and `Main` demonstrates and tests the complete functionality.

This practical provides a clear understanding of **encapsulation, constructors, method overriding, object equality, hash codes, static methods, and object-array processing**.

---

## ✅ Practical Checklist

- [x] Custom package created
- [x] Employee class implemented
- [x] Private fields used
- [x] Parameterized constructor implemented
- [x] Getter methods implemented
- [x] `toString()` overridden
- [x] `equals()` overridden
- [x] `hashCode()` overridden
- [x] `EmployeeUtils` created
- [x] Average salary calculated
- [x] Highest-paid employee identified
- [x] Duplicate employee ID tested
- [x] `Main.java` used for testing

---

### 📚 Practical Topic

**Custom Packages, Utility Classes & Object Method Overrides**
