/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.exercicio_sanzio.exemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Ex1 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite uma Nota:"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite uma Nota:"));
        float m=(n1+n2)/2;
        System.out.println("A Media é igual a "+m);
    }
}
