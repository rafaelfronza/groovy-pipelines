#! groovy

pipeline {
    agent any

    stages {
        stage ("First Stage - Cloning Directory") {
            steps {
                script {
                    git url: https://github.com/rafaelfronza/groovy-pipelines.git
                        credentialsId: ''
                        branch: 'feature/session-6-pipelines'
                    
                    sh "ls -lrt"
                }
            }
        }

        stage ("Second Stage - Find the folder and the Script") {
            steps {
                script {
                    dir ("scripts") {
                        sh "ls -lrt"
                    }
                }
            }
        }

        stage ("Third Stage - Execute Script") {
            steps {
                script {
                    dir ("scripts") {
                        sh "./script_to_execute.sh"
                    }
                }
            }
        }
    }
}