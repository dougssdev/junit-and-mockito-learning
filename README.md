# Learning JUnit 5 and Mockito

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge)
![JUnit](https://img.shields.io/badge/junit-%25CF252.svg?style=for-the-badge)


This repository was created to practice and document my learning journey in unit testing with Java, using JUnit 5 and Mockito.


---

## Technologies and Tools

- Java 17  
- Maven  
- JUnit 5  
- Mockito  
- IntelliJ IDEA (or Eclipse)

---

## What I'm Practicing Here

### Basic JUnit 5 Testing Structure

- Using annotations like `@Test`, `@BeforeEach`, `@AfterEach`  
- Naming test methods clearly and descriptively  
- Parameterized tests with `@ParameterizedTest`  
- Grouping tests with `@Nested`

### Using Mockito for Mocks

- Creating mocks with `@Mock` and `Mockito.mock()`  
- Injecting dependencies with `@InjectMocks`  
- Verifying interactions with `verify()`  
- Simulating behavior with `when(...).thenReturn(...)`

### Test-Driven Development (TDD)

- Writing tests before implementation (Red → Green → Refactor)  
- Refactoring with confidence thanks to test coverage

---

## Project Structure

```
.
├── pom.xml                  # Maven config with dependencies
└── src
    ├── main/java            # Application code
    └── test/java            # JUnit + Mockito test files
```

---

## How to Run the Tests

1. Clone the repository:

```bash
git clone https://github.com/dougssdev/junit-and-mockito-learning.git
cd junit-and-mockito-learning
```

2. Run the tests using Maven:

```bash
mvn test
```

---

## Real Examples I’m Working On

- Simple unit tests using `assertEquals`, `assertThrows`, etc.  
- Mocking services and verifying method calls using `verify()`  
- Testing by layers (e.g. services, repositories)  
- Covering both positive and negative scenarios  

I’m gradually adding more examples with business logic and validations.

---

## Contributions

This is a personal learning repository, but suggestions are always welcome.  
Feel free to open an issue or submit a pull request with improvements, examples, or feedback.

---

## Resources I’m Using

- [JUnit 5 Official Docs](https://junit.org/junit5/docs/current/user-guide/)  
- [Mockito Official Site](https://site.mockito.org/)  
- [Baeldung – Testing with JUnit & Mockito](https://www.baeldung.com/)  
- [DIO – Testing in Java with JUnit and Mockito](https://web.dio.me)  
- Articles and videos from YouTube, Medium, and others

---

## A Work in Progress

This repository is continuously evolving as I progress in my testing studies.  
Soon I plan to include Spring Boot testing, integration testing, and more advanced real-world scenarios.
