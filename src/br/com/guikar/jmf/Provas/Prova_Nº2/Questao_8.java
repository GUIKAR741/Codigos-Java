/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.Provas.Prova_Nº2;

/**
 *
 * @author infor2015
 */
public class Questao_8 {

    public static void main(String[] args) {
        int cont = 0, soma = 0;
        double media;
        for (int i = 13; i <= 73; i++) {
            if (i % 2 == 0) {
                cont = cont + 1;
            }
        }
        int vet[] = new int[cont];
        int rest[] = new int[cont];
        for (int i = 13; i <= 73; i++) {
            for (int j = 0; i < cont; i++) {
                if (i % 2 == 0) {
                    vet[j] = i;
                }
                soma = vet[j] + soma;
            }
        }
        media = soma / cont;
        System.out.println(media);
    }
}
