def call(String buildScript) {
    echo '🔨 Running build script...'
    sh "${buildScript}"
}
