Project Title
A brief description of what this project does and who it's for

Airline Reservation System (Java Swing Desktop Application)
A desktop-based Airline Reservation System built using Java Swing and MySQL that allows users to manage flights, customers, and ticket bookings through an interactive graphical interface.

Description
This project is designed to simulate a real-world airline management system. It provides an easy-to-use interface where users (admin) can add and manage customers, flights, and bookings.

The application follows a modular structure with different sections like Customer, Flight, Ticket, and Admin, making it organized and scalable.

Features
Add and search customers
Add and book flights
Book tickets and generate ticket records
View And download ticket PDF
Real time seat allocation
Login authentication
Admin dashboard (With total bookin revenue and total flight)
Date selection using calendar (JDateChooser)
User-friendly Java Swing interface
MySQL database integration
Modules
Customer Module
Add new customers
Search existing customers
Flight Module
Add flight details
Manage flight records
Ticket Module
Book tickets
Generate and retrieve ticket details
Admin Module
Dashboard interface
Manage system operations
Tech Stack
Language: Java
GUI: Java Swing
Database: MySQL
IDE: Apache NetBeans / VS Code
Build Tool: Maven
External Dependencies
JCalendar Library
Used for date selection in flight booking.

Setup (VS Code)
Download JAR from: https://toedter.com/jcalendar/
Create lib/ folder in project
Add .jar file inside it
Add in .vscode/settings.json:
{
  "java.project.referencedLibraries": [
    "lib/**/*.jar"
  ]
}
Project Structure
src/main/java/com/mycompany/airline_project/
│
├── Main.java
├── LoginFrame.java
├── AddCustomer.java
├── SearchCustomer.java
├── AddFlight.java
├── BookTicket.java
├── GetTicket.java
├── AdminDashboard.java
├── DateFormat.java
├── JLabelFlightIcon.java
Installation & Setup
Clone Repository
git clone https://github.com/Nishanmehr/Airlline-Reservation-Project.git
cd Airlline-Reservation-Project
Configure Database
Create MySQL database and update connection:

Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/airline_db",
    "username",
    "password"
);
Run Project
Open project in VS Code or NetBeans
Compile and run Main.java
Screenshots
Add screenshots of your UI here (very important for resume)

Future Improvements
Login & authentication system
Payment integration
Improved UI design
Email notifications
Role-based access control
Learning Outcomes
Java Swing GUI development
JDBC database connectivity
CRUD operations
Modular application design
Handling external libraries in VS Code
Author
Nishant GitHub: https://github.com/Nishanmehr

Support
If you like this project, give it a ⭐ on GitHub!
