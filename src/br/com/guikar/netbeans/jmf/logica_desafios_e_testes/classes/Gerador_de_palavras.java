/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.logica_desafios_e_testes.classes;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Gerador_de_palavras {

    public static String sortLet(int i) {
        String let[] = new String[62];
        let[0] = "A";
        let[1] = "B";
        let[2] = "C";
        let[3] = "D";
        let[4] = "E";
        let[5] = "F";
        let[6] = "G";
        let[7] = "H";
        let[8] = "I";
        let[9] = "J";
        let[10] = "K";
        let[11] = "L";
        let[12] = "M";
        let[13] = "N";
        let[14] = "O";
        let[15] = "P";
        let[16] = "Q";
        let[17] = "R";
        let[18] = "S";
        let[19] = "T";
        let[20] = "U";
        let[21] = "V";
        let[22] = "W";
        let[23] = "X";
        let[24] = "Y";
        let[25] = "Z";
        let[26] = "a";
        let[27] = "b";
        let[28] = "c";
        let[29] = "d";
        let[30] = "e";
        let[31] = "f";
        let[32] = "g";
        let[33] = "h";
        let[34] = "i";
        let[35] = "j";
        let[36] = "k";
        let[37] = "l";
        let[38] = "m";
        let[39] = "n";
        let[40] = "o";
        let[41] = "p";
        let[42] = "q";
        let[43] = "r";
        let[44] = "s";
        let[45] = "t";
        let[46] = "u";
        let[47] = "v";
        let[48] = "w";
        let[49] = "x";
        let[50] = "y";
        let[51] = "z";
        let[52] = "0";
        let[53] = "1";
        let[54] = "2";
        let[55] = "3";
        let[56] = "4";
        let[57] = "5";
        let[58] = "6";
        let[59] = "7";
        let[60] = "8";
        let[61] = "9";
        return let[i];
    }

    public static void main(String[] args) {
        Random r = new Random();
        int a = Integer.parseInt(JOptionPane.showInputDialog("Tamanho da Palavra desejada?"));
        String palavra = "";
        for (int i = 0; i < a; i++) {
            int sor = r.nextInt(62);
            palavra += sortLet(sor);
        }
        System.out.println(palavra);
    }
}
