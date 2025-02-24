pipeline {
    agent any

    stages {
        stage('GIT') {
            steps {
                echo 'Cloning repository...'
                git 'https://github.com/manel-00/timesheet-project.git'  // Replace with your actual repo URL
            }
        }

        stage('COMPILATION') {
            steps {
                echo 'Running mvn clean install...'
                sh 'mvn clean install'  // Runs Maven build
            }
        }

        stage('DEPLOIEMENT') {
            steps {
                echo 'Deploying to Nexus...'
                sh 'mvn deploy'  // Deploys to Nexus (ensure POM.xml is configured correctly)
            }
        }
    }

    post {
        success {
            echo 'Pipeline successfully completed.'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
