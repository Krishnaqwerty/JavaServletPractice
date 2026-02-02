# Java Web & Full-Stack Learning Portfolio

![Java](https://img.shields.io/badge/Java-17-orange) ![Spring](https://img.shields.io/badge/Spring-Boot-brightgreen) ![React](https://img.shields.io/badge/React-Frontend-blue) ![MySQL](https://img.shields.io/badge/MySQL-Database-darkblue)

Keywords: Java Servlet, JSP, JPA, Hibernate ORM, JDBC, MySQL, DTO, JPARepository, CrudRepository, Swagger, MVC, CORS, REST Controller, Postman API testing, AOP, Cross-Cutting Concerns, Spring Beans, Lombok, Spring vs JSP

## Summary

This repository is a hands-on learning portfolio demonstrating practical experience with Java web technologies, Spring Boot, ORM (JPA/Hibernate), classic Java Servlet/JSP concepts, and a React frontend. The deliverables show real code, configuration, and small apps that exercise server-side routing, persistence, REST APIs, and frontend integration.

The content is organized in three main folders:

- `backend/` — Spring Boot applications, JPA/Hibernate, controllers, repositories, DTOs and sample endpoints.
- `frontend/` — React-based frontend (Create React App) with API calls, build artifacts in `frontend/build/` and source in `frontend/src/`.
- `gemini/` — an additional Java/Maven microservice-style module used for experimenting with service layering and DI.

See the repository tree in this project for exact files and locations.

## Table of contents

## Projects and file map (full repository mapping)

This section maps concepts (from the learning report) to concrete files and folders across the whole repository so employers and automated scanners can quickly find evidence of each skill.

- `backend/` (primary Spring Boot service)
  - `pom.xml`, `mvnw`, `mvnw.cmd` — Maven wrapper & build configuration (CI-friendly).
  - `src/main/java/com/bank/backend/BackendApplication.java` — Spring Boot entry point, component scanning and Boot auto-configuration.
  - `src/main/java/com/bank/backend/controller/` — `UserCredController.java`, `HomePageController.java` — shows `@RestController` and `@Controller` patterns.
  - `src/main/java/com/bank/backend/service/` — service layer classes demonstrating DI (`@Service`), business logic and AOP hooks.
  - `src/main/java/com/bank/backend/repo/` — JPA repository interfaces (`UserCredRepository`) showing `JpaRepository`/`CrudRepository` usage and derived queries.
  - `src/main/java/com/bank/backend/model/` — JPA entities (e.g. `UserCred.java`) with mappings and Lombok annotations where used.
  - `src/main/java/com/bank/backend/dto/` — DTOs (e.g. `UserCredDTO.java`) showing mapping strategies between API and persistence models.
  - `src/main/resources/application.properties` — DB configuration, Hibernate properties, CORS and Swagger properties if present.
  - `src/main/resources/templates/` — server-rendered templates (JSP/HTML) used by MVC controllers; useful for demonstrating JSP/server-rendered views.
  - `src/test/` — unit/integration test examples (if present) showing test structure and SpringBootTest usage.

- `frontend/` (React single-page app / client)
  - `package.json` & `package-lock.json` — npm project manifest and scripts (start, build, test).
  - `src/` — React source: `App.js`, `index.js`, `App.css`, `src/api/userApi.js` — demonstrates REST calls to backend, fetch/axios usage, JSON handling and client-side routing patterns.
  - `public/` — static assets and `index.html` used by CRA; demonstrates PWA/manifest files and SEO metadata.
  - `build/` — production build artifacts (already included) which can be served as static content or deployed to GitHub Pages / Netlify.
  - `.gitignore` in this folder and `.env` example — environment management for frontend builds.

- `gemini/` (separate Maven module / experimental microservice)
  - `pom.xml`, `mvnw` — module build and wrapper.
  - `src/main/java/com/mphasis/gemini/` — sample services and application class used to experiment with alternative DI patterns, service interfaces and small utilities.

- `target/` and `build/` (compiled & packaged artifacts)
  - `backend/target` and `gemini/target` — packaged JARs (`*-SNAPSHOT.jar`) and compiled classes to verify build outputs.
  - `frontend/build/` — production-ready static site files (index.html, static/js/, static/css/).

- Repository-level and developer files
  - `.gitignore` — excludes IDE metadata, `target`, `node_modules`, logs and other noise (keeps commits clean).
  - `HELP.md` under modules — project-specific guidance used while learning and iterating.
  - `logs/` — sample log files demonstrating logging output formats and rotation (useful when showing AOP/logging results).

This map is intentionally granular so an employer or an automated scanner can jump to any proof-of-skill (for example, `UserCredRepository` for JPA, `userApi.js` for REST consumption, or `build/` for deployment assets).
  - REST, Controllers, MVC and CORS
  - Swagger & API testing (Postman)
  - AOP, Cross-Cutting Concerns & Spring Beans
  - Lombok
  - Comparative study: Spring Beans vs Classic Java/JSP
- Skills & keywords for recruiters
- Next steps & contact

## Projects and file map

- backend/
  - `src/main/java/com/bank/backend/BackendApplication.java` — Spring Boot entry point.
  - `src/main/java/com/bank/backend/controller/UserCredController.java` — example REST + MVC controller.
  - `src/main/java/com/bank/backend/service/UserCredService.java` — service layer demonstrating DI and business logic.
  - `src/main/java/com/bank/backend/repo/UserCredRepository.java` — JPA repository interface.
  - `src/main/resources/templates/` — JSP/Thymeleaf-like templates used by MVC controllers.

- frontend/
  - `src/` — React source files including `App.js`, API helper `api/userApi.js` and styles.
  - `build/` — production build artifacts (already included) for quick preview.

- gemini/
  - another Spring Boot module used for experiments: `com.mphasis.gemini.GeminiApplication` and services.

Refer to these folders for concrete examples and code snippets that match the topics below.

## How to build & run (quick)

Prerequisites: Java 17+, Maven, Node.js + npm, Git.

Run backend (from repo root) — PowerShell:

```powershell
cd "C:\Users\krishna.kumar\Desktop\bankWorkspace\backend"
./mvnw clean package
./mvnw spring-boot:run
```

Run frontend (development):

```powershell
cd "C:\Users\krishna.kumar\Desktop\bankWorkspace\frontend"
npm install
npm start
```

Create production build for frontend:

```powershell
cd "C:\Users\krishna.kumar\Desktop\bankWorkspace\frontend"
npm install
npm run build
```

Access points (default):
- Backend API: http://localhost:8080/
- Frontend dev: http://localhost:3000/ (CRA default)

## Learning report — deep dive by topic

This section is written as a detailed report explaining what I learned, practiced, and implemented for each topic. Each entry includes a technical summary, what I practiced in this repo, and the artifacts to inspect.

### Java Servlet

What I learned
- Life cycle: init(), service(), doGet()/doPost(), destroy().
- Request/Response objects, session management, and request dispatching to JSP.

What I practiced
- Implemented servlet-based routing and used servlet filters for small cross-cutting needs (examples in `backend` controllers and filters).

Where to look
- `backend/src/main/java/com/bank/backend/webcontroller/` — examples showing servlet-style handling and page dispatch.

Why it's important
- Foundation for understanding how Spring MVC simplifies request handling while still relying on core servlet APIs under the hood.

---

### JSP (JavaServer Pages)

What I learned
- How JSP is used to render server-side HTML, using JSP tags, JSTL, and custom tags.

What I practiced
- Implemented server-side templates for small UIs (user list, menu). Learned templating patterns and separation of view vs controller logic.

Where to look
- `backend/target/classes/templates/*.html` (these are compiled templates or static pages included in the sample app)

---

### JDBC & MySQL

What I learned
- Connecting to relational DB using JDBC, executing SQL, PreparedStatement, connection pooling basics, transaction boundaries.

What I practiced
- Wrote raw JDBC examples and compared them to JPA-backed persistence.
- Configured `application.properties` to connect to a MySQL DB for local testing (change credentials before use).

Where to look
- `backend/src/main/resources/application.properties`

---

### JPA & Hibernate ORM

What I learned
- JPA entities, mappings (@Entity, @Table, @Id, relationships), query generation, lifecycle and caching.
- Hibernate specifics: lazy vs eager, session management.

What I practiced
- Modeled domain objects for `UserCred`, implemented repositories and used JPA methods to persist and query data.

Where to look
- `backend/src/main/java/com/bank/backend/model/UserCred.java`
- `backend/src/main/java/com/bank/backend/repo/UserCredRepository.java`

---

### DTO, JPARepository, CrudRepository

What I learned
- DTOs (Data Transfer Objects) for decoupling internal domain models from API contracts.
- JPARepository and CrudRepository provide ready-made CRUD methods, derived query methods and paging/sorting.

What I practiced
- Implemented `UserCredDTO` and mapping between DTO and entity in the service layer. Used JPARepository for common operations.

Where to look
- `backend/src/main/java/com/bank/backend/dto/UserCredDTO.java`

---

### REST Controller, Controller, MVC and CORS

What I learned
- Building REST APIs with `@RestController` and classic server-side controllers with `@Controller`.
- JSON serialization, request mapping, status codes, and enabling CORS for cross-origin frontend-backend communication.

What I practiced
- Created REST endpoints for user management, tested via Postman and fetch from frontend. Configured CORS in `WebConfig`.

Where to look
- `backend/src/main/java/com/bank/backend/controller/UserCredController.java`
- `backend/src/main/java/com/bank/backend/config/WebConfig.java`

---

### Swagger & API testing (Postman)

What I learned
- Documenting APIs using Swagger/OpenAPI. Adding annotations to controllers for automatic API docs.

What I practiced
- Integrated Swagger UI for fast interactive exploration of endpoints. Used Postman collections to validate API flows (CRUD operations).

Where to look
- Swagger configuration is present in `backend` if included; otherwise search for `springdoc` or `swagger` properties.

---

### AOP (Aspect-Oriented Programming) & Cross-Cutting Concerns

What I learned
- Using Spring AOP to implement cross-cutting concerns like logging, security checks, and transaction boundaries.

What I practiced
- Implemented example aspects for logging method entry/exit and measuring execution time in service methods.

Where to look
- `backend/src/main/java/com/bank/backend/service/` (service classes) — look for `@Aspect` classes or logging advice.

---

### Spring Beans & Dependency Injection

What I learned
- Bean lifecycle, scopes (singleton, prototype), component scanning, `@Autowired`, `@Service`, `@Repository`, `@Controller`.

What I practiced
- Built layered architecture: controllers → services → repositories. Used constructor injection and configuration classes.

Where to look
- `backend/src/main/java/com/bank/backend/service/`, `.../controller/`, `.../repo/` files.

---

### Lombok

What I learned
- Lombok annotations (`@Data`, `@Getter`, `@Setter`, `@Builder`) to reduce boilerplate for DTOs and entities.

What I practiced
- Used Lombok in DTO/entity classes to simplify getters/setters and constructors. Ensured IDE annotation processing was enabled during development.

Where to look
- DTO/entity class definitions in `backend/src/main/java/com/bank/backend/model` and `.../dto`.

---

### Comparative study: Spring Beans vs Classic Java (Servlet/JSP/JPA)

Summary
- Classic servlet/JSP apps require manual wiring, servlet lifecycle handling, and direct JDBC management. Spring Boot provides inversion-of-control, DI, declarative transaction management, unified exception handling, and a powerful data abstraction (Spring Data JPA) that reduces boilerplate.

What I practiced
- Implemented similar features both ways: direct servlet/JSP pages for UI flow and Spring MVC controllers for REST and template rendering. Compared explicit JDBC code vs JPA repositories.

Why this matters to employers
- Shows both low-level understanding (servlet/JDBC) and modern, maintainable approaches (Spring Boot + JPA) — useful for maintenance, migration and feature development.

---

## Visual: Tech stack & flow

```
[Browser/React Frontend] <--fetch/axios---> [Spring Boot REST Controllers]
                      
                           |
                           v
                     [Service Layer] (business logic)
                           |
                           v
                     [JPA Repositories / JDBC]
                           |
                           v
                         [MySQL]
```

## Practical evidence & how to explore the code

1. Browse `backend/src/main/java/com/bank/backend/` to see a full layered example (controller → service → repository).
2. Inspect `frontend/src/api/userApi.js` to see how the React app hits backend REST endpoints.
3. Run the backend (`./mvnw spring-boot:run`) and then run the frontend (`npm start`) to test end-to-end flows.

## Skills & keywords (copy-friendly for applicant tracking systems)

Java, Java Servlets, JSP, Spring Boot, Spring MVC, Spring Data JPA, Hibernate ORM, JPARepository, CrudRepository, JDBC, MySQL, REST API, CORS, Swagger/OpenAPI, Postman, AOP, Cross-Cutting Concerns, Spring Beans, Dependency Injection, Lombok, DTO, MVC, React, npm, Create React App, Webpack

## Achievements — what I can bring to your team

- Able to design and implement RESTful services with Spring Boot that integrate reliable persistence layers (JPA/Hibernate) and frontend clients.
- Practical experience converting legacy servlet/JSP patterns into Spring MVC architectures.
- Knowledge of API documentation (Swagger) and API testing (Postman) to support CI and QA.
- Understanding of AOP and separation of concerns to implement cross-cutting features like logging and security with minimal code changes.

## Next steps / suggested improvements

- Add comprehensive unit and integration tests (SpringBootTest) and example Postman collection in repository.
- Add CI (GitHub Actions) to run build/test on pushes for an employers’ pipeline look-and-feel.
- Deploy frontend to GitHub Pages or Netlify and backend to Heroku / AWS for live demos.

## Contact / License

If you'd like to discuss any part of this portfolio, run the code, or see a live demo, please reach out via the email in git commits or add contact details here.

---

Thank you for reviewing my learning portfolio — this README aims to be both human-readable and optimized for automated resume/ATS scanners. Inspect the folders listed above for concrete examples and entry points.
