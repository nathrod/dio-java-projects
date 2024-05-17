# Map Interface

----

# Reinforcing Knowledge

Exercises:

1. Basic Operations with Map
2. Searching in Map
3. Sorting in Map

## Basic Operations with Map

### 1. Contact Agenda
<p>Create a class called "ContactAgenda" that uses a Map to store the contacts. Each contact has a name as the key and a phone number as the value. Implement the following methods:

- `addContact(String name, Integer phoneNumber)`: Adds a contact to the agenda, associating the contact's name with the corresponding phone number.
- `removeContact(String name)`: Removes a contact from the agenda, given the contact's name.
- `displayContacts()`: Displays all contacts in the agenda, showing the name and phone number of each contact.
- `searchByName(String name)`: Searches for a contact by name and returns the corresponding phone number.
</p>

### 2. Dictionary
<p>Create a class called "Dictionary" that uses a Map to store words and their respective definitions. Implement the following methods:

- `addWord(String word, String definition)`: Adds a word and its definition to the dictionary, associating the word with its corresponding definition.
- `removeWord(String word)`: Removes a word from the dictionary, given the term to be removed.
- `displayWords()`: Displays all words and their definitions from the dictionary, showing each word followed by its respective definition.
- `searchByWord(String word)`: Searches for a word in the dictionary and returns its corresponding definition.
</p>

----

## Map Search

### 1. Product Inventory with Price

<p>Create a class called "ProductInventory" that uses a Map to store products, their quantities in stock, and their respective prices. Each product has a code as the key and a Product object as the value, containing name, quantity, and price. Implement the following methods:

- `addProduct(long code, String name, int quantity, double price)`: Adds a product to the inventory, along with the available quantity and price.
- `displayProducts()`: Displays all products, their quantities in stock, and prices.
- `calculateTotalInventoryValue()`: Calculates and returns the total value of the inventory, considering the quantity and price of each product.
- `getMostExpensiveProduct()`: Returns the most expensive product in the inventory, i.e., the one with the highest price.
- `getCheapestProduct()`: Returns the cheapest product in the inventory, i.e., the one with the lowest price.
- `getProductWithHighestQuantityTotalValueInInventory()`: eturns the product with the highest quantity in stock, considering the total value of each product (quantity * price).
</p>

### 2. Word Count

<p>Create a class called "WordCount" that uses a Map to store words and the number of times each word appears in a text. Implement the following methods:

- `addWord(String word, Integer count)`: Adds a word to the count.
- `removeWord(String word)`: Removes a word from the count if it is present.
- `displayWordCount()`: Displays all words and their respective counts.
- `findMostFrequentWord()`:  Finds the most frequent word in the text and returns the word and its count.
</p>

-------

## Map Sorting

### 1.  Event Schedule

<p>Create a class called "EventSchedule" that uses a Map to store dates and their respective Events. Each event is represented by an object of the "Event" class, which has attributes such as event name and attraction name. Implement the following methods:

- `addEvent(LocalDate date, String name, String attraction)`: Adds an event to the schedule.
- `displaySchedule()`: Displays the event schedule in ascending order of date.
- `getNextEvent()`:  Returns the next event that will occur.

</p>

### 2. Online Bookstore

<p>Create a class called "OnlineBookstore" that represents an online bookstore. This class uses a Map to store the books available in the bookstore, using the link of the work on the Amazon Marketplace as the key and an object of the "Book" class as the value. The "Book" class has attributes such as title, author, and price. Through the "OnlineBookstore" class, implement the following methods:

- `addBook(String link, String title, String author, double price)`: Adds a book to the bookstore, using the ISBN as the key in the Map.
- `removeBook(String title)`: Removes a book from the bookstore, given the book's title.
- `displayBooksSortedByPrice()`: Displays the books in the bookstore in ascending order of price.
- `searchBooksByAuthor(String author)`: Returns a list of all books written by a certain author.
- `getMostExpensiveBook()`: Returns the most expensive book available in the bookstore.
- `displayCheapestBook()`: Returns the cheapest book available in the bookstore.

</p>

---
