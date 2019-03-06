/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.poo;

/**
 *
 * @author Guilherme
 */
public class CarroTest {
    public static void main(String[] args) {
        //Ferrari
        Carro ferrari=new Carro();
        Motor v12=new Motor();
        ferrari.modelo="Ferrari Enzo";
        ferrari.segundosZeroACem=349;
        ferrari.velocidadeMaxima=3.2;
        v12.tipo="V12";
        v12.potencia=660;
        ferrari.motor=v12;//ADD Motor
        //Fim Ferrari
        //Koenigsegg
        Carro koenigsegg=new Carro("koenigsegg CCXR",430,3.1);
        Motor v8=new Motor("V8",1018);
        koenigsegg.motor=v8;
        //Fim Koenigsegg
        //Bugatti
        Carro bugatti=new Carro("Bugatti Veyron",430,2.2,new Motor("W16",1200));
        //Fim Bugatti
    }
}
