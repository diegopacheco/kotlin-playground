#!/bin/bash

echo "========================================"
echo "Kotlin Multiplatform Calculator Builder"
echo "========================================"

echo
echo "Building all platforms..."
echo

./gradlew clean build

if [ $? -ne 0 ]; then
    echo "Build failed!"
    exit 1
fi

echo
echo "========================================"
echo "Build Artifacts Locations:"
echo "========================================"

echo
echo "JVM:"
echo "  JAR: build/libs/kotlin-2x-kmp-calc-jvm.jar"
echo "  Classes: build/classes/kotlin/jvm/main/"

echo
echo "JavaScript:"
echo "  JS Files: build/js/packages/kotlin-2x-kmp-calc/kotlin/"
echo "  Node.js: build/distributions/kotlin-2x-kmp-calc-js.tar"

echo
echo "macOS x64:"
echo "  Executable: build/bin/macosX64/releaseExecutable/kotlin-2x-kmp-calc.kexe"
echo "  Libraries: build/libs/macosX64/"

echo
echo "macOS ARM64:"
echo "  Executable: build/bin/macosArm64/releaseExecutable/kotlin-2x-kmp-calc.kexe"
echo "  Libraries: build/libs/macosArm64/"

echo
echo "Linux x64:"
echo "  Executable: build/bin/linuxX64/releaseExecutable/kotlin-2x-kmp-calc.kexe"
echo "  Libraries: build/libs/linuxX64/"

echo
echo "Linux ARM64:"
echo "  Executable: build/bin/linuxArm64/releaseExecutable/kotlin-2x-kmp-calc.kexe"
echo "  Libraries: build/libs/linuxArm64/"

echo
echo "iOS x64:"
echo "  Framework: build/cocoapods/framework/Calculator.framework"
echo "  Static Library: build/libs/iosX64/"

echo
echo "iOS ARM64:"
echo "  Framework: build/cocoapods/framework/Calculator.framework"
echo "  Static Library: build/libs/iosArm64/"

echo
echo "iOS Simulator ARM64:"
echo "  Framework: build/cocoapods/framework/Calculator.framework"
echo "  Static Library: build/libs/iosSimulatorArm64/"

echo
echo "========================================"
echo "Verifying build artifacts..."
echo "========================================"

check_file() {
    if [ -f "$1" ] || [ -d "$1" ]; then
        echo "✓ $1"
    else
        echo "✗ $1 (not found)"
    fi
}

echo
echo "JVM artifacts:"
check_file "build/libs/kotlin-2x-kmp-calc-jvm.jar"

echo
echo "JavaScript artifacts:"
check_file "build/js"

echo
echo "Native artifacts:"
check_file "build/bin"

echo
echo "========================================"
echo "Running JVM version for demo:"
echo "========================================"

if [ -f "build/libs/kotlin-2x-kmp-calc-jvm.jar" ]; then
    java -cp build/libs/kotlin-2x-kmp-calc-jvm.jar MainKt
else
    echo "JVM JAR not found, skipping demo"
fi

echo
echo "Build completed successfully!"
echo "All platform targets are available in the build/ directory"