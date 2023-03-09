pipeline {
    agent any
    tools {
        maven 'mvn_3_9_0'
    }
    stages {
        stage('Build Maven'){
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Alikoq/parking-adapter-jenkins']]])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker image') {
            steps {
                script {
                    sh 'docker build -t aliguliyev75/parking-adapter-jenkins .'
                }
            }
        }
        stage('Docker image push') {
            agent any
            steps {
                 withCredentials ([usernamePassword(credentialsId: 'dockerhub', passwordVariable 'DOCKER_REG_PWD', usernameVariable 'DOCKER_REG_USR')]) {
                      sh "docker login -u ${$DOCKER_REG_USR} -p ${$DOCKER_REG_PWD}"
                      sh 'docker push aliguliyev75/parking-adapter-jenkins'
                 }
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Deliver') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}