# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:17-jdk-alpine

# Add a volume for temporary files (optional)
VOLUME /tmp

# Copy the JAR file into the container
COPY target/financeme-service-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
