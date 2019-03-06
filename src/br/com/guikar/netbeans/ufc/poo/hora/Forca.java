package br.com.guikar.netbeans.ufc.poo.hora;

import java.util.Random;
import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        String palavras[]={"carro","cachorro","russas ","chuva","copo","xicara","luz","monitor","gato","anel"},
                dica[]={"automovel","animal","buraco","agua","vidro","cafe","lampada","video","mia","dedo"},
                palavra;
        Random aleatorio=new Random();
        Scanner s=new Scanner(System.in);
        int numeroPalavraSorteada=aleatorio.nextInt(palavras.length),erro=0,acerto=0;
        palavra=palavras[numeroPalavraSorteada];
        char palavraSorteada[]=new char[palavra.length()], letra;
        for (int i = 0; i < palavra.length(); i++)
            palavraSorteada[i] = '_';
        do {
            System.out.println("-----------------------");
            if(acerto==palavra.length()) {
                System.out.println("Parabéns você Ganhou");
                break;
            }
            System.out.print("Palavra: ");
            for (int i = 0; i < palavra.length(); i++) {
                System.out.print(palavraSorteada[i] + " ");
            }
            System.out.println();
            System.out.println("Dica:" + dica[numeroPalavraSorteada]);
            System.out.println("Erros:"+erro);
            System.out.print("Digite uma Letra:");
            letra=s.nextLine().charAt(0);
            int contaLetra=0;
            System.out.println(letra);
            for (int i = 0; i < palavra.length(); i++) {
                if(palavra.charAt(i)==letra){
                    palavraSorteada[i]=letra;
                    acerto++;
                }else{
                    contaLetra++;
                }
            }
            if(contaLetra==palavra.length()){
                erro++;
            }
        }while (erro<6);
        if(erro==6) {
            System.out.println("-----------------------");
            System.out.println("Você Perdeu!");
        }
    }
}
