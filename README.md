🏥 Hospital Management System
📌 Project Purpose

This project was developed to learn and practice backend development concepts using Spring Boot.
The main purpose of the Hospital Management System is to understand and apply:
1. Layered architecture (Controller, Service, Repository)
2. DTO (Data Transfer Object) pattern
3. Entity relationships (OneToMany, ManyToOne)
4. Pagination using Pageable
5. Global exception handling
6. RESTful API design principles

The system simulates a real-world hospital scenario where:
1. Patients can be created and managed
2. Doctors can be added, updated, and assigned
3. Appointments can be scheduled between patients and doctors with availability checks

The system is built using layered architecture:
1. Controller layer
2. Service layer
3. Repository layer and follows best practices such as DTO usage, pagination, and global exception handling.

🛠️ Technologies Used
Java 17+
Spring Boot
Spring Data JPA
Hibernate
Lombok
PostgreSQL

⚠️ Exception Handling
The project uses a GlobalExceptionHandler to handle:
Patient not found
Doctor not found
Appointment conflicts
Doctor availability issues
All exceptions return meaningful HTTP status codes and messages.

✅ Features Implemented
✔ DTO (Request / Response)
✔ CRUD operations
✔ Pagination
✔ Global Exception Handling
✔ Entity relationships
✔ Clean architecture

📌 Author
👤 Kanan Shukurzade
📅 Year: 2026
📚 Project Type: Educational / Learning & Practice Project