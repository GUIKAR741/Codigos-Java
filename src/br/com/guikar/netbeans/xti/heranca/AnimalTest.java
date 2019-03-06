/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.heranca;

/**
 *
 * @author Guilherme
 */
public class AnimalTest {
    public static void barulho(Animal animal){
        animal.fazerBarulho();
    }
    public static void main(String[] args) {
        
        Animal toto=new Cachorro(15,"Carne");
        Animal carijo=new Galinha(2,"Milho");
        barulho(toto);
        barulho(carijo);
    }
}
