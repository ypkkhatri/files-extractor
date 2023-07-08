set DIRNAME=%~dp0
set CP="%DIRNAME%files-extractor-app.jar"

rem start /B javaw -Dswing.defaultlaf=com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme -cp %CP% com.yog.filesextractor.Main
java -Dswing.defaultlaf=com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme -cp %CP% com.yog.filesextractor.Main
