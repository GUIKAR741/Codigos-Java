/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.tdlogica;

import javax.swing.JOptionPane;

/**
 *
 * @author JMF
 */
public class Questao20 {
    public static void main (String[]args){
        double kw_h,tkw;
        final double residencia=0.60 , comercio=0.48 , industria=1.29;
        kw_h=Double.parseDouble(JOptionPane.showInputDialog("Kw Gasto no Mês: "));
        tkw=Double.parseDouble(JOptionPane.showInputDialog( "Tipos de Valor do kw/h"+"\n"
                +"1.Residência 0,60KW/h"+"\n"
                +"2.Comércio 0,48KW/h"+"\n"
                +"3.Indústria 1,29KW/h"));
        if (tkw==1){
            JOptionPane.showMessageDialog(null, "Preço da Conta de Luz: " + ( kw_h * residencia ));
        }
        if (tkw==2){
            JOptionPane.showMessageDialog(null, "Preço da Conta de Luz: " + ( kw_h * comercio ));
        }
        if (tkw==3){
            JOptionPane.showMessageDialog(null, "Preço da Conta de Luz: " + ( kw_h * industria ));
        }
    }
}
