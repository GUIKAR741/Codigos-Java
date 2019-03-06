/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.logica_desafios_e_testes.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Cifra_de_cesar {

    public static void main(String[] args) {
        String let[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z"};
        String mensagem = JOptionPane.showInputDialog("Digite a Mensagem?");
        String chave = JOptionPane.showInputDialog("Digite a Chave?");
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
        for (int i = 0; i < mensagem.length(); i++) {
            for (int j = 0; j < let.length; j++) {
                if (mensagem.charAt(i) == let[j].charAt(0)) {
                    rMsg[i] = let[nLet[j]].charAt(0);
                }
            }
        }
        for (int i = 0; i < rMsg.length; i++) {
            mensagem += rMsg[i];
            //System.out.print(rMsg[i]);
        }
        JOptionPane.showMessageDialog(null, "Mensagem Codificada: "+ mensagem);
        System.out.println("");
    }
}
