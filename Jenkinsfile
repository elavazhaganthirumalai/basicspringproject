pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/elavazhaganthirumalai/basicspringproject'
            }
        }

        stage('Build') {
            steps {
                sh './build.mvn clean install'
            }
        }

        stage('Deploy') {
            steps {
                sh './deploy.java -jar elademo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
