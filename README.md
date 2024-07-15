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

Creation of an expense entity, DTO, repository, and service in a Spring Boot application, including the implementation of a MySQL database and the structure of the expense table.

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

Creation of a POST expense API call in a Spring Boot application, including the implementation of the expense service and the expense controller.

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

Create a GET API to fetch all expenses sorted by date in descending order.

11. To sort expenses by date in a Spring Boot application, a method 'get all expenses' is created in the expense service implementation, sorting expenses in descending order by date using a comparator, and then collecting the sorted list.
          -Creating a method to retrieve all expenses and sorting them by date in a Spring Boot application.
          -Implementing the sorting logic using a comparator to order expenses in descending date order.
12. Creating and testing a GET all expenses API using Postman in a Spring Boot application. Running the application on Port 808 and verifying successful API calls.
          -Setting up and running a Spring Boot application on Port 808 and testing the GET all expenses API in Postman with a successful response.
          -Demonstrating the process of creating and calling the GET all expenses API, verifying the response, and creating a new expense using Postman.

Creating a GET Expense by ID API in Spring Boot, handling exceptions, and testing the API using Postman.

13. Creating a 'get expense by ID' API in a Spring Boot application involves adding a method to the expense service implementation to retrieve an expense by its ID.
          -Adding a new method named 'get expense by ID' in the expense service implementation to return an expense based on the provided ID.
          -Accepting the ID in the method and using the expense repository to find the expense by ID, handling availability using optional and throwing exceptions if needed.
14. The video demonstrates creating an API endpoint to retrieve expenses by ID, handling exceptions, and testing the API using Postman resulting in successful and failed responses.
          -Handling exceptions using catch blocks and returning appropriate HTTP statuses and messages.
          -Testing the created API endpoint using Postman by sending GET requests with different IDs, showing successful and failed responses.

Creating an update expense API call in a Spring Boot application, including handling exceptions and testing the API using Postman.

15. We will create an API to update expense details in a Spring Boot application, starting with implementing a new method named update expense that retrieves and updates expense details based on ID and expense DTO.
          -Explaining the process of updating expense details by retrieving existing expense, checking availability, and updating the details using the save or update expense method in a Spring Boot application.
          -Discussing the handling of scenarios where the optional expense is not present by throwing an exception in the else block of the update expense method.
16. Handling exceptions and updating expenses in a Java application. The process involves setting a message, passing an ID, writing methods, and handling different exceptions.
          -Setting up exception handling for entity not found and updating expenses in Java application. 
          -Creating methods to update expenses by setting message, passing ID, and handling exceptions like entity not found and generic exceptions. 
17. Updating an expense API using Postman, showing how to send a PUT request with JSON data, receive a 200 OK response, and handle different scenarios like updating, with detailed steps and outcomes.
          -Sending a PUT request with JSON data in Postman to update the expense API and receiving a 200 OK response, showcasing successful data updating process.
          -Handling different scenarios like updating the amount and ID of the expense, showing the process and responses for successful and failed updates.

Creating a delete expense API call in a Spring Boot application, including handling exceptions and verifying the deletion in a MySQL database.

18.  We will create a delete expense API in our Spring Boot application by implementing a method to check and delete expenses by ID.
          -Implementing a method to check the availability of expenses before deletion using Spring Boot.
          -Handling exceptions and throwing 'EntityNotFoundException' if expense with the provided ID is not found.
19. Updating and implementing a delete method for the expense API in a Spring Boot application. The process involves handling exceptions, setting up the API endpoint, testing in Postman, and verifying the deletion in MySQL.
          -Handling exceptions like entity not found and internal server error when deleting an expense in the Spring Boot application.
          -Testing the delete expense API using Postman by sending a delete request with the expense ID and verifying the response status.
          -Verifying the deletion of an expense by checking the updated data in the expense table in MySQL Workbench after successfully deleting an expense.

Creating an income entity, DTO, service, and repository in a Spring Boot application for an expense and income tracker.

20. Create an income entity, DTO, repository, and other necessary files in our Spring Boot application. Let's start by defining the income entity with properties like ID, title, amount, date, and category.
          -Defining the income entity with properties like ID, title, amount, date, and category is essential for storing income data in the application.
          -Annotating the income entity with relevant annotations like @Entity, @Id, @GeneratedValue, and defining data types for each property ensures proper data storage and retrieval functionality.
21. Creating an income entity and repository in Java with JPA annotations. Running the application to verify table creation and structure in MySQL Workbench.
          -Creating income entity with properties like category and description using Java. Defining income repository with JPA annotations for data access.
          -Running the application to confirm successful execution on port 8080. Checking SQL query execution for creating the income table in MySQL Workbench.
          -Verifying the created income table structure in MySQL Workbench. Examining the table columns like ID, amount, category, date, description, and title.
