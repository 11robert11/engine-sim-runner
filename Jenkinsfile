pipeline {
    agent {
        docker {
            image 'eclipse-temurin:17-jdk'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}