/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.exercicio_sanzio.exemplos;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class CondSe {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nasc;
        System.out.print("Em que ano você nasceu? ");
        nasc = teclado.nextInt();
        int i = 2016 - nasc;
        System.out.println("Sua Idade é " + i);
        if (i >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }
    /*public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, res;
        System.out.print("Primeira Nota: ");
        n1 = teclado.nextFloat();
        System.out.print("Segunda Nota: ");
        n2 = teclado.nextFloat();
        res = (n1 + n2) / 2;
        System.out.println("Sua Media é:" + res);
        if (res > 9) {
            System.out.println("Você está no nível de Magnífico To do-Poderoso Supremo Benígno Saudoso e Misericórdioso Deus do Universo!");
        }
    }*/
}
