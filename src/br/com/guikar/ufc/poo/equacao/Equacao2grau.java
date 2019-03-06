package br.com.guikar.ufc.poo.equacao;

public class Equacao2grau {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) throws ADiferentedeZeroException {
        if(a!=0)
            this.a = a;
        else throw new ADiferentedeZeroException();
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calcularDelta() throws DeltaMenorQueZeroException {
        double delta=(b*b)-4*a*c;
        if(delta<0)throw new DeltaMenorQueZeroException();
        else return delta;
    }

    public double calcularX1() throws DeltaMenorQueZeroException {
        return (-b+Math.sqrt(calcularDelta()))/2*a;
    }
    public double calcularX2() throws DeltaMenorQueZeroException {
        return (-b-Math.sqrt(calcularDelta()))/2*a;
    }
}
