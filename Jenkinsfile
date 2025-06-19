@Library('PipelineLibs') _

pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                build()
            }
        }
        
        stage('Deploy') {
            steps {
                deploy(
                    appName: 'my-app',
                    environment: 'staging'
                )
            }
        }
    }
}
