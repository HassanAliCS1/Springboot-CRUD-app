# Springboot-CRUD-app
text application

This Is a simple CRUD app
Create Read Update Delete.

Controller level:
/ : lists all employees in db
/showNewEmployeeForm : add new employee
/saveEmployee :  saves employee to db
showFormForUpdate/{id} : shows a specific employee based on id
/deleteEmployee/{id} : delete specific employee basked on id.

Service Level:
getAllEmployees() : gets all employees for /. 
saveEmployee(Employee employee) : Saves employee into db 
getEmployeeByID(long ID) : gets employee by id 
deleteEmployeeById(long id) : deletes specific employee 

All the code that actually does the action for service level comes form JPA Repo

Repository:
extends JpaRepository<Employee,Long>

Objects in model:
Employee. Id,Name, Email

What i learnt:
- objects and passing information.
- Design patterns.
- Database and CRUD
- HTTP request and response 
- spring boot MVC