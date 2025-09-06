def call(String outputFolder) {
    echo '🔍 Checking for output folder....'
    if (!fileExists("${outputFolder}")) {
        error("❌ Output folder '${outputFolder}' not found. Failing the build.")
    }
    echo "✅ Output folder '${outputFolder}' found successfully."
}
