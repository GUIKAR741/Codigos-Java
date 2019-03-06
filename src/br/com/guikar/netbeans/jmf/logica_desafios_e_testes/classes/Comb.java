/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.logica_desafios_e_testes.classes;

public class Comb {

    public static void main(String[] args) {
        int i;

        int x[] = new int[10];
        int y[] = new int[10];
        int z[] = new int[10];

        for (i = 0; i < 10; i++) {
            x[i] = i;
            y[i] = i;
            z[i] = i;
        }

        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i != j && i != k && k != j) {
                        //cout << x[i] << y[j] << z[k] << endl;
                        System.out.println(x[i]+' '+y[j]+' '+z[k]);
                    }
                }
            }
        }
    }
}
