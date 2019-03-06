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
public class FloorAndCeil {
    public static void main(String[] args) {
        double valorVenda=Double.parseDouble(JOptionPane.showInputDialog("Forneça o Valor da Venda:"));
        double desconto=Double.parseDouble(JOptionPane.showInputDialog("Forneça o Percentual de Desconto:"));
        double valorFinal=Math.floor(valorVenda-(valorVenda*desconto/100));
        JOptionPane.showMessageDialog(null,"Valor Original:"+valorVenda+
                "\nPercentual de Desconto:"+desconto+
                "\nValor Final com Desconto:"+valorFinal);
    }
}
