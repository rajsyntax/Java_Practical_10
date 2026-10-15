# ☕ Java OOP Lab Session 10

## Custom Packages, Utility Classes & Object Method Overrides

This repository contains the complete implementation of **Java OOP Lab Session 10**.

The practical focuses on creating custom Java packages, applying encapsulation, creating reusable utility classes, and overriding important methods inherited from Java's `Object` class.

---

## 👨‍💻 Author

**GitHub:** [@rajsyntax](https://github.com/rajsyntax)

---

## 📚 Practical Overview

This practical contains **three independent Java programs**:

| Question | Project | Package |
|---|---|---|
| Q1 | 🎓 Student Management System | `studentutils` |
| Q2 | 👨‍💼 Employee Management System | `employeeutils` |
| Q3 | 🛒 Product Management System | `productutils` |

Each question follows a similar OOP structure:

```text
        Domain Class
             ↓
      Encapsulation
             ↓
   toString / equals / hashCode
             ↓
       Utility Class
             ↓
      Static Methods
             ↓
         Main Class
             ↓
       Console Output
```

---

# 🎓 Question 1 - Student Management System

### Package

```text
studentutils
```

### Purpose

The Student Management System is used to create and manage Student objects.

It demonstrates:

- Creating Student objects
- Encapsulation
- Object comparison
- `toString()`
- `equals()`
- `hashCode()`
- Average marks calculation
- Finding the student with the highest marks

### Files

```text
studentutils/
├── Student.java
├── StudentUtils.java
└── Main.java
```

### Student Attributes

```text
int id
String name
double marks
```

### Utility Methods

```java
calculateAverageMarks(Student[] students)
```

Calculates the average marks of all students.

```java
findTopStudent(Student[] students)
```

Finds the student with the highest marks.

---

# 👨‍💼 Question 2 - Employee Management System

### Package

```text
employeeutils
```

### Purpose

The Employee Management System is used to create and manage Employee objects.

It demonstrates:

- Creating Employee objects
- Encapsulation
- Object comparison
- `toString()`
- `equals()`
- `hashCode()`
- Average salary calculation
- Finding the highest-paid employee

### Files

```text
employeeutils/
├── Employee.java
├── EmployeeUtils.java
└── Main.java
```

### Employee Attributes

```text
int employeeId
String name
String department
double salary
```

### Utility Methods

```java
calculateAverageSalary(Employee[] employees)
```

Calculates the average salary of all employees.

```java
findHighestPaidEmployee(Employee[] employees)
```

Finds the employee with the highest salary.

---

# 🛒 Question 3 - Product Management System

### Package

```text
productutils
```

### Purpose

The Product Management System is used to create and manage Product objects.

It demonstrates:

- Creating Product objects
- Encapsulation
- Object comparison
- `toString()`
- `equals()`
- `hashCode()`
- Total inventory value calculation
- Finding the most expensive product

### Files

```text
productutils/
├── Product.java
├── ProductUtils.java
└── Main.java
```

### Product Attributes

```text
int productId
String productName
String category
double price
```

### Utility Methods

```java
calculateTotalPrice(Product[] products)
```

Calculates the total price of all products.

```java
findMostExpensiveProduct(Product[] products)
```

Finds the product with the highest price.

---

# 📁 Project Structure

```text
Java_Practical_10/
│
├── .gitignore
├── README.md
│
└── src/
    │
    ├── studentutils/
    │   ├── Student.java
    │   ├── StudentUtils.java
    │   ├── Main.java
    │   └── README.md
    │
    ├── employeeutils/
    │   ├── Employee.java
    │   ├── EmployeeUtils.java
    │   ├── Main.java
    │   └── README.md
    │
    └── productutils/
        ├── Product.java
        ├── ProductUtils.java
        ├── Main.java
        └── README.md
```

---

# 🧠 OOP Concepts Demonstrated

## 1. 🔐 Encapsulation

All important attributes are declared as `private`.

For example:

```java
private int id;
private String name;
private double marks;
```

Getter methods are used to access the values.

This prevents direct access to the internal data of an object.

---

## 2. 🔧 Parameterized Constructors

Each domain class uses a parameterized constructor to initialize its objects.

Example:

```java
public Student(int id, String name, double marks) {
    this.id = id;
    this.name = name;
    this.marks = marks;
}
```

The same concept is applied to `Employee` and `Product`.

---

## 3. 📝 `toString()`

The `toString()` method is overridden to provide meaningful information about an object.

For example:

```text
Student{id=1, name='Alice', marks=95.5}
```

This is more useful than Java's default object representation.

---

## 4. ⚖️ `equals()`

The `equals()` method is overridden to define logical equality.

Objects are compared using their unique ID:

| Class | Equality Based On |
|---|---|
| `Student` | `id` |
| `Employee` | `employeeId` |
| `Product` | `productId` |

Therefore, two objects with the same ID are considered equal.

---

## 5. 🔢 `hashCode()`

The `hashCode()` method is implemented consistently with `equals()`.

If two objects are equal, they must have the same hash code.

This is especially important when objects are used in collections such as `HashSet` and `HashMap`.

---

## 6. 🛠️ Static Utility Classes

Each package contains a utility class:

```text
StudentUtils
EmployeeUtils
ProductUtils
```

These classes contain static methods for processing arrays of objects.

Example:

```java
StudentUtils.findTopStudent(students);
```

There is no need to create a `StudentUtils` object.

---

## 7. 🛡️ Null and Empty Array Handling

The utility methods check for invalid or empty arrays before processing.

Example:

```java
if (students == null || students.length == 0) {
    return 0;
}
```

This helps prevent common runtime errors.

---

# 🔄 Overall Program Flow

All three questions follow a similar flow:

```text
Create Objects
     ↓
Store Objects in Array
     ↓
Display Objects
     ↓
Test equals()
     ↓
Test hashCode()
     ↓
Call Utility Methods
     ↓
Calculate Required Result
     ↓
Display Result
```

---

# ▶️ How to Run in IntelliJ IDEA

## Step 1 - Open Project

Open `Java_Practical_10` in IntelliJ IDEA.

## Step 2 - Select the Required Question

### Question 1

Open:

```text
src/studentutils/Main.java
```

Run:

```text
studentutils.Main
```

### Question 2

Open:

```text
src/employeeutils/Main.java
```

Run:

```text
employeeutils.Main
```

### Question 3

Open:

```text
src/productutils/Main.java
```

Run:

```text
productutils.Main
```

Each question has its own `Main` class, so all three programs can be executed independently.

---

# 📤 Sample Output

## Question 1

```text
=== Testing toString() ===
Student{id=1, name='Alice', marks=95.5}
Student{id=2, name='Bob', marks=87.0}

=== Testing equals() ===
s1.equals(s5): true
s1.equals(s2): false

=== Testing hashCode() ===
s1.hashCode(): 1
s5.hashCode(): 1

=== Utility Methods ===
Average Marks: 90.75
Top Student: Student{id=1, name='Alice', marks=95.5}
```

## Question 2

```text
=== Testing toString() ===
Employee{employeeId=101, name='Rahul', department='IT', salary=65000.0}
Employee{employeeId=102, name='Priya', department='HR', salary=58000.0}

=== Testing equals() ===
e1.equals(e6): true
e1.equals(e2): false

=== Testing hashCode() ===
e1.hashCode(): 101
e6.hashCode(): 101

=== Utility Methods ===
Average Salary: 62200.0
Highest Paid Employee: Employee{employeeId=103, name='Amit', department='Finance', salary=72000.0}
```

## Question 3

```text
=== Testing toString() ===
Product{productId=201, productName='Laptop', category='Electronics', price=75000.0}
Product{productId=202, productName='Smartphone', category='Electronics', price=45000.0}

=== Testing equals() ===
p1.equals(p7): true
p1.equals(p2): false

=== Testing hashCode() ===
p1.hashCode(): 201
p7.hashCode(): 201

=== Utility Methods ===
Total Inventory Value: 158000.0
Most Expensive Product: Product{productId=201, productName='Laptop', category='Electronics', price=75000.0}
```

> **Note:** Sample values are representative. The actual output depends on the objects and values defined in each `Main.java`.

---

# 🧪 Testing Covered

The practical demonstrates and tests:

- `toString()`
- `equals()`
- `hashCode()`
- Duplicate-ID equality
- Average calculations
- Maximum-value searches
- Total inventory value
- Null array handling
- Empty array handling
- Arrays containing multiple objects

---

# 💻 Technologies Used

- ☕ Java
- 💡 IntelliJ IDEA
- 🧩 Object-Oriented Programming
- 📦 Custom Java Packages
- 📚 Arrays of Objects
- 🛠️ Static Utility Methods
- 🔄 Method Overriding

---

# 🎯 Learning Objectives

After completing this practical, the student should be able to:

1. Create and use custom Java packages.
2. Apply encapsulation using private fields and getter methods.
3. Initialize objects using parameterized constructors.
4. Override `toString()`, `equals()`, and `hashCode()`.
5. Understand logical equality between objects.
6. Maintain the `equals()` and `hashCode()` contract.
7. Create reusable static utility methods.
8. Process arrays containing custom objects.
9. Perform calculations using object data.
10. Apply OOP concepts to different real-world examples.

---

# ✅ Submission Checklist

- [x] Question 1 - Student Management System
- [x] Question 2 - Employee Management System
- [x] Question 3 - Product Management System
- [x] Custom packages created
- [x] Private fields used
- [x] Getter methods implemented
- [x] Parameterized constructors implemented
- [x] `toString()` overridden
- [x] `equals()` overridden
- [x] `hashCode()` overridden
- [x] Static utility methods implemented
- [x] Null and empty-array handling included
- [x] Duplicate IDs tested
- [x] Separate `Main` class for each question
- [x] Question-wise README files included

---

# 📚 Question-wise Documentation

Detailed documentation for each question is available inside its respective package:

```text
src/
├── studentutils/
│   └── README.md
│
├── employeeutils/
│   └── README.md
│
└── productutils/
    └── README.md
```

These README files explain the individual classes, methods, OOP concepts, program flow, and execution steps for each question.

---

# 📌 Conclusion

**Java OOP Lab Session 10** demonstrates how Java OOP concepts can be applied to three different real-world scenarios:

```text
🎓 Student Management
        +
👨‍💼 Employee Management
        +
🛒 Product Management
        ↓
   Java OOP Concepts
```

The practical provides hands-on experience with **custom packages, encapsulation, constructors, method overriding, object equality, hash codes, static utility methods, and arrays of objects**.

---

## 👨‍💻 Author

**rajsyntax**

Java OOP Lab Session 10  
Semester 3

---

### 📖 Practical Topic

**Custom Packages, Utility Classes & Object Method Overrides**
