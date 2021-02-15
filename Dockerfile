FROM openjdk:8-jdk-alpine
ADD target/hello-azure-0.0.1-SNAPSHOT.jar hello-azure-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh","-c","java -jar /hello-azure-0.0.1-SNAPSHOT.jar"]