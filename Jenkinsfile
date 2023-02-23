pipeline {
    agent {
        docker {
            image 'maven:3.9.0-eclipse-temurin-11'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
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
        stage('Docker Build') {
            steps {
                sh 'docker build -t aliguliyev75/parking-adapter-jenkins:latest .'
            }
        }
        stage('Deliver') {
              agent any
            steps {
                sh 'mvn --version'
            }
        }
    }
}