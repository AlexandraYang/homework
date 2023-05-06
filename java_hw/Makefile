# Makefile for compiling Java files

# Compiler and flags
JC = javac
JFLAGS = -g

# Source files
SOURCES = $(wildcard *.java)
CLASSES = $(SOURCES:.java=.class)

# Default target
all: $(CLASSES)

# Compile Java files
%.class: %.java
	$(JC) $(JFLAGS) $<

# Clean up generated files
clean:
	rm -f *.class

