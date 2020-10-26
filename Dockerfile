FROM openjdk:11
ARG JAR_FILE
COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java", "-jar","build/libs/architecture-0.0.1-SNAPSHOT.jar"]
