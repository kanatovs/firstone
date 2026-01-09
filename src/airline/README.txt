# Airline Reservation Portal (Java OOP Project)


## Project Description
This project is a simple Airline Reservation Portal implemented in Java.  
It demonstrates the use of object-oriented programming principles such as abstraction, encapsulation, inheritance, and polymorphism.


The system allows managing flights, passengers, and bookings, as well as organizing and processing data using collections.


## Subject Area
Airline Reservation Portal


### Main entities:
- Flight
- Passenger
- Booking


## Technologies Used
- Java (JDK 17 or later)
- IntelliJ IDEA
- Git & GitHub


## Project Structure
src/ 
└── airline/ 
 ├── Flight.java 
 ├── Passenger.java
 ├── AdultPassenger.java
 ├── ChildPassenger.java
 ├── Booking.java
 └── Main.java
## Object‑Oriented Principles


- **Abstraction**: The `Passenger` class is abstract and provides common behavior for all passenger types.  
- **Encapsulation**: All fields are private or protected and are accessed through getters and setters.  
- **Inheritance**: `AdultPassenger` and `ChildPassenger` extend the abstract `Passenger` class.  
- **Polymorphism**: Code works with the base `Passenger` type, while each subclass implements its own ticket‑pricing logic.


## Data Handling


- Uses an `ArrayList` as a data pool.  
- Searches by checking object properties.  
- Filters with simple conditional statements.  
- Sorts using a `Comparator`.


## Overridden Methods


- `toString()` – gives a readable object output.  
- `equals()` – provides logical object comparison.  
- `hashCode()` – keeps consistency with `equals`.


## How to Run


1. Clone the repository.  
2. Open the project in IntelliJ IDEA.  
3. Make sure the JDK is installed and configured.  
4. Run the `Main` class.


## Output


- Sorted flight list.  
- Filtered flight results.  
- Booking information.  
- Ticket prices based on passenger type.  
- Comparison results using the overridden methods.


## Author
KANATOV SABYRZHAN SE-2501