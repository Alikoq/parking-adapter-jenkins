FROM eclipse-temurin:11-alpine
EXPOSE 8282
WORKDIR /opt/app
COPY target/parking-adapter-jenkins.jar parking-adapter-jenkins.jar
RUN curl -sSL https://get.docker.com/ | sh
CMD ["java","-jar","/parking-adapter-jenkins.jar"]
