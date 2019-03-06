package br.com.guikar.netbeans.ufc.poo.hora;

import java.util.Scanner;

public class CifraTeste {
    public static void main(String[] args) {
        CifraDecifra cifra=new CifraDecifra();
        Scanner s=new Scanner(System.in);
        System.out.print("Digite a Mensagem:");
        cifra.setMensagem(s.nextLine().toLowerCase());
        System.out.print("Digite a Chave:");
        cifra.setChave(s.nextLine().toLowerCase().charAt(0));
        System.out.print("Deseja 1-criptografar ou 2-descriptografar:");
        cifra.setTipo(s.nextInt());
        s.nextLine();
        System.out.print("Deseja deixar os espaços 1-sim ou 2-não:");
        cifra.setEspaco(s.nextInt());
        char rMsg[] = cifra.criptografaDescriptografa();
        System.out.print("Mensagem Criptografada: ");
        for (char aRMsg : rMsg) {
            System.out.print(aRMsg);
        }
        System.out.println();
    }
}