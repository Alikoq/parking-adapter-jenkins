pipeline {
    agent any
    tools {
        maven 'mvn_3_9_0'
    }
    stages {
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Alikoq/parking-adapter-jenkins']]])
                sh 'mvn clean install'
            }
        }

    }
}