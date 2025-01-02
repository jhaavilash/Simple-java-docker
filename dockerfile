#pull a base image which gives all the required tools and libraries
FROM openjdk:17-jdk-alpine

# create a folder where the app code will be stored.
WORKDIR /app

# Copy the source code from the host machine to the container
COPY main.java /aap/main.java

# Compile the application code
RUN javac main.java

# Run the application
CMD ["java","main"]
