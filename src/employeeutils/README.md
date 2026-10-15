# 🎓 Student Management System

## 📌 Question 1

This program is a simple **Student Management System** developed using **Java OOP concepts**.

The main purpose of this program is to create Student objects, compare students, calculate average marks, and find the student with the highest marks.

---

## 📦 Package

```text
studentutils
```

---

## 📁 Files

```text
studentutils/
├── Student.java
├── StudentUtils.java
├── Main.java
└── README.md
```

---

## 👨‍🎓 1. Student.java

The `Student` class represents a student.

It contains three fields:

```text
id
name
marks
```

All fields are declared as `private` to implement **encapsulation**.

The class also contains:

- 🔧 Parameterized constructor
- 🔐 Private fields
- 📖 Getter methods
- 📝 `toString()`
- ⚖️ `equals()`
- 🔢 `hashCode()`

### Example Student

```text
ID: 1
Name: Rahul
Marks: 85.5
```

---

## 🛠️ 2. StudentUtils.java

`StudentUtils` is a **utility class**.

It contains static methods for performing operations on an array of Student objects.

### 📊 Calculate Average Marks

```java
calculateAverageMarks(Student[] students)
```

This method calculates the average marks of all students.

### 🏆 Find Top Student

```java
findTopStudent(Student[] students)
```

This method finds the student who has the highest marks.

The methods also handle `null` and empty arrays.

---

## ▶️ 3. Main.java

The `Main` class is used to run and test the Student Management System.

It creates multiple Student objects and tests:

- 📝 `toString()`
- ⚖️ `equals()`
- 🔢 `hashCode()`
- 📊 Average marks
- 🏆 Top student
- 🔍 Duplicate student ID

---

## 🧠 OOP Concepts Used

### 🔐 Encapsulation

Student fields are private and accessed using getter methods.

```java
private int id;
private String name;
private double marks;
```

### 🔧 Constructor

A parameterized constructor initializes the Student object.

```java
Student(int id, String name, double marks)
```

### 📝 `toString()`

Used to display Student object information in a readable format.

### ⚖️ `equals()`

Two students are considered equal when they have the same student ID.

### 🔢 `hashCode()`

The hash code is generated using the student ID and is consistent with `equals()`.

### 🛠️ Static Utility Methods

The methods in `StudentUtils` are static, so they can be called directly using the class name.

Example:

```java
StudentUtils.findTopStudent(students);
```

---

## 🔄 Program Flow

```text
👨‍🎓 Create Student Objects
          ↓
📦 Store Students in an Array
          ↓
📝 Test toString()
          ↓
⚖️ Test equals()
          ↓
🔢 Test hashCode()
          ↓
📊 Calculate Average Marks
          ↓
🏆 Find Top Student
```

---

## ▶️ How to Run

1. 💻 Open the project in IntelliJ IDEA.
2. Open:

```text
src/studentutils/Main.java
```

3. ▶️ Run the `main()` method.
4. 🖥️ Check the output in the IntelliJ console.

---

## 📤 Expected Output

The program displays:

```text
📝 Student information

⚖️ Result of equals()

🔢 Hash codes of students

📊 Average marks

🏆 Top student
```

The exact output depends on the student data used in `Main.java`.

---

## 🎯 Learning Objectives

After completing this question, we understand:

- 📦 How to create a custom package
- 🏗️ How to create and use classes
- 🔐 How encapsulation works
- 🔧 How constructors initialize objects
- 📝 How to override `toString()`
- ⚖️ How to compare objects using `equals()`
- 🔢 How `hashCode()` works with `equals()`
- 🛠️ How static utility methods work
- 📊 How to process an array of objects

---

## 💻 Technologies Used

- ☕ Java
- 💡 IntelliJ IDEA
- 🧩 Java OOP
- 📦 Custom Packages
- 📚 Arrays
- 🛠️ Static Utility Methods

---

## 📌 Question 1 Summary

The **Student Management System** demonstrates basic Java OOP by combining a `Student` class, a `StudentUtils` utility class, and a `Main` class.

It provides a simple example of how **object-oriented programming** can be used to store, compare, and process student information. 🎓
