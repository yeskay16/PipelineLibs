def call(String runScript, String outputFolder) {
    if (fileExists("${outputFolder}")) {
        echo '🚀 Deploying the app...'
        sh "${runScript}"
        sh "sleep 25"
    } else {
        echo "⚠️ Skipping deployment - output folder '${outputFolder}' not found."
    }
}
