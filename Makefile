run: build
	java -classpath target com/semgrep/Foo

build:
	javac -d target -classpath . src/com/semgrep/*.java

clean:
	rm -rf target
