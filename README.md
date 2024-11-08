﻿# Java Todo List

I developed a TodoList from scratch using Spring Boot. Learning from creating a RESTful API to complete task management.



##  Dependencies and Technologies

- Java 21
- Spring Boot
- Spring Web


## Features
I implemented essential features such as:
- List tasks
- Create task
- Update task
- Delete task
- Delete all tasks





## Execute the project

- Clone the project

```bash
  git clone https://github.com/jpllopes96/java-todo-list.git
```

- Open the project in your IDE and run it.

- Consume the API endpoints using an API Client(Postman, Bruno, Insomnia)





## Endpoints

```
  GET http://localhot:8080/tasks
  List all tasks
```

```
  POST http://localhot:8080/tasks
  Create a Task, JSON body {"id": 1, "description": "Task 01" }
```

```
  PUT http://localhot:8080/tasks/1
  Update the task by ID on URL, JSON body {"description": "Task 01 Updated" }
```

```
  DELETE http://localhot:8080/tasks/1
  Delete the task by ID on URL
```

```
  DELETE http://localhot:8080/tasks
  Delete all tasks
```

## Demo

<img alt="Get Request" src="src/assets/images/getRequest.png" width="100%">


## Find me

- 🌍 [Linkedin](https://www.linkedin.com/in/joao-lopes-071026198/)


