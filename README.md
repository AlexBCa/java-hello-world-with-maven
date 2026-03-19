# Java Hello World with Maven

This project is a simple Java application built with Maven. It demonstrates:

- a minimal Java application structure
- dependency management with Maven
- building an executable JAR with the Maven Shade Plugin
- unit and integration testing with JUnit 5

---

## Requirements

- JDK 8 or later
- Maven 3.6+

### Install Maven.
+ [Install Maven on Windows](https://www.baeldung.com/install-maven-on-windows-linux-mac#installing-maven-on-windows)
+ [Install Maven on Linux](https://www.baeldung.com/install-maven-on-windows-linux-mac#installing-maven-on-linux)
+ [Install Maven on Mac OSX](https://www.baeldung.com/install-maven-on-windows-linux-mac#installing-maven-on-mac-os-x)

---

## Project Structure

```text
src/
├─ main/
│  └─ java/
│     └─ hello/
│        ├─ Greeter.java
│        └─ HelloWorld.java
├─ test/
│  └─ java/
│     └─ hello/
│        └─ GreeterTest.java
└─ integration-test/
   └─ java/
      └─ hello/
         └─ HelloWorldIT.java
```

- Unit tests live in `src/test/java` and are named `*Test`
- Integration tests live in `src/integration-test/java` and are named `*IT`

---

## Source Code Overview

### Greeter.java

```java
package hello;

public class Greeter {
    public String sayHello() {
        return "DevOps Project for AchiStar Technologies";
    }
}
```

### HelloWorld.java

```java
package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
```

---

## Maven Build Configuration

### Key Dependencies

- `joda-time` for date/time handling
- `JUnit Jupiter` for testing

### Plugins Used

- `maven-compiler-plugin` → compiles Java code (Java 8)
- `maven-surefire-plugin` → runs unit tests (`*Test`)
- `maven-failsafe-plugin` → runs integration tests (`*IT`)
- `build-helper-maven-plugin` → adds `src/integration-test/java` as test source
- `maven-shade-plugin` → creates executable fat JAR

---

## Build the Project

Install into local Maven repository:

```bash
mvn install
```

Compile the project:

```bash
mvn compile
```

Package the application:

```bash
mvn package
```

---

## Run Tests

Run unit tests only:

```bash
mvn test
```

Run unit + integration tests:

```bash
mvn verify
```

Explanation:

- `mvn test` executes `*Test` via Surefire
- `mvn verify` executes `*IT` via Failsafe

---

## Run the Application

After packaging:

```bash
java -cp target/jb-hello-world-maven-0.2.0.jar hello.HelloWorld
```

Expected output:

```text
The current local time is: <current time>
DevOps Project for AchiStar Technologies
```

---

## Notes

- The project is intentionally simple and designed as a learning example.
- The testing setup (unit vs integration) is scalable and can be reused in larger projects.
- Integration tests execute the real application entry point and validate console output.