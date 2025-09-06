def call(String deployUrl) {
    echo '🌐 Validating deployment on localhost:8080...'
    def response = sh(script: "curl -s -o /dev/null -w '%{http_code}' ${deployUrl}", returnStdout: true).trim()
    if (response != '200') {
        error("❌ Deployment validation failed. Expected HTTP 200, got ${response}")
    } else {
        echo "✅ Deployment is up and running on ${deployUrl}"
    }
}