22. To create a Spring Boot application, we need to set up an income service and its implementation within a new package, followed by creating an income DTO and an income controller. 
          -Setting up the income service and its implementation within a new package in a Spring Boot application. 
          -Creating an income DTO with annotations for getters and setters, and transferring properties from the income entity to the DTO. 
          -Developing an income controller by annotating it as a REST controller, setting up request mapping, and defining the URL for the REST API. 
23.  To convert income entity to income DTO, a method 'get income dto' is created in the class, setting ID, title, amount, category, description, and date, returning the income DTO. Application runs error-free on port 8080.
          -Creating a mapping method 'get income dto' to convert income entity to income DTO by setting various attributes like ID, title, amount, category, and date.
          -Importing DTO from expense tracker, setting attributes for income DTO, and ensuring the application runs smoothly on port 8080 without any errors.

Creation of a Spring Boot API to retrieve all incomes, with sorting functionality, and the conversion of income entities to DTOs.

23. Create an API call to get all incomes, sort them, and convert them into income DTOs in a Spring Boot application.
          -Creating an API call to get all incomes, sorting them, and converting them into income DTOs.
          -Implementing the method to return a list of income DTOs and applying sorting logic.
          -Converting income entities into income DTOs using mapping and collecting them into a list.
24. Creating a 'get all incomes' API in a Spring Boot application. The API is tested using Postman, showcasing successful retrieval of income data.
          -Setting up the 'get all incomes' method with a response entity in the Spring Boot application.
          -Testing the 'get all incomes' API using Postman by sending a GET request with specific URLs.
          -Interpreting the successful API call response by receiving income data from the backend application.

Creation of an update income API call in a Spring Boot application, including handling exceptions and updating income details.

25. Create an update income API call in our Spring Boot application by writing a new method to update income based on provided ID and DTO.
          -The method will first retrieve the income by ID, check its availability, and then either save/update the income or throw an exception if not found.
          -The update income method will involve using optional variables, calling repository methods, and handling different scenarios based on the availability of income.
26. To update income data in a service, a method named 'updateIncome' is created in the income controller, accepting ID and income dto, using response entity. Error handling includes catching 'entity not found exception' and general exceptions.
          -Creating an update method in the income controller to handle income data modifications using response entity. 
          -Implementing error handling by catching 'entity not found exception' and general exceptions to return appropriate response entities.
27. The video demonstrates updating income using an API. It shows testing the update income API call using Postman, successfully updating the income details, and receiving a 200 OK response.
          -Testing the update income API call using Postman and encountering a 404 error due to income not being present with the specified ID.
          -Successfully updating the income details by changing the title and amount, receiving a 200 OK response with the updated information in the response body.

Creation of a GET Income by ID API call in a Spring Boot application, including handling exceptions and testing the API using Postman.

28. We create an API call to get income by the ID in a Spring Boot application, demonstrating how to implement the get income by ID method in the income service implementation.
          -Exploring the process of creating a method to get income by ID in a Spring Boot application.
          -Detailed steps involved in implementing the get income by ID method in the income service implementation.
29. Creating an API endpoint in a controller to get income by ID involves writing specific methods to handle responses and exceptions effectively.
          -Implementing response entity and error handling methods in the controller for better API functionality.
          -Setting up specific catch blocks to handle different types of exceptions like entity not found and internal server errors.
30. Testing APIs using Postman to get and update income information. Demonstrating how to send requests and receive responses with different status codes and data details.
          -Testing API requests with Postman to retrieve income data by ID and updating the ID to see different responses and status codes.
          -Exploring the response received from the API call, understanding status codes like 404 and 200, and analyzing the data structure of the income details.

Deleting income API call in Spring Boot application, handling exceptions, and testing the API using Postman.

31. Creating a delete income API call in a spring boot application by implementing a delete income method in the income service. This method checks for income availability and either deletes it or throws an exception.
          -Creating a delete income method in the income service implementation by checking income availability and handling deletion or exception based on the result.
          -Copying and pasting the delete income method into the income service, and setting up the delete endpoint in the income controller to return a response entity.
32. The process of creating a 'delete' method for an income API, handling exceptions and testing it using Postman. The method is annotated and successfully deletes income entries based on the provided ID.
          -Creating a 'delete' method for an income API by handling exceptions and returning appropriate responses based on the ID provided.
          -Testing the 'delete' method using Postman by selecting the delete request type, providing the URL and ID, and verifying the responses received.
          -Completion of the 'delete' income API call with successful deletion of income entries based on the provided ID.

