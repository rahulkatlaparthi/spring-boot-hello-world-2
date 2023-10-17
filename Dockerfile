FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-hello-world-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
