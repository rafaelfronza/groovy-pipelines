#! groovy

pipeline {
    agent any

    stages {
        stage ("Hello from SCM") {
            steps {
                script {
                    echo "Hello Jenkins from SCM"
                }
            }
        }
    }
}