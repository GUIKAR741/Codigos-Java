package br.com.guikar.eclusa.exceptions;

public class NecessarioUmContainerException extends Exception{

    public NecessarioUmContainerException() {
        super("Necessario pelo menos um Container");
    }
    
}
