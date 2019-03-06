/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.tdlogica;

import javax.swing.JOptionPane;

/**
 *
 * @author JMF
 */
public class Questao12 {
    public static void main (String []args){
        double pcarron , cfabrica , porcimp;
        int porcdist;
        // pcarron: preço do carro novo
        //cfabrica: preço do carro de fabrica
        //porcdist: porcentagen do distribuidor
        //porcimp: porcentagem de impostos
        cfabrica=Double.parseDouble(JOptionPane.showInputDialog("Preço do Carro de Fabrica: "));
        porcdist=(int) (cfabrica*0.28);
        porcimp=(cfabrica*0.45);
        pcarron=cfabrica + porcdist + porcimp;
        JOptionPane.showMessageDialog(null,"Preço do Carro de Fabica: "+cfabrica
                +"\nPorcentagem de acrecimo do distribuidor: "+porcdist
                +"\nPorcentagem de acrecimo de impostos: "+porcimp
                +"\nPreço do carro novo: "+pcarron);
    }
}
