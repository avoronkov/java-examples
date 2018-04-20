# Compile and build jar

```
$ ant jar
```
jar archive will be built in `build/jar/Lab.jar`.

It can be run with
```
$ java -jar build/jar/Lab.jar
```

# Run tests

```
$ ant test
...
test:
    [junit] Running HelloTest
    [junit] Testsuite: HelloTest
    [junit] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.024 sec
    [junit] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.024 sec
    [junit] 

BUILD SUCCESSFUL
Total time: 0 seconds
```
