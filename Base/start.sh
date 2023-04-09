./gradlew clean
host_pkg=com.android.base
adb uninstall $host_pkg
./gradlew :app:assembleDebug
adb install ./app/build/outputs/apk/debug/app-debug.apk
adb shell am start -n $host_pkg/.MainActivity 
