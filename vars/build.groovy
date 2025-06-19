// vars/build.groovy
def build(Map config = [:]) {
    // Default configuration
    def defaults = [
        branch: env.BRANCH_NAME ?: 'main',
        dockerImage: 'maven:latest'
    ]
    
    // Merge provided config with defaults
    config = defaults + config
    
    // Build implementation
    node {
        stage('Checkout') {
            git branch: config.branch,
                 url: 'git@github.com:your-org/your-repo.git'
        }
        
        stage('Build') {
            docker.image(config.dockerImage).inside() {
                sh 'mvn clean package'
            }
        }
    }
}

return this // Required for vars scripts
