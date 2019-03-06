package br.com.guikar.eclusa.exceptions;

public class MenorQueZeroException extends Exception {

    public MenorQueZeroException(String message) {
        super(message+" deve ser maior que Zero!");
    }
    
}
