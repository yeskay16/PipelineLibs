def call(String runScript, String outputFolder) {
    if (fileExists("${outputFolder}")) {
        echo '🚀 Deploying the app...'
        sh "${runScript}"
    } else {
        echo "⚠️ Skipping deployment - output folder '${outputFolder}' not found."
    }
}
