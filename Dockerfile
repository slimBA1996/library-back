### STAGE 1: Build ###
FROM openjdk:8-alpine
ADD target/backend-ms.jar backend-ms.jar
ENTRYPOINT ["java","-jar","/backend-ms.jar"]