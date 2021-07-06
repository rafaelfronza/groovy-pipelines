#! groovy

pipeline {
    agent any

    stages {
        stage ("First Stage - Cloning Directory") {
            steps {
                script {
                    dir ("scripts") {
                        git url: 'https://github.com/rafaelfronza/scripts.git',
                        credentialsId: 'rafaelfronza',
                        branch: 'master'
                    }
                    // dir ("scripts") {
                    //     sh "ls -lrt"
                    // }
                }
            }
        }

        stage ("Second Stage - Find the folder and the Script") {
            steps {
                script {
                    dir ("scripts") {
                        bat "ls -lrt"
                    }
                }
            }
        }

        stage ("Third Stage - Execute Script") {
            steps {
                script {
                    dir ("scripts") {
                        bat "./script_to_execute.sh"
                    }
                }
            }
        }
    }
}