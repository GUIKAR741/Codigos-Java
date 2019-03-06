/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.logica_desafios_e_testes.classes;

import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class ForcaFuncionando {

    static int ind_palavra = sorteio();
    static char banco[][]
            = {{'c', 'a', 'c', 'h', 'o', 'r', 'r', 'o'},
            {'c', 'o', 'm', 'p', 'u', 't', 'a', 'd', 'o', 'r'},
            {'c', 'a', 'd', 'e', 'i', 'r', 'a'},
            {'e', 'd', 'i', 'f', 'i', 'c', 'i', 'o'},
            {'a', 'u', 't', 'o', 'm', 'o', 'v', 'e', 'l'},
            {'s', 'm', 'a', 'r', 't', 'p', 'h', 'o', 'n', 'e'}
            };
    static int z = banco[ind_palavra].length;
    static char palavra_sort[] = new char[z];
    static char palavra_dig[] = new char[10];
    static char letras_digitadas[] = new char[26];
    static int cont_let_dig = 0;
    static int cont_erros = 0;

    static int sorteio() {
        Random r = new Random();
        int sort = r.nextInt(5);
        return sort;
    }

    static void imprime_palavra_dig() {
        System.out.print("\n     " + palavra_sort.length + " letras \n   ");
        for (int i = 0; i < palavra_sort.length; i++) {
            System.out.print(palavra_dig[i] + " ");
        }
        System.out.println();
    }

    static void copia(int ind) {
        for (int i = 0; i < banco[ind].length; i++) {
            palavra_sort[i] = banco[ind][i];
        }
    }

    static void limpa_palavra_dig() {
        for (int i = 0; i < palavra_dig.length; i++) {
            palavra_dig[i] = '_';
        }
    }

    static void imprime_forca(int let_erro) {
        switch (let_erro) {
            case 0:
                System.out.println("  _____ ");
                System.out.println(" |      ");
                System.out.println(" |      ");
                System.out.println(" |      ");
                System.out.print(" |      ");
                break;
            case 1:
                System.out.println("  _____ ");
                System.out.println(" |    O ");
                System.out.println(" |      ");
                System.out.println(" |      ");
                System.out.print(" |      ");
                break;
            case 2:
                System.out.println("  _____ ");
                System.out.println(" |    O ");
                System.out.println(" |    | ");
                System.out.println(" |      ");
                System.out.print(" |      ");
                break;
            case 3:
                System.out.println("  _____ ");
                System.out.println(" |    O ");
                System.out.println(" |   /| ");
                System.out.println(" |      ");
                System.out.print(" |      ");
                break;
            case 4:
                System.out.println("  _____ ");
                System.out.println(" |    O ");
                System.out.println(" |   /|\\");
                System.out.println(" |      ");
                System.out.print(" |      ");
                break;
            case 5:
                System.out.println("  _____ ");
                System.out.println(" |    O ");
                System.out.println(" |   /|\\");
                System.out.println(" |   /  ");
                System.out.print(" |      ");
                break;
            case 6:
                System.out.println("  _____ ");
                System.out.println(" |    O ");
                System.out.println(" |   /|\\");
                System.out.println(" |   / \\");
                System.out.print(" |      ");
                break;
        }
    }

    static boolean verifica_letra(char letra, char[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (letra == vetor[i]) {
                return true;
            }
        }
        return false;
    }

    static void substitui(char letra) {
        for (int i = 0; i < palavra_sort.length; i++) {
            if (palavra_sort[i] == letra) {
                palavra_dig[i] = letra;
            }
        }
    }

    static void imprime_let_dig(int tam, char[] letras) {
        System.out.print("Letras Digitadas: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(letras[i] + ", ");
        }
    }

    static boolean palavra_completa() {
        for (int i = 0; i < palavra_sort.length; i++) {
            if (palavra_dig[i] == '_') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException, Exception {
        copia(ind_palavra);
        limpa_palavra_dig();//limpa o vetor palavra dig
        String l;
        char letra;
        while (cont_erros < 6) {
            imprime_forca(cont_erros);
            imprime_palavra_dig();
            imprime_let_dig(cont_let_dig, letras_digitadas);
            System.out.println("\ntentativas restantes: " + (6 - cont_erros));
            l = JOptionPane.showInputDialog("Digite uma letra: ");
            letra = l.charAt(0);
            letra = Character.toLowerCase(letra);
            System.out.println("Digite uma letra: " + letra);
            if (verifica_letra(letra, letras_digitadas)) {
                System.out.println("letra ja foi digitada!tente novamente!");
                System.out.println("Press Enter to continue...");
                System.in.read();
            } else {
                letras_digitadas[cont_let_dig] = letra;
                cont_let_dig++;
                if (verifica_letra(letra, palavra_sort)) {
                    substitui(letra);
                } else {
                    System.out.println("letra incorreta! tente novamente!");
                    cont_erros++;
                    System.out.println("Press Enter to continue...");
                    System.in.read();
                }
            }
            if (cont_erros >= 6) {
                System.out.println("\n\n\n\n\n\n\n\n\n\tSuas tentativas acabaram!\n\tReinicie o software para tentar novamente!\n\n\n\n");
            }
            if (palavra_completa()) {
                System.out.println("\n\n\n\n\n\n\n\n\n\tPARABENS!!!\n\tVOCÊ ACERTOU A PALAVRA!\n\n\n\n");
                System.exit(0);
            }
        }
    }
}
