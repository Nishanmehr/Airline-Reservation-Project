# ✈️ Airline Reservation System

A **desktop-based Airline Reservation System** built with Java Swing and MySQL, simulating real-world airline operations — from flight management and customer registration to ticket booking and PDF generation.

> Built as a personal project to demonstrate full-stack desktop application development using Java, JDBC, and MySQL with a modular OOP architecture.

---

##  Features

-  **Secure Login** — Admin authentication system
-  **Customer Management** — Add, search, and manage passenger records
-  **Flight Management** — Add and manage flight details and schedules
-  **Ticket Booking** — Real-time seat allocation with PNR generation
-  **PDF Ticket Generation** — Download ticket as PDF after booking
-  **Admin Dashboard** — View total bookings and revenue at a glance
-  **Date Picker** — Calendar-based date selection using JDateChooser
- ️ **MySQL Integration** — Persistent data storage with optimised queries

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java |
| GUI Framework | Java Swing |
| Database | MySQL |
| DB Connectivity | JDBC |
| Build Tool | Maven |
| IDE | Apache NetBeans / VS Code |
| External Library | JCalendar (JDateChooser) |

---

##  Project Structure

```
src/main/java/com/mycompany/airline_project/
│
├── Main.java                  # Application entry point
├── LoginFrame.java            # Admin login & authentication
├── AdminDashboard.java        # Dashboard — bookings & revenue overview
├── AddCustomer.java           # Register new customers
├── SearchCustomer.java        # Search existing customer records
├── AddFlight.java             # Add and manage flights
├── BookTicket.java            # Ticket booking + seat allocation
├── GetTicket.java             # Retrieve & download ticket as PDF
├── DateFormat.java            # Date utility helper
└── JLabelFlightIcon.java      # Custom UI component
```

---

##  Setup & Installation

### Prerequisites
- Java 11 or above
- MySQL 8.0+
- Maven
- VS Code or Apache NetBeans

### 1. Clone the Repository

```bash
git clone https://github.com/Nishanmehr/Airline-Reservation-Project.git
cd Airline-Reservation-Project
```

### 2. Configure the Database

Create a database in MySQL:

```sql
CREATE DATABASE airline_db;
```

Update the JDBC connection in the source files:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/airline_db",
    "your_username",
    "your_password"
);
```

### 3. Add JCalendar Library (VS Code)

Download JAR from: https://toedter.com/jcalendar/

```
1. Create a lib/ folder in the project root
2. Place the downloaded .jar inside lib/
3. Add to .vscode/settings.json:
```

```json
{
  "java.project.referencedLibraries": [
    "lib/**/*.jar"
  ]
}
```

### 4. Run the Project

```bash
# Using the provided batch script (Windows)
run.bat

# Or compile manually
mvn compile
mvn exec:java -Dexec.mainClass="com.mycompany.airline_project.Main"
```

---

## Key Technical Highlights

- **JDBC with optimised MySQL queries** for real-time seat availability and PNR generation
- **Modular OOP design** — each module (Customer, Flight, Ticket, Admin) is independently structured
- **Role-based access** — Admin-only operations protected behind login authentication
- **PDF generation** for downloadable ticket records
- **JDateChooser integration** for intuitive date selection in booking flow

---

##  Future Improvements

- [ ] REST API layer for web/mobile client support
- [ ] Spring Boot migration for scalable backend
- [ ] Payment gateway integration
- [ ] Email confirmation on booking
- [ ] Enhanced role-based access (Admin / Staff / Passenger)
- [ ] Docker containerisation

---

##  What I Learned

- Java Swing GUI development and event-driven programming
- JDBC connectivity and CRUD operations with MySQL
- Modular application architecture using OOP principles
- Handling external JAR libraries in Maven projects
- Real-world booking logic — seat locking, PNR generation, conflict handling

---

## 👨‍💻 Author

**Nishant Mehra**
- GitHub: [@Nishanmehr](https://github.com/Nishanmehr)
- LinkedIn: [linkedin.com/in/nishantmehraa](https://linkedin.com/in/nishantmehraa)
- Email: nishantmehra172@gmail.com

---

## ⭐ Support

If you found this project useful or interesting, please consider giving it a **star** on GitHub — it means a lot!

[![GitHub stars](https://img.shields.io/github/stars/Nishanmehr/Airlline-Reservation-Project?style=social)](https://github.com/Nishanmehr/Airlline-Reservation-Project)