FROM eclipse-temurin:11
COPY /target/parking-adapter-jenkins-0.0.1-SNAPSHOT.jar /home/parking-adapter-jenkins-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/parking-adapter-jenkins-0.0.1-SNAPSHOT.jar"]