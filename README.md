Interview Scheduler System
A simple Java-based console application demonstrating an Interview Scheduling System implemented using the SOLID design principles.
________________________________________
Overview
This project models the core functionalities required for scheduling interviews between candidates and interviewers. It emphasizes clean code architecture by applying the SOLID principles:
•	Single Responsibility Principle
•	Open/Closed Principle
•	Liskov Substitution Principle
•	Interface Segregation Principle
•	Dependency Inversion Principle
________________________________________
Features
•	Schedule interviews with flexible scheduling strategies
•	Manage candidates and interviewers as separate entities
•	Send notifications and log activities via separate, interchangeable components
•	Easily extendable scheduling and notification mechanisms due to use of interfaces and abstraction
________________________________________
Project Structure
Class/Interface	Responsibility	SOLID Principle Example
Candidate	Represents a candidate	Single Responsibility Principle (SRP)
Interviewer	Represents an interviewer	SRP
Interview	Represents a scheduled interview	SRP
ScheduleStrategy	Interface for scheduling strategy	Open/Closed Principle (OCP)
DefaultScheduleStrategy	Default implementation of interview scheduling	OCP, Liskov Substitution Principle (LSP)
InterviewScheduler	Manages interview scheduling	Dependency Inversion Principle (DIP)
Notifiable	Interface for notification sending	Interface Segregation Principle (ISP)
Loggable	Interface for logging	ISP
EmailNotifier	Sends notifications via email	DIP
ConsoleLogger	Logs messages to console	DIP
NotificationService	Uses abstractions to send notifications and log	DIP
________________________________________
How to Run
1.	Clone the repository or copy the source files.
2.	Compile the Java files with your preferred IDE or command line.
3.	Run the Main class.
You will see the interview being scheduled, notification sent, and logging output on the console.
________________________________________
Extending the Project
•	Add new scheduling strategies by implementing ScheduleStrategy (e.g., WeekendScheduler).
•	Implement other notification types like SMS or Push Notification by implementing Notifiable.
•	Integrate a persistent data store for candidates, interviewers, and interviews.
•	Add a REST API layer using Spring Boot for web interface.
________________________________________
Author
Your Name or Your GitHub handle
________________________________________
License
Specify the license here (e.g., MIT License)
________________________________________
Let me know if you want me to help with a Spring Boot backend or Angular frontend next!

