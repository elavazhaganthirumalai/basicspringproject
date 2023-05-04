pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/elavazhaganthirumalai/basicspringproject'
            }
        }
    stage('Clone') {
            steps {
                git url: 'https://github.com/elavazhaganthirumalai/basicspringproject.git'
            }
        }
        stage('Build') {
            steps {
                sh './build.mvn clean install'
            }
        }

        stage('Deploy') {
            steps {
                sh './deploy.java -jar basicspringproject-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
