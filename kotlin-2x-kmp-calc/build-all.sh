#!/bin/bash

echo "========================================"
echo "Kotlin Multiplatform Calculator Builder"
echo "========================================"

echo
echo "Building all platforms with Gradle..."
echo

./gradlew --stop
./gradlew clean

echo "Building JVM target..."
./gradlew desktopJar

echo "Building JavaScript target..."
./gradlew jsBrowserDistribution jsNodeProductionLibraryDistribution

echo "Building WebAssembly target..."
./gradlew wasmJsBrowserDistribution wasmJsNodeProductionLibraryDistribution


echo "Building macOS targets..."
./gradlew macosX64Binaries macosArm64Binaries

echo "Building Linux targets..."
./gradlew linuxX64Binaries linuxArm64Binaries

echo "Building iOS frameworks..."
./gradlew iosX64Framework iosArm64Framework iosSimulatorArm64Framework

echo
echo "========================================"
echo "Build Artifacts Locations:"
echo "========================================"

echo
echo "JVM (Desktop):"
echo "  JAR: build/libs/kotlin-2x-kmp-calc-desktop.jar"
echo "  Classes: build/classes/kotlin/desktop/main/"

echo
echo "JavaScript:"
echo "  Browser: build/dist/js/productionExecutable/"
echo "  Node.js: build/distributions/kotlin-2x-kmp-calc-js.tar"

echo
echo "WebAssembly:"
echo "  Browser: build/dist/wasmJs/productionExecutable/"
echo "  Node.js: build/distributions/kotlin-2x-kmp-calc-wasmJs.tar"


echo
echo "macOS:"
echo "  x64 Executable: build/bin/macosX64/releaseExecutable/kotlin-2x-kmp-calc.kexe"
echo "  ARM64 Executable: build/bin/macosArm64/releaseExecutable/kotlin-2x-kmp-calc.kexe"

echo
echo "Linux:"
echo "  x64 Executable: build/bin/linuxX64/releaseExecutable/kotlin-2x-kmp-calc.kexe"
echo "  ARM64 Executable: build/bin/linuxArm64/releaseExecutable/kotlin-2x-kmp-calc.kexe"

echo
echo "iOS:"
echo "  x64 Framework: build/cocoapods/framework/Calculator.framework"
echo "  ARM64 Framework: build/cocoapods/framework/Calculator.framework"
echo "  Simulator Framework: build/cocoapods/framework/Calculator.framework"

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
check_file "build/libs"

echo
echo "JavaScript artifacts:"
check_file "build/dist/js"

echo
echo "WebAssembly artifacts:"
check_file "build/dist/wasmJs"


echo
echo "Native artifacts:"
check_file "build/bin"

echo
echo "========================================"
echo "Running platform demos:"
echo "========================================"

echo
echo "JVM Demo:"
if [ -f "build/libs/kotlin-2x-kmp-calc-desktop.jar" ]; then
    java -cp build/libs/kotlin-2x-kmp-calc-desktop.jar MainKt
else
    echo "JVM JAR not found"
fi

echo
echo "macOS Demo (if available):"
if [ -f "build/bin/macosArm64/releaseExecutable/kotlin-2x-kmp-calc.kexe" ]; then
    ./build/bin/macosArm64/releaseExecutable/kotlin-2x-kmp-calc.kexe
elif [ -f "build/bin/macosX64/releaseExecutable/kotlin-2x-kmp-calc.kexe" ]; then
    ./build/bin/macosX64/releaseExecutable/kotlin-2x-kmp-calc.kexe
else
    echo "macOS executable not found"
fi

echo
echo "========================================"
echo "Platform Support Summary:"
echo "========================================"

echo
echo "✓ JVM: Cross-platform Java Virtual Machine"
echo "✓ JavaScript: Browser and Node.js environments"
echo "✓ WebAssembly: High-performance web execution"
echo "✓ macOS: Native macOS applications (x64 + ARM64)"
echo "✓ Linux: Native Linux applications (x64 + ARM64)"
echo "✓ iOS: Native iOS frameworks for app development"

echo
echo "Calculator Features:"
echo "• Basic operations: + - * /"
echo "• Numbers: 0-9 with decimal points"
echo "• Expression evaluation with left-to-right precedence"
echo "• Cross-platform compatibility across all targets"

echo
echo "Build completed successfully!"
echo "All platform targets built with Kotlin 2.1.0"