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
public class InterfaceTest {
    public static void area(AreaCalculavel a) {
        System.out.println(a.calculaArea());
    }
    public static void volume(VolumeCalculavel a) {
        System.out.println(a.calculaVolume());
    }
    public static void main(String[] args) {
        volume(new Cubo(2));
    } 
}
