package br.com.guikar.ufc.poo.hora.horadocodigo01;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo r=new Retangulo(1,1);
        System.out.println(r.area());
        System.out.println(r.perimetro());
        System.out.println(r.isQuadrado());
        System.out.println(r.desenha());
        r.trocarValores();
        System.out.println(r.desenha());
    }
}
