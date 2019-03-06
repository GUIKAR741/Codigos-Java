/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.xti.logica;

import javax.swing.JOptionPane;

/**
 * Calcular IMC
 * IMC=Peso/(Altura*Altura)
 * @author Guilherme
 */
public class IMC {
    public static void main(String[] args) {
        double peso=Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso:"));
        double altura=Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura:"));
        double imc=peso/(altura*altura);
        JOptionPane.showMessageDialog(null, "IMC="+imc);
    }
}
