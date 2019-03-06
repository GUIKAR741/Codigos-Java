package br.com.guikar.ufc.poo.hora;

public class Trapezio {
    private double baseMenor;
    private double baseMaior;
    private double altura;
    private double area;

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calculaArea(){
        this.area=((this.baseMaior+this.baseMenor)*this.altura)/2;
    }
    public void exibeDados(){
        System.out.println("Base Maior:"+this.baseMaior);
        System.out.println("Base Menor:"+this.baseMenor);
        System.out.println("Altura:"+this.altura);
        System.out.println("Area:"+this.area);
    }
}
