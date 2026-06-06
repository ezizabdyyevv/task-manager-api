# Task Manager API 📝

A RESTful Task Manager API built with **Java**, **Spring Boot**, and **PostgreSQL**. This project demonstrates core backend development skills including REST API design, database integration, and error handling.

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot 3.5**
- **Spring Data JPA / Hibernate**
- **PostgreSQL**
- **Maven**

## ✨ Features

- Create, read, update, and delete tasks (full CRUD)
- Mark tasks as done
- Persistent data storage with PostgreSQL
- Global error handling with clean error messages
- RESTful API design

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/tasks` | Get all tasks |
| POST | `/tasks` | Create a new task |
| PUT | `/tasks/{id}` | Mark a task as done |
| DELETE | `/tasks/{id}` | Delete a task |

## 📋 Request & Response Examples

### Create a Task
**POST** `/tasks`
```json
{
    "title": "Buy groceries"
}
```
**Response:**
```json
{
    "id": 1,
    "title": "Buy groceries",
    "done": false
}
```

### Get All Tasks
**GET** `/tasks`
```json
[
    {
        "id": 1,
        "title": "Buy groceries",
        "done": false
    }
]
```

### Mark Task as Done
**PUT** `/tasks/1`
```json
{
    "id": 1,
    "title": "Buy groceries",
    "done": true
}
```

### Delete a Task
**DELETE** `/tasks/1`

Returns `200 OK` on success, `404 Not Found` if task doesn't exist.

## ⚙️ Setup & Installation

### Prerequisites
- Java 17+
- PostgreSQL
- Maven

### Steps

1. **Clone the repository**
```bash
git clone https://github.com/yourusername/task-manager-api.git
cd task-manager-api
```

2. **Create a PostgreSQL database**
```sql
CREATE DATABASE taskManager;
```

3. **Configure `application.properties`**
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/taskManager
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

4. **Run the application**
```bash
mvn spring-boot:run
```

5. **Test the API**

Open your browser or Postman and go to:
```
http://localhost:8080/tasks
```

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/example/TaskManager/
│   │   ├── TaskManagerApplication.java   ← Entry point
│   │   ├── Task.java                     ← Entity
│   │   ├── TaskRepository.java           ← Data access layer
│   │   ├── TaskService.java              ← Business logic
│   │   ├── TaskController.java           ← REST endpoints
│   │   └── GlobalExceptionHandler.java   ← Error handling
│   └── resources/
│       └── application.properties        ← Configuration
```

## 🧠 What I Learned

- Building REST APIs with Spring Boot
- Database integration with Spring Data JPA and PostgreSQL
- Layered architecture (Controller → Service → Repository)
- Global exception handling
- Testing APIs with Postman

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

