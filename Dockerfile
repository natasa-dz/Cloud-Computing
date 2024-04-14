# Use an appropriate base image for your application (e.g., OpenJDK for Java applications)
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/spring-db-0.1.jar app.jar

# Define environment variables for connection parameters
#ENV DATABASE_URL="your-database-url"
#ENV DATABASE_USER="your-database-user"
#ENV DATABASE_PASSWORD="your-database-password"

# Command to run the application
CMD ["java", "-jar", "app.jar"]
