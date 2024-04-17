# springboot-react-mysql-CURD


<HTML>
Reactjs + Spring Boot CRUD Full Stack Application
<br>
<h1> Spring Boot Backend </h1>
<br>
Create Springboot project using SpringToolSuite4 IDE by importing this project as maven project
<br>
Added SpringWeb, DevTools, Spring Data JPA, MySQL Driver and Lombok dependencies. Cross check with pom.xml
<br>
Create employeeportal database in MySQL
<br>
Update MySQL credentials in application.properties
<br>
Run Application class as Springboot project.
<br>
Test the CURD operations using Postman
GET = http://localhost:8080/api/v1/employees
<br>
GET = http://localhost:8080/api/v1/employees/1
<br>
DELETE = http://localhost:8080/api/v1/employees/1
<br>
PUT (update records) = http://localhost:8080/api/v1/employees
<br>
Input : body -> Raw
<br>
{
        "id":"1",
        "name": "Shiva",
        "location": "New Delhi",
        "department": "Sales"
}

POST (insert records) = http://localhost:8080/api/v1/employees
<br>
Input : body -> Raw
<br>
{
        "name": "Laxman",
        "location": "Bangalore",
        "department": "Marketing"
}
<br>
<h1> React.js Frontend </h1>
<br> 
we are creating my-app project
<br>
Run below comments:
<br>
node -v
<br>
npx create-react-app my-app
<br>
npm init react-app my-app
<br>
cd my-app
<br>
npm install axios
<br>
npm install react-router-dom
<br>
npm install bootstrap@4
<br>
Copy code from github to React.js project
<br>
Validate: Inside src folder, http-common.js file for the backend URL:  
<br>
baseURL: 'http://localhost:8080/api/v1',
<br>
Run the React App:
<br>
On the root of the project, open the command prompt, execute the following command
<br>
npm start
<br>
<img src="https://github.com/sathees-saty/springboot-react-mysql-CURD/assets/65384711/b20ce87d-bf2c-4ca2-a00a-3f94c51106be" alt="react" width="500" height="600">

<br>

![image](https://github.com/sathees-saty/springboot-react-mysql-CURD/assets/65384711/b20ce87d-bf2c-4ca2-a00a-3f94c51106be)

</html>
