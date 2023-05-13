FROM openjdk:17-jdk-alpine
COPY . .
RUN mvn clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/ngclone-0.0.1-SNAPSHOT.jar"]