# springBootRestAPI
Technology used: Spring boot, Spring REST ws, JPA/Hibernate, Spring Data, JSON, MySQL database, Apache server
IDE: Eclipse
Testing tool: Postman

I have used different layers ( Domain, Controller, Service, Repository )


sample:: using Postman::

Inserting new Employee::
POST  http://localhost:8080/springBootRestAPI/employee/
  
  Body:
    {
    	  "id":109,
        "name":"joni",
        "sex":"male",
        "salary":120000,
        "phone":"3127894321"
    }
    
    Getting list of all Employees:
    
    GET  http://localhost:8080/springBootRestAPI/employees/
    
    Result Body:
    
    [
        {
            "id": 101,
            "name": "esa",
            "sex": "male",
            "salary": 34000,
            "phone": "1213223333"
        },
        {
            "id": 102,
            "name": "aida",
            "sex": "female",
            "salary": 75000,
            "phone": "7777777090"
        },
        {
            "id": 105,
            "name": "lora",
            "sex": "male",
            "salary": 33000,
            "phone": "8888888888"
        },
        {
            "id": 107,
            "name": "fana",
            "sex": "female",
            "salary": 3000,
            "phone": "9090909090"
        },
        {
            "id": 109,
            "name": "joni",
            "sex": "male",
            "salary": 120000,
            "phone": "3127894321"
        }
    ]


Get a spacific Employee byID: example  id:105

GET  http://localhost:8080/springBootRestAPI/employee/105

Result Body:

    {
      "id": 105,
      "name": "lora",
      "sex": "male",
      "salary": 33000,
      "phone": "8888888888"
    }
    
    
    Finding not exist employee will generate an error message:: 
    
    For example trying to get/find employee ID:100 will generate the bellow message::
    
        {
            "timestamp": 1508867145452,
            "status": 500,
            "error": "Internal Server Error",
            "exception": "java.lang.NullPointerException",
            "message": "No message available",
            "path": "/springBootRestAPI/employee/100"
        }
    
    
    
