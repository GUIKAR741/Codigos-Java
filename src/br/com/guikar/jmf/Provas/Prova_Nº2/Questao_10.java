/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.Provas.Prova_Nº2;

import javax.swing.JOptionPane;

/**
 *
 * @author infor2015
 */
public class Questao_10 {

    public static void main(String[] args) {
        double quadrado;
        int count = 0;
        int num = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        double MMCResult[] = new double[num];
        for (int i = 1; i < num; i++) {
            quadrado = Math.pow(i, 2);
            if (quadrado > num) {
                for (int j = 0; j <= num; i++) {
                    MMCResult[j] = quadrado;
                    count = count + 1;
                    if (count == 1) {
                        System.out.println(i + " elevado ao quadrado("+i+"²)"+" = " + MMCResult[0] + "; sendo " + i + " < " + num);
                    }
                    break;
                }
            }
        }
    }

}