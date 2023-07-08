#!/bin/sh

found=$(type -p java)
if [[ "$found" ]]; then
    _java=java
elif [[ -n "$JAVA_HOME" ]] && [[ -x "$JAVA_HOME/bin/java" ]]; then
    _java="$JAVA_HOME/bin/java"
else
    echo "Java not found, Please install Java 11 or higher version first."
    exit;
fi

if [[ "$_java" ]]; then
    version=$(java -version 2>&1 | sed -n ';s/.* version "\(.*\)\.\(.*\)\..*".*/\1\2/p;')
    if [[ "$version" < "110" ]]; then
        echo "Application not started as java version '$version' not meet requirement. Required Java version is 11."
	exit;
    fi
fi

DIRNAME=`dirname $0`
CP=$DIRNAME/files-extractor-app.jar

java -Dswing.defaultlaf=com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme -cp %CP% com.yog.filesextractor.Main &
