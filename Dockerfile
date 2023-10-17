FROM openjdk:11
EXPOSE 8090
ADD target/spring-boot-hello-world-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
