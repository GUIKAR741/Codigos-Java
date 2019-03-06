package br.com.guikar.netbeans.ufc.poo.hora;

import java.util.Scanner;

public class TestaTrapezio {
    public static void main(String[] args) {
        Trapezio trapezio = new Trapezio();
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a altura do trapezio:");
        trapezio.setAltura(s.nextDouble());
        System.out.print("Digite a base menor do trapezio:");
        trapezio.setBaseMenor(s.nextDouble());
        System.out.print("Digite a base maior do trapezio:");
        trapezio.setBaseMaior(s.nextDouble());
        trapezio.calculaArea();
        trapezio.exibeDados();
    }
}
