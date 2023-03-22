# **🚖taxi-service🚖**
**A simple taxi service in the form of a Java application.**

This project is a simple Java application that allows you to work with the database of the taxi service.
The application uses Java version 11.
Tomcat or SmartTomcat is used to start and run the application.

## **⚡️Functionality**
### **‍️Driver👱‍♂️**
###### You can perform actions for the driver such as:
* add driver
* add driver to car
* delete driver
* get all drivers
### **Car🚗**
###### You can perform actions for the car such as:
* add car
* get all cars
* get current car
* delete car

### **Manufacturer🏭**
Each manufacturer has a name and a country.
The manufacturer object is a helper object for initializing machines.

### **Authentication🔑**
* login
* logout

## Instructions for run the project🦾
1. Download the code from [GitHub](https://github.com/diana-lomei/taxi-service) and save it to your computer.
2. Install [JDK](https://www.oracle.com/cis/java/technologies/downloads/)
3. Install [MySQL](https://dev.mysql.com/downloads/installer/)
4. Open MySql Workbench and create a new database.
5. Open the ConnectionUtil class and fill in the appropriate fields(URL, USERNAME, PASSWORD, JDBC_DRIVER).
6. Download [Tomcat](https://tomcat.apache.org/download-90.cgi) (v.9.0.73)
7. Set up your Tomcat
*   at the top near to the "run" button, click "Edit Configurations"
* then click "Add new Configuration"(it's "+") in the upper left corner
* select "Tomcat Server - local"
* click "Fix" and select "web-security:war exploded"
* and delete any new link that appeared after the "/"
* This is what your link should look like http://localhost:8080/
8. Press the Rune button or the Shift + F10 hotkey combination.🧑🏼‍💻

### **🛠️Used technologies🛠️**
* Java (JDK 11)
* MySQL
* TomCat
* Java Servlet API
* JUnit Jupiter API
* Dependency Injection With Field Injection (Injector)
* JSP and JSTL
* Apache Maven

### **Structure💻️**
#### ⚙️Controller
* package contains classes for processing requests, for user interaction with the program.
#### 🔩DAO
* package contains interfaces and their implementations for modifying database.
#### ❗️Exception
* package contains custom exceptions: AuthenticationException and DataProcessingException.
#### 📌Lib
* package has an Injector class to achieve Dependency Injection and required annotations: Dao, Inject and Service.
#### ⛓️Model
* package contains the main classes: Car, Driver, Manufacturer.
#### 🖇️Service
* package contains interfaces and their implementations to perform basic tasks with our objects.
* The service level lies between the controller level and the DAO level.
#### 🔗Util
* database connection package.
#### 🔍Filter
* The filter allows actions to be taken only by those who have access to it.
#### 📝 Resources
* contains file with SQL queries for creation a local copy of required database.
#### 🔧️WEB-INF
* contains all jsp pages for displaying user interface and web.xml file with all needed configuration.
