#!/usr/bin
echo 'auto debug'

adb clean

adb uninstall com.learn.cordvoa

ant debug

adb install -r bin/cordova-debug.apk

adb shell am start -n com.learn.cordvoa/com.learn.cordvoa.MainActivity

echo 'activtiy running'
