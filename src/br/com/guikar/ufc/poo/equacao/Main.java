package br.com.guikar.ufc.poo.equacao;

public class Main {
    public static void main(String[] args) {
        Equacao2grau equacao2grau=new Equacao2grau();
        try {
            equacao2grau.setA(3);
            equacao2grau.setB(-2);
            equacao2grau.setC(0);
            System.out.println("Equacao: "+equacao2grau.getA()+"x² + "+equacao2grau.getB()+"x + "+equacao2grau.getC());
            System.out.println("Delta da equação: "+equacao2grau.calcularDelta());
            System.out.println("X1: "+equacao2grau.calcularX1());
            System.out.println("X2: "+equacao2grau.calcularX2());
        } catch (ADiferentedeZeroException | DeltaMenorQueZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
