pipeline {
    agent any
    stages {
        stage('Mvn install') {
            agent {
            docker {
                image 'maven:3.9.0-eclipse-temurin-11'
                args '-v /root/.m2:/root/.m2'
              }
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always{
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
