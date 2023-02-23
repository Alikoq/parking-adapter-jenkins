FROM eclipse-temurin:11
COPY target/parking-adapter-jenkins-0.0.1-SNAPSHOT.jar /parking-adapter-jenkins-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/parking-adapter-jenkins-0.0.1-SNAPSHOT.jar"]