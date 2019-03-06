package br.com.guikar.eclusa.exceptions;

public class VazioException extends Exception{

    public VazioException(String message) {
        super(message+" não pode ser Vazio!");
    }
    
}
