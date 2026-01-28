pipeline {
    agent any

    tools {
        maven 'Maven-3.9.6'
        jdk 'JDK-17'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                dir("${WORKSPACE}") {
                    bat 'mvn clean test'
                }
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            echo 'CI-CD Pipeline execution completed'
        }
    }
}
