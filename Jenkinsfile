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
                bat 'start java -jar target/elademo-0.0.1-SNAPSHOT.jar'   // start the server in the background
                timeout(time: 10, unit: 'SECONDS') {  // wait for 10 seconds for the server to start
                    waitForServer()
                }
            }
        }

        def waitForServer() {
            def response = sh script: "curl --write-out %{http_code} --silent --output /dev/null http://localhost:8081", returnStdout: true
            def status = response.trim()
            if (status == '200') {
                echo 'Server is up and running!'
            } else {
                error "Server did not start up in time. HTTP status code: ${status}"
            }
        }

    }
}
