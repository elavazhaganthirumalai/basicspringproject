pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/username/repo.git'
            }
        }

        stage('Build') {
            steps {
                sh './build.mvn clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                sh './deploy.java -jar .\elademo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
