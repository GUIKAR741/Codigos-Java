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
public class Carro {
    String modelo;
    double segundosZeroACem;
    double velocidadeMaxima;
    Motor motor;
    public Carro(){}
    public Carro(String modelo,double zeroACem,double velocidadeMax){
        this(modelo,zeroACem,velocidadeMax,null);
    }
    public Carro(String modelo,double zeroACem,double velocidadeMax,Motor motor){
        this.modelo=modelo;
        this.segundosZeroACem=zeroACem;
        this.velocidadeMaxima=velocidadeMax;
        this.motor=motor;
    }
}
