FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/taskmanager-0.0.1-SNAPSHOT.jar /app/task-manager-backend.jar
EXPOSE 8080
CMD ["java","-jar","task-manager-backend.jar"]