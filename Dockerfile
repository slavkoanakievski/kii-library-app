FROM openjdk:11
EXPOSE 8080
ADD target/docker-web-app.jar docker-web-app.jar
ENTRYPOINT ["java", "-jar", "/docker-web-app.jar"]