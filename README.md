# Copilot Instructions for AI Coding Agents

## Project Overview
This is a Java Spring Boot application for a simple ToDo list system. The codebase is organized by domain (task, user, filter) under `src/main/java/br/com/lucasdev/todolist/`. The main entry point is `TodolistApplication.java`.

## Architecture & Data Flow
- **User and Task Domains:**
  - `user/` and `task/` directories contain models (`UserModel`, `TaskModel`), controllers (`UserController`, `TaskController`), and repository interfaces (`IUserRepository`, `ITaskRepository`).
  - Data access uses Spring Data JPA repositories.
- **Authentication:**
  - Custom authentication filter in `filter/FilterTaskAuth.java` checks HTTP Basic Auth for `/tasks/` endpoints, using BCrypt for password verification.
- **Component Registration:**
  - Classes are annotated with `@Component` or `@Autowired` for dependency injection.

## Developer Workflows
- **Build:** Use `./mvnw clean package` to build. The wrapper ensures consistent Maven usage.
- **Run:** Use `./mvnw spring-boot:run` to start the application.
- **Test:** Run tests with `./mvnw test`. Main test class: `TodolistApplicationTests.java`.
- **Configuration:** Main config file is `src/main/resources/application.properties`.

## Project-Specific Patterns
- **Endpoints:**
  - REST endpoints are defined in controllers. Example: `/tasks/` in `TaskController.java`.
- **Authentication:**
  - All `/tasks/` requests require Basic Auth, handled by `FilterTaskAuth`.
- **Password Handling:**
  - Passwords are hashed and verified using `at.favre.lib.crypto.bcrypt.BCrypt`.
- **Error Handling:**
  - Authentication failures return HTTP 401 via `response.sendError(401)`.

## External Dependencies
- **Spring Boot** for web, DI, and data access.
- **BCrypt** for password security.
- **Jakarta Servlet API** for filter and request/response handling.

## Conventions & Examples
- **Repository Naming:** Interfaces prefixed with `I` (e.g., `IUserRepository`).
- **Component Scanning:** All main classes are under `br.com.lucasdev.todolist` for package-based scanning.
- **Attribute Passing:** Authenticated user ID is set on request as `idUser`.

## Key Files
- `src/main/java/br/com/lucasdev/todolist/TodolistApplication.java` (main class)
- `src/main/java/br/com/lucasdev/todolist/filter/FilterTaskAuth.java` (auth filter)
- `src/main/java/br/com/lucasdev/todolist/task/TaskController.java` (task endpoints)
- `src/main/java/br/com/lucasdev/todolist/user/UserController.java` (user endpoints)
- `src/main/resources/application.properties` (config)

---

If any section is unclear or missing important details, please specify so it can be improved.
