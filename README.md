# Lanterna Demo: GameLoop

A simple scaffolding for a terminal game or any other interactive application
implemented with [lanterna](https://github.com/mabe02/lanterna) library.

## Requirements

- JDK 17
- Maven

## Building

To create a standalone JAR execute:

```
$ mvn clean package
```

If it succeedes, maven should create a file named
`target/LanternaDemoGameLoop-${version}-jar-with-dependencies.jar`.

## Running the application

```
$ java -jar target/LanternaDemoGameLoop-${version}-jar-with-dependencies.jar
```