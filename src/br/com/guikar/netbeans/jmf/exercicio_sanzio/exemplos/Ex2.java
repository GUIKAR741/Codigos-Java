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
public class Ex2 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor:"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor:"));
        int r=(n1>n2)?n1+n2:n1-n2;
        System.out.println(r);
    }
}
