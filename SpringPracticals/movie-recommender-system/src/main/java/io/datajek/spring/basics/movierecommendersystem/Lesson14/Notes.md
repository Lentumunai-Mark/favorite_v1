# Spring Application Configuration
- involves using Spring core features and not Spring Boot.
# Spring Core Dependency.
- Provides the fundamental of Spring framework like Dependency Injection and Inversion of Control
- Since we created application using Spring initializr, it has spring-boot-starter dependency in pom.xml file. This dependency brings springboot functionality.
- Replace spring-boot-starter with spring-core
- To be able to use application context we add another dependency called spring-context.
- By removing the spring-boot-starter dependency, the
@SpringBootApplication annotation will no longer be available when we run the Java application. However, this annotation can be used in test scope because we still have the spring-boot-starter-test dependency in pom.xml.
# Go through the notes to learn why SpringBoot
- We remove @SpringBootApplication because we're using spring-core dependency
- Have @Configuration, @EnableAutoConfiguration, @ComponentScan

# Go through XML configuration.