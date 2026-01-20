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

        stage('Allure Report') {
            steps {
                // Generate Allure report from test results
                allure([
                    reportBuildPolicy: 'ALWAYS',
                    results: [[path: 'target/allure-results']]
                ])
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            echo 'Complete CI-CD Pipeline execution completed'
        }
    }
}
