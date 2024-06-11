run: build
	java -classpath . com/semgrep/Foo

build:
	javac -d target -classpath . com/semgrep/*.java

clean:
	rm -rf target
