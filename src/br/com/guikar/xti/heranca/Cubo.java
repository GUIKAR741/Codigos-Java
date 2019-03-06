/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.xti.heranca;

/**
 *
 * @author Guilherme
 */
public class Cubo implements AreaCalculavel,VolumeCalculavel{
    double lado;
    public Cubo(double lado) {
        this.lado=lado;
    }
    @Override
    public double calculaArea() {
        return lado*lado;
    }

    @Override
    public double calculaVolume() {
        return X*lado*lado;
    }
}
