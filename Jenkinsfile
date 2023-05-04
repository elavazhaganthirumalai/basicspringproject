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
                withEnv ( ['JENKINS_NODE_COOKIE=do_not_kill'] )
                {
                bat 'start java -jar target/elademo-0.0.1-SNAPSHOT.jar&'
                }

            }
        }
    }
}
