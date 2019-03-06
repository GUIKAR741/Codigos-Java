/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.Provas.Prova_Nº1;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Sorteio {

    public static void main(String args[]) {
        int nsor;
        int vet[] = new int[10];
        boolean confirma;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            nsor = r.nextInt(10) + 1;
            confirma = true;
            for (int j = 0; j <= i; j++) {
                if (vet[j] == nsor) {
                    confirma = false;
                    i--;
                }
            }
            if (confirma) {
                vet[i] = nsor;
                System.out.println("Questoes sorteadas " + (i + 1) + ": " + vet[i]);
            }
        }
    }
}
