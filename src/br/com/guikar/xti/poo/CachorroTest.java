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
public class CachorroTest {
    public static void main(String[] args){
        Cachorro pitbull=new Cachorro();
        pitbull.raca="PitBull";
        pitbull.tamanho=40;
        pitbull.latir();
        
        Cachorro viralata=new Cachorro();
        viralata.raca="Vira Lata";
        viralata.tamanho=30;
        viralata.latir();
    }
}
