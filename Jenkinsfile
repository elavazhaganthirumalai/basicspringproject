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
                        bat 'mvn clean install'
                    }
                }

        stage('Run') {
            steps {
                bat 'java -jar C:\ProgramData\Jenkins\.jenkins\workspace\test_job\target\elademo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
