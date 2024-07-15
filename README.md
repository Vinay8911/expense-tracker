# expense-tracker
Creation of a new Spring Boot application to calculate Expenses, configuring a MySQL database, and setting up the necessary configurations to connect the application to the database.

1. To create a new Spring Boot application, use Spring Initializer to set up project metadata, select dependencies like Spring Web, MySQL Driver, Spring Data JPA, and Lombok to reduce boilerplate code.
          -Setting up project metadata involves defining group, artifact, project name, packaging, and Java version for the Spring Boot application.
          -Selecting dependencies like Spring Web for creating RESTful APIs, MySQL Driver for database interaction, Spring Data JPA for database operations, and Lombok for reducing code.
          -Generating the project after setting up metadata and dependencies, extracting the project files, and organizing them in the desired folder for further development.
2. To set up a Spring Boot project, extract the project folder, open it in an IDE, configure project details including Spring Boot version and dependencies, and connect to a MySQL database by writing configurations in application.properties file.
          -Extract the project folder and open it in an IDE to work on the Spring Boot project.
          -Configure project details like Spring Boot version, Java version, and dependencies such as Spring Boot Starter Data JPA.
          -Connect the Spring Boot project to a MySQL database by writing configurations in the application.properties file.
3. To configure database settings in a Spring application, set the password, driver class name, JPA configurations, and create a schema in MySQL using MySQL Workbench. Application runs successfully on port 8080.
          -Configuring database settings involves setting password, driver class name, and JPA configurations in a Spring application.
          -Creating a schema in MySQL using MySQL Workbench by specifying the schema name and applying the SQL script.
          -Running the Spring application successfully on port 8080 without errors after configuring the database settings and creating the schema in MySQL.


This part contains the creation of an expense entity, DTO, repository, and service in a Spring Boot application, including the implementation of a MySQL database and the structure of the expense table.


4. We will create expense entity, DTO, repository, and service in a Spring Boot application. Let's start by creating the expense entity.
          -Creating the expense entity involves creating a new Java class with annotations like @Entity and @Data for getters and setters.
          -Defining properties like ID, title, and description for the expense entity and setting up primary key and generation strategy.
5. To create an expense tracking system, we need to define properties like description, category, date, and amount in an entity class, create a repository using JPA for basic operations, and then develop a service layer for managing expenses.
          -Defining entity properties like description, category, date, and amount with appropriate data types in Java for an expense tracking system.
          -Creating a repository using JPA to perform basic operations on the defined entity for managing expenses efficiently.
          -Developing a service layer to handle business logic and interactions with the repository for effective management of expenses in the system.
6. Creating Java classes for an expense service and DTOs, annotating them, setting properties like ID, title, description, and category, and running the application successfully. Verifying table creation in MySQL Workbench.
          -Annotating Java classes with service annotation and creating DTOs with data annotation for Getters and Setters. Naming properties like ID, title, and description.
          -Setting up properties like category, date, and amount in the DTOs. Completing the entity, repository, and service for the expense.
          -Running the application successfully, observing SQL query execution to create a table named 'expense'. Verifying table existence and columns in MySQL Workbench.

This part demonstrates the creation of a POST expense API call in a Spring Boot application, including the implementation of the expense service and the expense controller.

7.  we will create a post expense API call in our Spring Boot application by implementing methods in the expense service. Let's begin by injecting the expense repository and creating a method to save or update expenses.
          -Injecting the expense repository and creating a method to save or update expenses in the Spring Boot application.
          -Setting the title, date, amount, and category for the expense in the method implementation.
8. To create and save expenses in a Java application, methods like set description and save/update expense are used, along with creating an endpoint in the expense controller. 
          -Method set description is used to set the description of expenses, followed by saving the expense using the save method. 
          -Creating a post expense method that accepts expense DTO, creates a new expense object, and saves or updates the expense. 
          -Setting up an expense controller by creating a new Java class annotated with rest controller and request mapping for API endpoints. 
9. To create a post expense API call, inject expense service into the expense controller, define a method to handle expense creation, and test it using Postman. 
          -Injecting expense service into the expense controller and defining the post expense method with request body annotation and DTO parameters. 
          -Handling the creation of expenses by calling the expense service method, checking for null, setting response status, and annotating the method with post mapping. 
          -Testing the post expense API using Postman after running the application successfully without errors. 
10. Creating a post expense API using Postman involves selecting request types, providing a URL, choosing body options like raw and JSON, passing title, amount, date, category, and description, then sending the request to get a successful response with the created expense details.
          -Verifying the created expense entry in MySQL Workbench by opening the expense tracker schema, tables, and viewing the data of the expense table to confirm the record with the same details as provided in the request body.
          -Previewing the record of the created expense in MySQL Workbench, showcasing the ID and other details matching those inputted in the request, concluding the demonstration of creating a post expense API.
