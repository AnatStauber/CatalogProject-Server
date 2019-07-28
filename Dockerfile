FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
COPY target/*.jar catalog-project.jar
ENTRYPOINT ["java","-jar","/catalog-project.jar"]