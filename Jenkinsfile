pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git url: 'https://github.com/elavazhaganthirumalai/basicspringproject.git'
            }
        }

        stage('Checkout') {
            steps {
                sh 'cd repo && git checkout main'
            }
        }

        stage('Build') {
            steps {
                sh 'cd repo && mvn clean install'
            }
        }

        stage('Run') {
            steps {
                sh 'java -jar repo/target/elademo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
