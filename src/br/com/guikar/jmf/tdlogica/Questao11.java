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
public class Questao11 {
    public static void main (String []args){
        double valcustoproduto , valfinalproduto , percentual , acrecimo , percentualporc;
        //valcustoproduto:Valor de custo do produto
        //valfinalproduto:valor final do produto apos acrecimos
        //acrecimo:valor de acrecimo a ser adicionado no valor do produto
        //percentual:porcentagen de acrecimo
        valcustoproduto=Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Produto:"));
        percentual=Double.parseDouble(JOptionPane.showInputDialog("Digite o Percentual de Acrecimo:"));
        percentualporc=(percentual/100);
        acrecimo=(valcustoproduto*percentualporc);
        valfinalproduto=(valcustoproduto+acrecimo);
        JOptionPane.showMessageDialog(null,"Valor Final do Produto: "+valfinalproduto);
    }
}
