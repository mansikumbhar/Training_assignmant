#Base image 
FROM openjdk:8
#make port available outside the container
EXPOSE 8080 
#add jar of the springboot app docker
ADD target/spring-boot-docker.jar spring-boot-docker.jar
#here specify the command to run the jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]