# Minimal setup for Android projects in Kotlin on VSCode

## Dependencies (all can be portable)

- Gradle 7.4
- Android SDK 30
- JDK 11
- JDK 17 (to run sdkmanager)

## Install dependencies

### Install Gradle

- Create this variable in your environment

```
GRADLE_HOME C:\...\Portable\gradle\gradle-7.4
```

- Add the `gradle/bin` directory to your PATH
```
%GRADLE_HOME%\bin
```


### Install Command Line Tools

- Create this variable in your environment

```
ANDROID_HOME C:\...\Portable\android_sdk
```

- Add the `cmdline-tools\latest\bin` directory to your PATH
```
%ANDROID_HOME%\cmdline-tools\latest\bin
```

- Install build and platform tools (maybe you need set JDK 17 to run sdkmanager)
```
sdkmanager "platform-tools" "platforms;android-30" "build-tools;30.0.2"
```

- Install emulator
```
sdkmanager "emulator"
```

- Add the `emulator` directory to your PATH
```
%ANDROID_HOME%\emulator
```

## Compile and run
### To compile
```
gradlew clean build
```

## Test with emulator

### Create an emulator
```
avdmanager create avd -n "MyEmulator" -k "system-images;android-30;google_apis;x86_64" -d pixel_2
```

### Run emulator
```
emulator -avd MyEmulator
```

### Run your app in the emulator
```
gradlew assembleDebug
gradlew installDebug
```

## Alternative to create the project

### Run this in the root of your project to create the necessary files
```
gradle init --type basic
```

### Make the necessary directories
```
mkdir app\src\main\java\io\github\marcos_tulio
mkdir app\src\main\res\layout
mkdir app\src\main\res\values
```
