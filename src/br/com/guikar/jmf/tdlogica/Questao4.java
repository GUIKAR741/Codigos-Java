/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.tdlogica;

import javax.swing.JOptionPane;

/**
 *
 * @author JMF
 */
public class Questao4 {
    public static void main (String[]args){
        String vendedor;
        double salariofixo,vendas,comissao,salariofinal;
        vendedor=JOptionPane.showInputDialog("Digite o Nome do Vendedor:");
        salariofixo=Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario Fixo:"));
        vendas=Double.parseDouble(JOptionPane.showInputDialog("Digite as Vendas Por Més :"));
        comissao=(vendas/100)*15;
        salariofinal=(salariofixo+comissao);
        JOptionPane.showMessageDialog(null,"Nome do Vendedor: "+ vendedor
                +"\nSalario Fixo: "+ salariofixo
                +"\nComissão: "+comissao
                +"\nSalario Final: "+ salariofinal);
    }
}
