#Thabo Kopane
#Makefile for CSC2001f-1(AKA Assignment 1).

JAVAC=/usr/bin/javac
JFLAGS= -g
JCLASSDIR = bin/
SRC = src/
JUNITPATH = .:../junit/junit-4.12.jar:/junit/hamcrest-core-1.3.jar
DOCDIR = docs/
TESTDIR = test/
.SUFFIXES: .java .class
.java.class:
	$(JAVAC) -cp .:./bin -d $(JCLASSDIR)/. $(JFLAGS) $*.java
	
CLASSES = $(SRC)BinaryTreeNode.java\
					$(SRC)humanBeing.java src/BTQueueNode.java\
					$(SRC)BTQueue.java\
					$(SRC)BinaryTree.java\
					$(SRC)BinarySearchTree.java\
					$(SRC)printIt.java\
					$(SRC)searchItLinear.java\
					$(SRC)searchIt.java

TESTS = test/humanBeingTest.java

default: classes

classes: $(CLASSES:.java=.class)

doc: 
	javadoc -d $(DOCDIR) $(SRC)/*.java $(TESTDIR)/humanBeingTest.java 

test:
	java -ea -cp .:$(TESTDIR):(JUNITPATH) org.junit.runner.JUnitCore $(TESTS)

clean:
	rm $(JCLASSDIR)*.class
	rm $(DOCDIR) -rf
