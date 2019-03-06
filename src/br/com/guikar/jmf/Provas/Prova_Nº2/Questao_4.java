/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.Provas.Prova_Nº2;

import javax.swing.JOptionPane;

/**
 *
 * @author infor2015
 */
public class Questao_4 {
    public static void main(String[]args){
        double x1,x2,y1,y2,d,r;
        x1=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x1: "));
        x2=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x2: "));
        y1=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y1: "));
        y2=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y2: "));
        r=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        d=Math.sqrt(r);
        System.out.println("A distancia entre eles é: "+d);
    }
}
