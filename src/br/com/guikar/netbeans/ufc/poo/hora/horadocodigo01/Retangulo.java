package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo01;

public class Retangulo {
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if(base>0)
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura>0)
        this.altura = altura;
    }
    public Retangulo(){
        super();
    }

    public Retangulo(int base, int altura) {
        this();
        setBase(base);
        setAltura(altura);
    }

    public int perimetro(){
        return 2*(altura+base);
    }
    public int area(){
        return base*altura;
    }
    public boolean isQuadrado(){
        return altura==base;
    }
    public void trocarValores(){
        int troca=altura;
        altura=base;
        base=troca;
    }
    public String desenha(){
        int xbase=base*3;
        StringBuilder xxbase= new StringBuilder();
        StringBuilder xxaltura= new StringBuilder();
        xxbase.append('+');
        for(int i=1;i<=xbase;i++){
            xxbase.append('-');
        }
        xxbase.append('+');
        for (int i = 1; i <= altura; i++) {
            xxaltura.append('\n').append("|");
            for(int j=1;j<=xbase;j++)
                xxaltura.append(' ');
            xxaltura.append("|");
        }
        xxaltura.append('\n');
        return xxbase.toString()+xxaltura.toString()+xxbase.toString();
    }
}
