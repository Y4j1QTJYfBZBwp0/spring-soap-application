# SOAP Web Service with Spring - Studies.

## Description

This is the repository containing my study project related to building a SOAP Web Service with Spring.

To implement the SOAP Web Service with Spring, I used the following tutorials and articles:

* [Creating a SOAP Web Service with Spring](https://www.baeldung.com/spring-boot-soap-web-service)
* [Producing a SOAP web service](https://github.com/Y4j1QTJYfBZBwp0/spring-soap-application)
* [Spring Boot SOAP Web Service Example](https://www.concretepage.com/spring-boot/spring-boot-soap-web-service-example#CrudRepository)
* [Developing SOAP Web Services with Spring Boot: A Comprehensive Guide](https://medium.com/@extio/developing-soap-web-services-with-spring-boot-a-comprehensive-guide-1d4f89bc3127)

## Tech Stack

* IntelliJ IDEA
* GitHub Copilot
* GitHub Copilot Labs
* Spring Boot + Java 17
* Postgres
* Docker

## Installation

```bash
$ mvn install
```

# To generate the entities based on WSDL

```bash
$ mvn jaxb2:xjc
```

## Running the app

```bash
# development
$ mvn spring-boot:run
```