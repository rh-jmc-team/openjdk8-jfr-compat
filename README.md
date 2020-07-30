# openjdk8-jfr-compat
A JFR compatibility API for OpenJDK 8. The resulting jar, jfr-compat-1.0-SNAPSHOT.jar, allows applications with dependencies on the jdk.jfr package to compile in OpenJDK 8. The jar does not provide Flight Recorder support - it is composed of JFR OpenJDK 11 classes with empty implementations.
## Build

```sh
mvn package
```
## Usage
Build your java application with the compatibility jar added to the applciation's classpath
```sh
javac -cp jfr-compat-1.0-SNAPSHOT.jar MyApp.java
```
Run your java application with the compatibility jar added to the application's classpath
```sh
java -cp jfr-compat-1.0-SNAPSHOT.jar:. MyApp
```
