@Library('PipelineLibs') _

pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                build(
                    branch: 'feature/test',
                    dockerImage: 'maven:3.8'
                )
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
