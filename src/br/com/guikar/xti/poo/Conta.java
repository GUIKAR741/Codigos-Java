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
public class Conta {
    String cliente;
    double saldo;
    void exibeSaldo(){
        System.out.println(cliente+" seu saldo é "+saldo);
    }
    void saca(double valor){
        saldo-=valor;
    }
    void deposita(double valor){
        saldo+=valor;
    }
    void tranferePara(Conta destino,double valor){
        this.saca(valor);
        destino.deposita(valor);
    }
}
