./gradlew clean 
./gradlew :app:assembleDebug
host_proj=../Base
rm $host_proj/app/src/main/assets/plugins/plugin.jar
cp ./app/build/outputs/apk/debug/app-debug.apk $host_proj/app/src/main/assets/plugins/plugin.jar
cd $host_proj/
./start.sh
cd -

