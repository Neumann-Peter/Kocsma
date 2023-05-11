FROM openjdk:8
EXPOSE 8080
ADD target/kocsma-projekt-docker.jar kocsma-projekt-docker.jar
ENTRYPOINT ["java", "-jar", "kocsma-projekt-docker.jar"]