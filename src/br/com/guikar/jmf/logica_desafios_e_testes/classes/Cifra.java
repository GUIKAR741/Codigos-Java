/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.logica_desafios_e_testes.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Cifra {
    public static void main(String[] args) {
        String let[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z"};
        String letCif[]=new String[26];
        String mensagem = JOptionPane.showInputDialog("Digite a Mensagem?");
        //mensagem="abc def ghi jkl mnop qrs tuv wxy z";
        String chave = JOptionPane.showInputDialog("Digite a Chave?");
        String esp=" ";
        char rMsg[] = new char[mensagem.length()];
        int nLet[] = new int[26];
        int nChav = 0, cont = 0;
        for (int i = 0; i < let.length; i++) {
            if (let[i].lastIndexOf(chave) == 0) {
                nChav = i;
            }
        }
        for (int i = nChav; i < let.length; i++) {
            nLet[cont] = i;
            cont++;
            if (i == 25) {
                for (int j = 0; j < nChav; j++) {
                    nLet[cont] = j;
                    cont++;
                }
            }
        }
        for(int i=0;i<nLet.length;i++){
            letCif[i]=let[nLet[i]];
        }
        for (int i = 0; i < mensagem.length(); i++) {
            for (int j = 0; j < let.length; j++) {
                if (mensagem.charAt(i) == let[j].charAt(0)) {
                    rMsg[i] = letCif[j].charAt(0);
                }else if(mensagem.charAt(i)==esp.charAt(0)){
                    rMsg[i]=esp.charAt(0);
                }
            }
        }
        for(int i=0;i<rMsg.length;i++){
            System.out.print(rMsg[i]);
        }
    }
}
