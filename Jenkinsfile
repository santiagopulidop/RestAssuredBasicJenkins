pipeline {
    agent any

    tools {
        maven 'mvn'
    }
    
    stages {
        stage('Debug') {
            steps {
                script {
                    echo 'Imprimiendo PATH:'
                    sh 'echo $PATH'

                    echo 'Imprimiendo ubicación de Maven:'
                    sh 'which mvn'
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
    }
}
