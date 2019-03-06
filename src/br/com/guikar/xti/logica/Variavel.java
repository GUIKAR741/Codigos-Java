/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.xti.logica;

/**
 * Apresentar o conceito de variavel.
 * @author Guilherme
 */
public class Variavel {
    public static void main(String[] args) {
        /*String primeiroNome,segundoNome,ultimoNome;
        primeiroNome="Guilherme";
        int idade=15;
        boolean solteiro=true;
        System.out.println(primeiroNome);*/
        
        int idade=15;
        double preco=12.45;
        boolean solteiro=true;
        char sexo='m';//Unicode      
        byte b=127;//cem
        short s=32_767;//32 mil
        int i=2_000_000_000;//2 bilhoes
        long l=92_233_720_000_000_00_000L;//92 Quintilhoes
        float f=123f;
        i=s;//Cast Implicito
        i=(int)l;//Cast Explicito
        System.out.println(i);
        double d=1.7976931348623157E+308;//IEE 754
        byte bb=0b01010101;//8 bits / 1 byte
        short ss=0b0101010101010101;//16 bits / 2 byte
        int ii=0b01010101010101010101010101010101;//32 bits / 4 byte*/
        
        /*//Variavel primitiva 
        int x=7;
        x=9;
        //Variavel de referencia
        String y="XTI";
        y="xti.com.br";
        y=null;*/
        
        /*int popBr=937629842;
        popBr=123;
        final double PI=Math.PI;
        final char SEXO_MASCULINO='M';
        final char SEXO_FEMININO='F';
        System.out.println(PI);*/
        
       /*Integer idade=new Integer(15);
        Double preco=new Double(12.45);
        double d=preco.doubleValue();
        int i=preco.intValue();
        byte b=preco.byteValue();
        boolean solteiro=true;
        char sexo='M'; */
        
        //convesao estatica
        double d1=Double.parseDouble("123.45");
        int i1=Integer.parseInt("123");
        float f1=Float.parseFloat("3.14f");
        int i2=Integer.valueOf("101011",2);
        System.out.println(i2);
    }
}
