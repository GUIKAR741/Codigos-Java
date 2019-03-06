package br.com.guikar.ufc.ed;

import br.com.guikar.ufc.ed.tadsDinamicas.Pilha;

import java.util.Scanner;

public class P4 {
    public boolean verificaResultado(String entrada) {
        switch (entrada) {
            case "+":
                return true;
            case "-":
                return true;
            case "*":
                return true;
            case "/":
                return true;
        }
        return false;
    }

    public String operacao(Pilha<String> p, String op) {
        int num1 = Integer.parseInt(p.desempilhar());
        int num2 = Integer.parseInt(p.desempilhar());
        int res = 0;
        switch (op){
            case "+":
                res= num2 + num1;
                break;
            case "-":
                res= num2 - num1;
                break;
            case "*":
                res= num2 * num1;
                break;
            case "/":
                res= num2 / num1;
                break;
        }
        return Integer.toString(res);
    }

    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>();
        Scanner s = new Scanner(System.in);
        P4 p4 = new P4();
        String caractere;
        do {
            System.out.print("Digite um caractere:(Para terminar digite =)");
            caractere = s.nextLine();
            if (!caractere.equals("="))
                if(p4.verificaResultado(caractere)) {
                    pilha.empilhar(p4.operacao(pilha,caractere));
                }else
                    pilha.empilhar(caractere);
        } while (!caractere.equals("="));
        System.out.println("Resultado:" + pilha.desempilhar());
    }
}
