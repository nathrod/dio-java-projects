# List Interface

----

# Reinforcing Knowledge

Exercises:

1. Basic Operations with List
2. Searching in List
3. Sorting in List

## Basic Operations with List

### 1. Task List
<p>Create a class called "TaskList" that has a list of tasks as an attribute. Each task is represented by a class called "Task" that has a description attribute. Implement the following methods:

- `addTask(String description)`: Adds a new task to the list with the provided description.
- `removeTask(String description)`: Removes a task from the list based on its description.
- `getTotalNumberOfTasks()`: Returns the total number of tasks in the list.
- `getTaskDescriptions()`: Returns a list containing the description of all tasks in the list.
</p>

### 2. Shopping Cart:

<p>Create a class called "ShoppingCart" that represents an online shopping cart. The cart should be implemented as a list of items. Each item is represented by a class called "Item" that has attributes such as name, price, and quantity. Implement the following methods:

- `addItem(String name, double price, int quantity)`: Adds an item to the cart with the specified name, price, and quantity.
- `removeItem(String name)`: Removes an item from the cart based on its name.
- `calculateTotalValue()`: Calculates and returns the total value of the cart, taking into account the price and quantity of each item.
- `displayItems()`: Displays all items in the cart, showing their names, prices, and quantities
</p>

----

## Searching in List

### 1. Book Catalog

<p>Create a class called "BookCatalog" that has a list of objects of type "Book" as an attribute. Each book has attributes such as title, author, and publication year. Implement the following methods:

- `addBook(String title, String author, int publicationYear)`: Adds a book to the catalog.
- `searchByAuthor(String author)`: Searches for books by author and returns a list with the found books.
- `searchByYearRange(int initialYear, int finalYear)`: Searches for books published in a specific range of years and returns a list with the found books.
- `searchByTitle(String title)`: Searches for books by title and returns the first found book.
</p>

### 2. Sum of Numbers

<p>Create a class called "SumNumbers" that has a list of integers as an attribute. Implement the following methods:

- `addNumber(int number)`: Adiciona um número à lista de números.
- `calculateSum()`: Calculates the sum of all numbers in the list and returns the result.
- `findHighestNumber()`: Finds the largest number in the list and returns the value.
- `findLowestNumber()`:  Finds the smallest number in the list and returns the value.
- `displayNumbers()`: Returns a list containing all the numbers present in the list.

-------

## Sorting in List

### 1.  Sorting People

<p>Create a class called "PeopleSorting" that has a list of objects of type "Person" as an attribute. Each person has attributes such as name, age, and height. Implement the following methods:

- `addPerson(String name, int age, double height)`: Adds a person to the list.
- `sortByAge()`: Sorts the people in the list by age using the Comparable interface.
- `sortByHeight()`: Sorts the people in the list by height using a custom Comparator.
</p>

### 2. Sorting Numbers

<p>Create a class called "NumberSorting" that has a list of integers as an attribute. Implement the following methods:

- `addNumber(int number)`: Adds a number to the list.
- `sortAscending()`: Sorts the numbers in the list in ascending order using the Comparable interface and the Collections class.
- `sortDescending()`: Sorts the numbers in the list in descending order using Comparable and the Collections class.
</p>

---
