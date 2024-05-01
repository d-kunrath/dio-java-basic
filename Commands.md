# CLI Commands

## Java Docs
Used *before* the described class/var/method
```java
/**
 * description
 * @author author
 * @version 1.0
 * @since 01/01/2024
 * @param p
 * @return r
 * @throws exception
 */
```
Command to create a Java Doc

```sh
javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
```

## Executable
```sh
java bin/MyClass arg1 arg2 #...
```