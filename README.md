run `make` to run

```
example-java % make
javac -d target -classpath . src/com/semgrep/*.java
java -classpath target com/semgrep/Foo
Foo value: 42
Var value: 43
Bar function(): 100
```
