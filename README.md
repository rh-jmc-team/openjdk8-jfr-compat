# openjdk8-jfr-compat
Creates jfr-compat-1.0-SNAPSHOT.jar.  Adding this jar to your classpath provides support for JFR in OpenJDK 8.
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
