/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.poo;

/**
 *
 * @author Guilherme
 */
public class EnumTest {

    public static final double PI = 3.14;

    public static void andar(Medida medida, int total) {
        for (Medida m : Medida.values()) {
            if (medida == m) {
                System.out.println("Vou andar "+ total+" "+medida.titulo);
            }
        }
    }

    public static void main(String[] args) {
        /*System.out.println(PeçasXadrez.BISPO);
        System.out.println(Medida.M.titulo);
        for (Medida m : Medida.values()) {
            System.out.println(m + " : " + m.titulo);
        }*/
        andar(Medida.CM,100);
    }
}
