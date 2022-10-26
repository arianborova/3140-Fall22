#!/usr/bin/bash.exe


Compile() {
     javac DateProgram.java 
}

Run() {
     Compile
     java DateProgram.java < InputFile.txt
}

Run
