# EI_Projects

This repository contains two exercises that demonstrate various software design patterns and a Virtual Classroom Manager application. Each exercise is implemented in Java, adhering to best practices and showcasing the usage of design patterns in software development.

## Prerequisites
- Java Development Kit (JDK) installed
- Set up the `JAVA_HOME` environment variable
- Add `javac` and `java` to your system's PATH

---

## Exercise 1: Design Pattern

### Overview

This project demonstrates the use of several software design patterns in Java. Each pattern is implemented with specific use cases to showcase its applicability and behavior.

### Design Patterns Covered

#### Behavioral Patterns:

1. **Strategy Pattern:** 
   - **Use Case:** Payment system with various payment methods.
   - Demonstrates how to use different payment strategies like Credit Card, PayPal, and Bitcoin to pay for items in a shopping cart.
   
2. **Observer Pattern:** 
   - **Use Case:** News publisher-subscriber model.
   - Illustrates a simple implementation where subscribers receive updates when a news publisher releases new articles.

#### Creational Patterns:

1. **Singleton Pattern:** 
   - **Use Case:** Configuration manager.
   - Ensures a single instance of the configuration manager is used throughout the application, maintaining consistent application settings.

2. **Factory Pattern:** 
   - **Use Case:** Vehicle factory for different vehicle types.
   - Provides a way to create objects of different types (e.g., Car, Bike, Truck) without specifying the exact class of object that will be created.

#### Structural Patterns:

1. **Adapter Pattern:** 
   - **Use Case:** Audio player using an adapter for media formats.
   - Allows the audio player to support multiple audio formats by adapting interfaces of incompatible media players.

2. **Decorator Pattern:** 
   - **Use Case:** Notification system where different types of notifications
   -  Implement a notification system where different types of notifications (e.g., Email, SMS, Push) can be dynamically added to a base notification.

### Running the Examples

Each design pattern is located in its respective package and can be run independently.

---

## Exercise 2: Virtual Classroom Manager

### Overview

The **Virtual Classroom Manager** is a terminal-based application that allows for managing virtual classrooms. This includes class scheduling, student enrollment, and assignment handling. It is designed to be a backend system for an EdTech platform.

### Features

- **Classroom Management:**
  - Add, list, and remove classrooms.
  
- **Student Management:**
  - Enroll students, list students in classrooms, and remove students.
  
- **Assignment Management:**
  - Schedule assignments, submit assignments, and list submissions.

---

### Running the Application

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/EI_Projects.git
   cd EI_Projects/Exercise2
   
2. **Compile the Java files**
   
  Open your terminal or command prompt and navigate to the directory containing your .java files.

3. **Run the application:**

   After compiling, you can run your Java application using the java command. You need to specify the class that contains the main method.
