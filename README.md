# openjdk8-jfr-compat
A JFR compatibility API for OpenJDK 8. JFR support is provided through the resulting jar, jfr-compat-1.0-SNAPSHOT.jar, that contains JFR OpenJDK 11 classes with empty implementations.
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