Creation of an API to fetch income and expense data for a graph in a Spring Boot application, including the implementation of custom repository methods and a stats service.

33. We will create an API call to get chart data showing incomes and expenses of the last 27 days in our Spring Boot application. We will also create a graph DTO and service classes to handle the data processing.
          -Creating a graph DTO to handle list of expenses and incomes with Lombok annotations in our Spring Boot application.
          -Setting up service classes, including a stats service interface and implementation, to manage income and expense repositories.
34. Developing custom methods in repositories is crucial for fetching specific data in Java applications. It involves defining methods to retrieve data based on criteria and updating return types accordingly.
          -Importing necessary packages like java.util and java.time is essential for defining custom methods in Java repositories.
          -Creating methods like 'get list of incomes between two dates' and 'find by date' with appropriate parameters is key in repository development.
          -Adapting and reusing methods by copying and pasting them across repositories helps in maintaining consistency and efficiency in code development.
35. To create a graph in Java, initialize the graph, set data for expense and income lists using repositories, find data by date, and return the graph. This completes the 'get chart data' method.
          -Implementing the stats service and creating a stats controller with REST annotations and endpoint mappings in Java.
          -Injecting the stats service into the stats controller and setting up cross-origin requests for the API in a Java application.
36. Creating a 'get chart details' API using Spring Boot, testing it in Postman, and receiving a successful response with data objects.
          -Demonstrating API testing in Postman and receiving a successful response with data objects. It provides a step-by-step guide on how to test the API. 

Creating a Stats API that calculates the total income, total expense, latest income, and latest expense using Spring Boot.

37. We will create a stats API to get total income, total expense, latest income, and latest expense. We will also set up DTOs and write SQL queries in repositories.
          -Setting up a stats API to retrieve financial data like total income and expenses. Creating DTOs and annotating classes with Lombok for getters and setters.
          -Writing SQL queries in income and expense repositories to calculate total income and total expenses. Defining methods to sum amounts in the repositories.
38. How to calculate total income and total expense in a financial application using SQL queries and repository methods.
          -Creating SQL queries to calculate total income and total expense in a financial application.
          -Updating repository methods for income and expenses to perform sum calculations.
39. Implementing methods to handle expenses and income in a stats service, involving sorting by date and checking for availability of income and expense data.
          -Implementing a method to find the latest expense by sorting expenses by date in an expense repository.
          -Copying the expense method to handle income in an income repository and setting up the stats service implementation.
40. Creating a stats API using functional style expressions. It includes writing methods, endpoints, running the application, and testing the API using Postman.
          -Creating a stats API using functional style expressions and writing necessary methods and endpoints.
          -Running the application and testing the stats API using Postman to ensure functionality.
          -Future updates to the stats API including adding more options like balance and implementing code for various income and expense metrics.

Update a Spring Boot application's stats API to calculate the balance, minimum and maximum income and expense.

41. We will update the stats API to calculate balance, minimum and maximum income, and minimum and maximum expenses in a Spring Boot application.
          -Updating the stats DTO by adding fields for balance, minimum and maximum income, and expenses.
          -Updating the service method in the stats service implementation to calculate balance, min/max incomes, and expenses.
42. To calculate minimum and maximum income and expenses, the process involves importing lists for income and expenses, mapping the values, and updating methods accordingly.
          -Importing and mapping income and expense lists.
          -Updating methods for calculating minimum and maximum values.
43. Implementing API calls for financial stats, updating various expense and income variables, and testing the API response in Postman for successful results.
          -Detailing the process of updating expense and income variables based on conditions for API implementation. 
          -Testing the API response in Postman by sending a request and verifying the received data including income, expense, balance, and financial limits. 

Integrates OpenAPI UI (Swagger UI) in Spring Boot application, tests APIs, and explores income, expense, and stats controllers.

44. Integrating Springdoc OpenAPI (previously Swagger) into a Spring Boot application to test APIs. Adding dependencies and running the application successfully is shown.
          -Adding Springdoc OpenAPI to a Spring Boot application by updating the pom file with necessary dependencies.
          -Running the Spring Boot application successfully without errors and accessing the Swagger UI in the browser to test APIs.
45. Creating, retrieving, updating, and deleting income and expenses through API calls with IDs. It also shows working with expense controllers, stats controllers, and generating charts.
          -The process of creating, retrieving, updating, and deleting income through API calls with specific IDs.
          -Working with expense controllers and understanding how they operate similarly to income controllers.
          -Utilizing stats controllers to generate charts and retrieve data on income, expenses, and financial balances.
