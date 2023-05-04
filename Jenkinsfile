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
                sh 'cd repo/target && java -jar basicspringproject.jar &'
            }
        }
    }
}
