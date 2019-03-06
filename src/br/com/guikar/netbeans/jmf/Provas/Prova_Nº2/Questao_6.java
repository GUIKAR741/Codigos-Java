/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.Provas.Prova_Nº2;


/**
 *
 * @author infor2015
 */
public class Questao_6 {

    public static void main(String[] args) {
        int n, m, o, p, cont = 0, n6 = 0, n12 = 0, resultado;
        for (int i = 0; i < 200; i++) {
            n = i % 2;
            m = i % 3;
            o = i % 5;
            p = i % 7;
            if (n == 0 & i != 2 & i != 0 || m == 0 & i != 3 & i != 0 || o == 0 & i != 5 & i != 0 || p == 0 & i != 7 & i != 0) {
            } else {
                cont = cont + 1;
            }
            if (cont == 6) {
                n6 = i;
            }
            if (cont == 12) {
                n12 = i;
            }
        }
        resultado = n12 - n6;
        System.out.println(resultado);
    }
}
