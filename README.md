# SuperGlobal Store

My first spring boot project.

Things I've learned:

1. How to configure VSCode for SpringBoot development
2. Spring Boot Initializr
3. The Maven Standard Directory Layout
4. How to compile and run a project
    - mvnw spring-boot:run -> Compiles and runs your app
    - mvnw clean spring-boot:run -> Cleans target folder, compiles, and runs your app
    - mvnw package ->  Builds and packages the compiled classes into a JAR file
5. Spring Boot Starters
6. Spring Boot Anotations Commonly Used In MVC Projects
    - @Controller: Instruments the target to serve web requests.
    - @GetMapping("path"): Maps a GET request to a handler method
    - @RequestParam: Parameter to be received from a GET request
    - @PostMapping("path"): Maps a POST request to a handler method
7. Thymeleaf Expressions
    - Variable expression: ${...}
    - Selection expression: *{field}
    - Link expression: @{/path}
8. Thymeleaf Attributes
    - Conditionals: th:if/th:unless
    - Loops: th:each
    - Binding: th:field
    - Others
9. Spring Boot Flash Attributes (Post-Redirect-Get Pattern)
10. Debugging (VSCode Breakpoints)
11. Deploying an Spring Boot App Via Heroku

App URL in About section. 
