package br.com.guikar.ufc.ed;

import br.com.guikar.ufc.ed.tadsDinamicas.*;
import br.com.guikar.ufc.ed.tadsDinamicas.No;

import java.util.Scanner;

public class P5 {
    public boolean isVogal(char entrada) {
        switch (entrada) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case '/':
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Pilha<Character> pilha = new Pilha<>();
        Fila<Character> fila=new Fila<Character>(){

        };
        Scanner s = new Scanner(System.in);
        P5 p5 = new P5();
        char caractere;
        do {
            System.out.print("Digite um caractere:(Para terminar digite .)");
            caractere = s.nextLine().charAt(0);
            if (caractere!='.')
                if(!p5.isVogal(caractere))
                    pilha.empilhar(caractere);
                else {
                    int tP=pilha.getTamanho();
                    while(tP>0){
                        char c=pilha.desempilhar();
                        fila.adicionar(c);
                        tP--;
                    }
                    fila.adicionar(caractere);
                    fila.imprimir(System.out::println);
                    System.out.println();
//                    System.out.println(fila.toString());
                }
        } while (caractere!='.');
        System.out.println("Resultado:" + pilha.desempilhar());
    }
}
