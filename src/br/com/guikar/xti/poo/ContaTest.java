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
public class ContaTest {
    public static void main(String[] args) {
        Conta conta=new Conta();
        conta.cliente="Guilherme";
        conta.saldo=10_000.00;
        conta.exibeSaldo();
        conta.saca(1000);
        conta.exibeSaldo();
        conta.deposita(6000);
        conta.exibeSaldo();
        Conta conta2=new Conta();
        conta2.cliente="Gui";
        conta2.saldo=8_000.00;
        conta2.exibeSaldo();
        conta.tranferePara(conta2, 1550);
        conta.exibeSaldo();
        conta2.exibeSaldo();
    }
}
