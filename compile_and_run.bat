@echo off
set "CLASSPATH=target\classes;C:\Users\nisha\.m2\repository\com\toedter\jcalendar\1.4\jcalendar-1.4.jar;C:\Users\nisha\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar"
if not exist "target\classes" mkdir "target\classes"
dir /s /b src\main\java\*.java > sources.txt
javac -cp "%CLASSPATH%" -source 17 -target 17 -d target\classes @sources.txt
if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed.
    exit /b %ERRORLEVEL%
)
echo Compilation successful. Starting application...
java -cp %CLASSPATH% com.mycompany.airline_project.LoginFrame
