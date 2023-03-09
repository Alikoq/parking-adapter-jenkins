FROM eclipse-temurin:11
EXPOSE 8282
WORKDIR /opt/app
COPY target/parking-adapter-jenkins.jar parking-adapter-jenkins.jar
CMD ["java","-jar","/parking-adapter-jenkins.jar"]
