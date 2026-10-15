# 🎓 Student Management System

## 📌 Question 1

A simple **Student Management System** developed using **Java Object-Oriented Programming (OOP)** concepts.

This program demonstrates how to create and manage Student objects, compare students using their IDs, calculate the average marks, and identify the student with the highest marks.

---

## 📦 Package

```text
studentutils
```

---

## 📁 Project Files

```text
studentutils/
├── Student.java
├── StudentUtils.java
├── Main.java
└── README.md
```

### File Responsibilities

| File | Responsibility |
|---|---|
| `Student.java` | Defines the Student class and its properties |
| `StudentUtils.java` | Provides utility methods for Student objects |
| `Main.java` | Creates objects and demonstrates all operations |
| `README.md` | Contains project documentation |

---

# 👨‍🎓 Student.java

The `Student` class represents a student in the system.

### Student Attributes

```text
id
name
marks
```

All attributes are declared as `private` to achieve **encapsulation**.

### Class Features

- Parameterized constructor
- Private fields
- Public getter methods
- `toString()` method
- `equals()` method
- `hashCode()` method

### Example Student

```text
ID: 1
Name: Rahul
Marks: 85.5
```

---

# 🛠️ StudentUtils.java

`StudentUtils` is a **utility class** that contains static methods for performing operations on an array of Student objects.

## 📊 Calculate Average Marks

```java
calculateAverageMarks(Student[] students)
```

This method calculates the arithmetic average of the marks of all students.

### Example

```text
Student 1: 80
Student 2: 90
Student 3: 70

Average Marks: 80.0
```

---

## 🏆 Find Top Student

```java
findTopStudent(Student[] students)
```

This method searches the array and returns the student who has the highest marks.

The utility methods also handle:

- `null` arrays
- Empty arrays

This helps avoid common runtime errors.

---

# ▶️ Main.java

The `Main` class is the entry point of the program.

It creates multiple Student objects and demonstrates the functionality required by the practical.

### Operations Demonstrated

- Displaying Student objects using `toString()`
- Comparing Student objects using `equals()`
- Checking hash codes using `hashCode()`
- Calculating average marks
- Finding the top student
- Testing students with duplicate IDs

---

# 🧠 OOP Concepts Used

## 🔐 1. Encapsulation

The Student attributes are declared as private:

```java
private int id;
private String name;
private double marks;
```

The values are accessed through public getter methods.

This keeps the internal data of the object protected from direct modification.

---

## 🔧 2. Parameterized Constructor

A parameterized constructor is used to initialize Student objects.

```java
Student(int id, String name, double marks)
```

Example:

```java
Student s1 = new Student(1, "Rahul", 85.5);
```

---

## 📝 3. `toString()`

The `toString()` method is overridden to provide a readable representation of a Student object.

Instead of displaying a default object reference, the program can display useful student information.

---

## ⚖️ 4. `equals()`

The `equals()` method is overridden to define **logical equality** between Student objects.

Two Student objects are considered equal when they have the same student ID.

Example:

```text
Student ID 1 == Student ID 1
        ↓
     Equal
```

---

## 🔢 5. `hashCode()`

The `hashCode()` method is overridden consistently with `equals()`.

Students having the same ID produce the same hash code.

This follows the important Java rule:

> If two objects are equal, they must have the same hash code.

---

## 🛠️ 6. Static Utility Methods

The methods in `StudentUtils` are declared as `static`.

Therefore, an object of `StudentUtils` is not required.

Example:

```java
StudentUtils.findTopStudent(students);
```

---

# 🔄 Program Flow

```text
        👨‍🎓 Create Student Objects
                  ↓
          📦 Store in an Array
                  ↓
            📝 toString()
                  ↓
             ⚖️ equals()
                  ↓
            🔢 hashCode()
                  ↓
        📊 Calculate Average Marks
                  ↓
          🏆 Find Top Student
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
src/studentutils/Main.java
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

The program demonstrates output similar to:

```text
=== Student Information ===
Student{id=1, name='Rahul', marks=85.5}
Student{id=2, name='Priya', marks=92.0}

=== Testing equals() ===
s1.equals(s5): true
s1.equals(s2): false

=== Testing hashCode() ===
s1.hashCode(): 1
s5.hashCode(): 1

=== Utility Methods ===
Average Marks: 88.75
Top Student: Student{id=2, name='Priya', marks=92.0}
```

> Note: The exact output depends on the student data defined in `Main.java`.

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
- How to find the object with the highest value

---

# 💻 Technologies Used

- ☕ **Java**
- 💡 **IntelliJ IDEA**
- 🧩 **Object-Oriented Programming**
- 📦 **Custom Packages**
- 📚 **Arrays of Objects**
- 🛠️ **Static Utility Methods**

---

# 📌 Question 1 Summary

The **Student Management System** demonstrates the practical use of Java OOP concepts through three classes:

```text
Student
   ↓
StudentUtils
   ↓
Main
```

The `Student` class manages student data, `StudentUtils` provides reusable operations, and `Main` demonstrates and tests the complete functionality.

This practical provides a clear understanding of **encapsulation, constructors, method overriding, object equality, hash codes, static methods, and object-array processing**.

---

## ✅ Practical Checklist

- [x] Custom package created
- [x] Student class implemented
- [x] Private fields used
- [x] Parameterized constructor implemented
- [x] Getter methods implemented
- [x] `toString()` overridden
- [x] `equals()` overridden
- [x] `hashCode()` overridden
- [x] `StudentUtils` created
- [x] Average marks calculated
- [x] Top student identified
- [x] Duplicate student ID tested
- [x] `Main.java` used for testing

---

### 📚 Practical Topic

**Custom Packages, Utility Classes & Object Method Overrides**
