# Set Interface

----

# Reinforcing Knowledge

Exercises:

1. Basic Operations with Set
2. Searching in Set
3. Sorting in Set

## Basic Operations with Set

### 1. Guest Set
<p>Create a class called "GuestSet" that has a set of objects of type "Guest" as an attribute. Each guest has attributes such as name and invitation code. Implement the following methods:

- `addGuest(String name, int invitationCode)`: Adds a guest to the set.
- `removeGuestByInvitationCode(int invitationCode)`: Removes a guest from the set based on the invitation code.
- `countGuests()`: Counts the total number of guests in the set.
- `displayGuests()`: Displays all guests in the set.
</p>

### 2. Unique Words Set

<p>Create a class called "UniqueWordsSet" that has a set of unique words as an attribute. Implement the following methods:

- `addWord(String word)`: Adds a word to the set.
- `removeWord(String word)`: Removes a word from the set.
- `checkWord(String word)`: Checks if a word is present in the set.
- `displayUniqueWords()`: Displays all unique words in the set.
</p>

----

## Set Search

### 1. Contact Agenda

<p>Create a class called "ContactAgenda" that has a set of objects of type "Contact" as an attribute. Each contact has attributes such as name and phone number. Implement the following methods:

- `addContact(String name, String number)`: Adds a contact to the agenda.
- `displayContacts()`: Displays all contacts in the agenda.
- `searchByName(String name)`: Searches contacts by name and returns a set with the found contacts.
- `updateContactNumber(String name, String newNumber)`: Updates the phone number of a specific contact.
</p>

### 2. Task List

<p>Create a class called "TaskList" that has a set of objects of type "Task" as an attribute. Each task has a description attribute and a boolean attribute to indicate whether the task has been completed or not. Implement the following methods:

- `addTask(String description)`: Adds a new task to the set.
- `removeTask(String description)`: Removes a task from the set according to the description, if present.
- `displayTasks()`: Displays all tasks in the task list.
- `countTasks()`:  Counts the total number of tasks in the task list.
- `getCompletedTasks()`:  Returns a set with the completed tasks.
- `getPendingTasks()`:  Returns a set with the pending tasks.
- `markTaskAsCompleted(String description)`:  Marks a task as completed according to the description.
- `markTaskAsPending(String description)`:  Marks a task as pending according to the description.
- `clearTaskList()`:  Removes all tasks from the task list.

-------

## Set Sorting

### 1.  Product Registration

<p>Create a class called "ProductRegistration" that has a set of objects of type "Product" as an attribute. Each product has attributes such as name, code, price, and quantity. Implement the following methods:

- `addProduct(long code, String name, double price, int quantity)`:  Adds a product to the registration.
- `displayProductsByName()`: Displays all products in the registration in alphabetical order by name.
- `displayProductsByPrice()`: Displays all products in the registration in ascending order of price.
</p>

### 2. Student List

<p>Create a class called "StudentManager" that will handle a list of students. Each student will have attributes such as name, enrollment, and grade. We will implement the following methods:

- `addStudent(String name, Long enrollment, double average)`: Adds a student to the set.
- `removeStudent(long enrollment)`: Removes a student from the set based on the enrollment, if present.
- `displayStudentsByName()`: Displays all students in the set in alphabetical order by name.
- `displayStudentsByGrade()`: Displays all students in the set in ascending order of grade.
- `displayStudents()`: Displays all students in the set.
</p>

---
