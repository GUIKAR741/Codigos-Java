package br.com.guikar.ufc.poo.hora.horadocodigo01;

public class Calculadora {
    public static final double pi=3.14;
    public Calculadora(){
        super();
    }
    public float calculaIMC(Pessoa p1){
        return (float) (p1.getPeso()/Math.pow(p1.getAltura(),2));
    }
    public String classificaIMC(Pessoa p1){
        float imc=calculaIMC(p1);
        if(imc<18.5){
            return "Abaixo do peso";
        }else if(imc>=18.5 && imc<25){
            return "Adequado";
        }else if(imc>=25 && imc<30){
            return "Sobrepeso";
        }else{
            return "Obeso";
        }
    }
    public Pessoa maiorMassa(Pessoa p1,Pessoa p2){
        if(calculaIMC(p1)>calculaIMC(p2))
            return p1;
        else
            return p2;
    }
    public float mediaIMC(Pessoa p1, Pessoa p2){
        return (calculaIMC(p1)+calculaIMC(p2))/2;
    }
}
