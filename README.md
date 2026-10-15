# Java OOP Lab Session 10

## Custom Packages, Utility Classes & Object Method Overrides

This repository contains the complete implementation of **Java OOP Lab Session 10**.

The practical demonstrates custom package organization, encapsulation, reusable static utility methods, and overriding the `toString()`, `equals()`, and `hashCode()` methods inherited from Java's `Object` class.

---

## Practical Overview

The lab contains three independent Java practical programs:

1. **Question 1 - Student Management System**
2. **Question 2 - Employee Management System**
3. **Question 3 - Product Management System**

Each question follows the same reusable OOP design pattern:

```text
Domain Class
     ↓
Encapsulation + Object Method Overrides
     ↓
Utility Class
     ↓
Static Analysis Methods
     ↓
Main Class
     ↓
Console Output
```

---

# Questions

## Question 1 - Student Management System

### Package

```text
studentutils
```

### Files

```text
Student.java
StudentUtils.java
Main.java
```

### Student Attributes

```text
int id
String name
double marks
```

### Features

- Parameterized constructor
- Private fields
- Public getter methods
- `toString()` override
- `equals()` override
- `hashCode()` override
- Duplicate student ID equality testing
- Average marks calculation
- Finding the top student

### Utility Methods

```java
calculateAverageMarks(Student[] students)
```

Returns the arithmetic mean of all student marks.

```java
findTopStudent(Student[] students)
```

Returns the student with the highest marks.

Both methods handle `null` and empty arrays.

---

# Question 2 - Employee Management System

### Package

```text
employeeutils
```

### Files

```text
Employee.java
EmployeeUtils.java
Main.java
```

### Employee Attributes

```text
int employeeId
String name
String department
double salary
```

### Features

- Parameterized constructor
- Private fields
- Public getter methods
- `toString()` override
- `equals()` override
- `hashCode()` override
- Duplicate employee ID equality testing
- Average salary calculation
- Finding the highest-paid employee

### Utility Methods

```java
calculateAverageSalary(Employee[] employees)
```

Returns the average salary of the employees.

```java
findHighestPaidEmployee(Employee[] employees)
```

Returns the employee with the highest salary.

Both methods handle `null` and empty arrays.

---

# Question 3 - Product Management System

### Package

```text
productutils
```

### Files

```text
Product.java
ProductUtils.java
Main.java
```

### Product Attributes

```text
int productId
String productName
String category
double price
```

### Features

- Parameterized constructor
- Private fields
- Public getter methods
- `toString()` override
- `equals()` override
- `hashCode()` override
- Duplicate product ID equality testing
- Total inventory value calculation
- Finding the most expensive product

### Utility Methods

```java
calculateTotalPrice(Product[] products)
```

Returns the total price of all products in the array.

```java
findMostExpensiveProduct(Product[] products)
```

Returns the product having the highest price.

Both methods handle `null` and empty arrays.

---

# Project Structure

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
    │   └── Main.java
    │
    ├── employeeutils/
    │   ├── Employee.java
    │   ├── EmployeeUtils.java
    │   └── Main.java
    │
    └── productutils/
        ├── Product.java
        ├── ProductUtils.java
        └── Main.java
```

---

# OOP Concepts Demonstrated

## 1. Encapsulation

All class attributes are declared as `private`.

Example:

```java
private int id;
private String name;
private double marks;
```

Public getter methods are provided to access the values.

---

## 2. Constructors

Each domain class uses a parameterized constructor to initialize its attributes.

Example:

```java
public Student(int id, String name, double marks) {
    this.id = id;
    this.name = name;
    this.marks = marks;
}
```

---

## 3. Method Overriding

Each domain class overrides these methods inherited from `Object`:

```java
toString()
equals()
hashCode()
```

---

## 4. `toString()`

The `toString()` method provides a readable representation of an object.

Example:

```text
Student{id=1, name='Alice', marks=95.5}
```

This makes it easier to display object information using:

```java
System.out.println(student);
```

---

## 5. `equals()`

The `equals()` method defines logical equality.

The identity field for each class is:

| Class | Equality Based On |
|---|---|
| Student | `id` |
| Employee | `employeeId` |
| Product | `productId` |

Therefore, two objects with the same ID are considered equal.

---

## 6. `hashCode()`

`hashCode()` is implemented consistently with `equals()`.

Objects having the same identity ID produce the same hash code.

This is important when objects are used with collections such as `HashSet` and `HashMap`.

---

## 7. Static Utility Methods

The utility classes contain static methods that operate on arrays of objects.

For example:

```java
StudentUtils.findTopStudent(students);
```

There is no need to create a `StudentUtils` object.

---

## 8. Null Safety

Utility methods check for `null` and empty arrays before processing data.

Example:

```java
if (students == null || students.length == 0) {
    return 0;
}
```

This prevents common runtime errors when invalid or empty input is supplied.

---

# Technologies Used

- Java
- IntelliJ IDEA
- Java OOP
- Custom Packages
- Static Methods
- Object Method Overriding
- Arrays of Objects

---

# IntelliJ IDEA Setup

## Requirements

- IntelliJ IDEA
- Java JDK configured in IntelliJ IDEA

The practical does not require any special Java feature, so conventional Java syntax is used throughout the project.

---

## Running Question 1

Open:

```text
src/studentutils/Main.java
```

Run:

```text
studentutils.Main
```

---

## Running Question 2

Open:

```text
src/employeeutils/Main.java
```

Run:

```text
employeeutils.Main
```

---

## Running Question 3

Open:

```text
src/productutils/Main.java
```

Run:

```text
productutils.Main
```

Each question has its own `Main` class and can be executed independently.

---

# Sample Output

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

---

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

---

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

---

# Testing Requirements

The project tests:

- `toString()`
- `equals()`
- `hashCode()`
- Utility methods
- Duplicate-ID equality
- Average calculations
- Maximum-value searches
- Total inventory value

Each practical creates at least five objects as required by the lab.

---

# Package Organization

The project uses three separate packages:

```text
studentutils
employeeutils
productutils
```

This keeps related classes together and avoids naming conflicts between the different domain models.

---

# Submission Checklist

- [x] Question 1 completed
- [x] Question 2 completed
- [x] Question 3 completed
- [x] Custom packages created
- [x] Private fields used
- [x] Public getters provided
- [x] Parameterized constructors implemented
- [x] `toString()` overridden
- [x] `equals()` overridden
- [x] `hashCode()` overridden
- [x] Static utility methods implemented
- [x] Null/empty-array guards included
- [x] Duplicate IDs tested
- [x] Console output displayed
- [x] Separate `Main` class for each question

---

# Learning Objectives

After completing this practical, the student should be able to:

1. Create and use custom Java packages.
2. Apply encapsulation using private fields and public getters.
3. Create objects using parameterized constructors.
4. Override `toString()`, `equals()`, and `hashCode()`.
5. Understand logical equality between objects.
6. Maintain the `equals()` and `hashCode()` contract.
7. Create reusable static utility classes.
8. Process arrays of custom objects.
9. Perform aggregate calculations on object data.
10. Apply the same OOP design pattern to different real-world domains.

---

# GitHub

Repository:

```text
Java_Practical_10
```

This repository contains the source code and documentation for Java OOP Lab Session 10.

---

## Practical Topic

**Custom Packages, Utility Classes & Object Method Overrides**
