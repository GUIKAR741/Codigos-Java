/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.tdlogica;

import javax.swing.JOptionPane;

/**
 *
 * @author JMF
 */
public class Questao15 {
    public static void main (String[]args){
        double preco , desconto , pfinal;
        final double alcool=0.25 , gasolina=0.21 , diesel=0.14;
        int tdesconto;
        preco=Double.parseDouble(JOptionPane.showInputDialog("Preço do Carro: "));
        tdesconto=Integer.parseInt(JOptionPane.showInputDialog("Tipo de Combustivel do Carro:"+"\n"
                +"1.Alcool 25% Desconto"+"\n"
                +"2.Gasolina 21% Desconto"+"\n"
                +"3.Diesel 14% Desconto"+"\n"));
        if (tdesconto==1) {
            desconto=preco * alcool;
            pfinal=preco - desconto;
            JOptionPane.showMessageDialog(null,"Preço do Carro: "+preco+"\nSeu Desconto foi de: "+desconto
                +"\nSeu Carro Sairo Por: "+pfinal);
        }
        if (tdesconto==2) {
            desconto=preco * gasolina;
            pfinal=preco - desconto;
            JOptionPane.showMessageDialog(null,"Preço do Carro: "+preco+"\nSeu Desconto foi de: "+desconto
                +"\nSeu Carro Sairo Por: "+pfinal);
        }
        if (tdesconto==3) {
            desconto=preco * diesel;
            pfinal=preco - desconto;
            JOptionPane.showMessageDialog(null,"Preço do Carro: "+preco+"\nSeu Desconto foi de: "+desconto
                +"\nSeu Carro Sairo Por: "+pfinal);
        }
    }
}
