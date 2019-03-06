package br.com.guikar.netbeans.ufc.ed.l2q4;

import java.util.Scanner;

public class QuestaoPilha {
    public static void main(String[] args) {
        Pilha4 pilha=new Pilha4();
        Scanner s=new Scanner(System.in);
        String caractere;
        do{
            System.out.print("Digite um caractere:(Para terminar digite =)");
            caractere=s.nextLine();
            if(!caractere.equals("="))
                pilha.add(caractere);
        }while (!caractere.equals("="));
        System.out.println("Resultado:"+pilha.remover());
    }
}
