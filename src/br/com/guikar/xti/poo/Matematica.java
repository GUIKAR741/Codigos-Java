/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.xti.poo;

/**
 *
 * @author Guilherme
 */
public class Matematica {
    /**
     * @param um
     * @param dois
     * @return o maior dos dois numeros
     */
    int maior(int um,int dois){
        if(um>dois){
            return um;
        }else{
            return dois;
        }
    }
    double soma(double... num){
        double total=0;
        for(double numero:num){
            total+=numero;
        }
        return total;
    }
    double media(double x){
        System.out.println("media(double x)");
        return x;
    }
    double media(double... x){
        System.out.println("media(double... x)");
        return this.soma(x)/x.length;
    }
    double media(double x,double y){
        System.out.println("media(double x,double y)");
        return (x+y)/2;
    }
    double media(String x,String y){
        System.out.println("media(String x,String y)");
        double ix=Double.parseDouble(x);
        double iy=Double.parseDouble(y);
        return (ix+iy)/2;
    }
    /**
     * @param numero
     * @return raiz do numero
     */
    int raiz(int numero){
        int impar=1,cont=0;
        while(numero>=impar){
            numero-=impar;
            impar+=2;
            cont++;
        }
        return cont;
    }
    String romanos(int numero){
        return "";
    }
}
