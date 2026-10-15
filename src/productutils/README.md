# 🛒 Product Management System

## Question 3

This program is a simple **Product Management System** developed using **Java OOP concepts**.

The main purpose of this program is to create Product objects, compare products, calculate the total inventory value, and find the most expensive product.

---

## Package

```text
productutils
```

---

## Files

```text
productutils/
├── Product.java
├── ProductUtils.java
├── Main.java
└── README.md
```

---

## 1. Product.java

The `Product` class represents a product.

It contains four fields:

```text
productId
productName
category
price
```

All fields are declared as `private` to implement **encapsulation**.

The class also contains:

- Parameterized constructor
- Getter methods
- `toString()`
- `equals()`
- `hashCode()`

### Example Product

```text
Product ID: 101
Product Name: Laptop
Category: Electronics
Price: 75000.0
```

---

## 2. ProductUtils.java

`ProductUtils` is a utility class.

It contains static methods for performing operations on an array of Product objects.

### Calculate Total Price

```java
calculateTotalPrice(Product[] products)
```

This method calculates the total price of all products in the array.

### Find Most Expensive Product

```java
findMostExpensiveProduct(Product[] products)
```

This method finds the product with the highest price.

The methods also handle `null` and empty arrays.

---

## 3. Main.java

The `Main` class is used to run and test the Product Management System.

It creates multiple Product objects and tests:

- `toString()`
- `equals()`
- `hashCode()`
- Total inventory value
- Most expensive product
- Duplicate product ID

---

## OOP Concepts Used

### Encapsulation

Product fields are private and accessed using getter methods.

```java
private int productId;
private String productName;
private String category;
private double price;
```

### Constructor

A parameterized constructor initializes the Product object.

```java
Product(int productId, String productName, String category, double price)
```

### `toString()`

Used to display Product object information in a readable format.

### `equals()`

Two products are considered equal when they have the same `productId`.

### `hashCode()`

The hash code is generated using the product ID and is consistent with `equals()`.

### Static Utility Methods

The methods in `ProductUtils` are static, so they can be called directly using the class name.

Example:

```java
ProductUtils.findMostExpensiveProduct(products);
```

---

## Program Flow

```text
Create Product Objects
        ↓
Store Products in an Array
        ↓
Test toString()
        ↓
Test equals()
        ↓
Test hashCode()
        ↓
Calculate Total Inventory Value
        ↓
Find Most Expensive Product
```

---

## How to Run

1. Open the project in IntelliJ IDEA.
2. Open:

```text
src/productutils/Main.java
```

3. Run the `main()` method.
4. Check the output in the IntelliJ console.

---

## Expected Output

The program displays:

```text
Product information

Result of equals()

Hash codes of products

Total inventory value

Most expensive product
```

The exact output depends on the product data used in `Main.java`.

---

## Learning Objectives

After completing this question, we understand:

- How to create a custom package
- How to create and use classes
- How encapsulation works
- How constructors initialize objects
- How to override `toString()`
- How to compare objects using `equals()`
- How `hashCode()` works with `equals()`
- How static utility methods work
- How to process an array of objects
- How to calculate total inventory value
- How to find the highest-priced product

---

## Technologies Used

- Java
- IntelliJ IDEA
- Java OOP
- Custom Packages
- Arrays
- Static Utility Methods

---

## Question 3 Summary

The **Product Management System** demonstrates Java OOP by combining a `Product` class, a `ProductUtils` utility class, and a `Main` class.

It provides a simple example of how object-oriented programming can be used to store, compare, and process product information.
