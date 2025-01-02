#pull a base image which gives all the required tools and libraries
FROM openjdk:17-jdk-alpine

# create a folder where the app code will be stored.
WORKDIR /app

# Copy the source code from the host machine to the container
COPY src/Main.java /app/Main.java

# Compile the application code
RUN javac Main.java

# Run the application
CMD ["java","Main"]
