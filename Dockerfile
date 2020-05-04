FROM openjdk:8
EXPOSE 8080
ADD target/library-back.jar library-back.jar 
ENTRYPOINT ["java","-jar","/library-back.jar"]