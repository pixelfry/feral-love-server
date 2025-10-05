FROM openjdk:24
ARG JAR_FILE=target/*.jar
COPY ./target/ferallove-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]