# Actuator
 - Spring Boot Actuator is a feature that provides monitoring features for the
application during development and after deployment.
 - It provides metadata about the application like the
    1. beans configured
    2. how autoconfiguration has worked
    3. how many times a specific service is called
    4. how many times a specific service has failed
The Actuator module can be enabled while creating a Spring Boot application by adding the Actuator dependency from the Ops section. For an application that is already running, spring-boot-starter-actuator can be added to the pom.xml file as follows:
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>

## HAL Browser Dependency
The Actuator exposes a lot of REST services that are compliant with the HAL standard. We will use
a HAL browser to view the data provided by the services. For this, add the following dependency:
<dependency>
<groupId>org.springframework.data</groupId>
    <artifactId>spring-data-rest-hal-browser</artifactId>
    <version>3.3.6.RELEASE</version>
</dependency>

-- checkout pdf losh