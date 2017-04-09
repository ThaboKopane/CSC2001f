#Thabo Kopane
#Makefile for CSC2001f-1(AKA Assignment 1).

JAVAC=/usr/bin/javac
JFLAGS= -g
JCLASSDIR = bin/
SRC = src/
JUNITPATH = .:../junit/junit-4.12.jar
HAMCREST = .:../junit/hamcrest-core-1.3.jar

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
					$(SRC)searchIt.java\

TESTS = $(SRC)humanBeingTest.java\

default: classes

classes: $(CLASSES:.java=.class)

test = java -cp .:$(JUNITPATH) org.junit.runner.JUnitCore $(TESTS)

clean:
	rm $(JCLASSDIR)*.class
