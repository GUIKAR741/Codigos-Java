package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo;

public class Triangulo {
    private float lado1,lado2,lado3;

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }

    private boolean isTriangulo(float lado1, float lado2, float lado3){
        if (lado1 < lado2 + lado3 && lado2 < lado3 + lado1 && lado3 < lado1 + lado2) {
            return true;
        }else{
            return false;
        }
    }

    public Triangulo(float lado1, float lado2, float lado3) {
        if (isTriangulo(lado1,lado2,lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
    }
    public String tipoTriangulo(){
        if(isTriangulo(this.lado1,this.lado2,this.lado3)){
            if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
                return "Equilatero!";
            } else if (this.lado1 != this.lado2 && this.lado2 != this.lado3 && this.lado1 != this.lado3) {
                return "Escaleno!";
            } else {
                return "Isoceles!";
            }
        }else{
            return "Não é um Triangulo!";
        }
    }
}
