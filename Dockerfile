FROM eclipse-temurin:11
EXPOSE 8282
WORKDIR /opt/app
COPY /target/parking-adapter-jenkins.jar /home/parking-adapter-jenkins.jar
CMD ["java","-jar","/home/parking-adapter-jenkins.jar"]
