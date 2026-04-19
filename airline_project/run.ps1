$classpath = "target\classes;C:\Users\nisha\.m2\repository\com\toedter\jcalendar\1.4\jcalendar-1.4.jar;C:\Users\nisha\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar;C:\Users\nisha\.m2\repository\com\itextpdf\itextpdf\5.5.13.3\itextpdf-5.5.13.3.jar"
if (!(Test-Path target\classes)) { New-Item -ItemType Directory target\classes }
Get-ChildItem -Path src\main\java -Filter *.java -Recurse | Select-Object -ExpandProperty FullName | Resolve-Path -Relative | Out-File -Encoding ascii sources.txt
javac -cp $classpath -source 17 -target 17 -d target\classes "@sources.txt"
if ($LASTEXITCODE -eq 0) {
    Write-Host "Compilation successful. Starting application..."
    java -cp $classpath com.mycompany.airline_project.LoginFrame
} else {
    Write-Host "Compilation failed."
    exit $LASTEXITCODE
}