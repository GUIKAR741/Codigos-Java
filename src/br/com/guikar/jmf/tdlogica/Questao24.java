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
public class Questao24 {
    public static void main (String[]args){
        double nconta , saldo , debito , credito , satual;
        nconta=Double.parseDouble(JOptionPane.showInputDialog("Numero da Conta do Cliente: "));
        saldo=Double.parseDouble(JOptionPane.showInputDialog("Saldo da Conta: "));
        debito=Double.parseDouble(JOptionPane.showInputDialog("Valor a ser Debitado na Conta: "));
        credito=Double.parseDouble(JOptionPane.showInputDialog("Valor a ser Creditado na Conta: "));
        satual=saldo - debito + credito;
        if (satual>0){
            JOptionPane.showMessageDialog(null,"Numero da Conta: "+nconta
                    +"\nSaldo: "+saldo
                    +"\nDebito: "+debito
                    +"\nCredito: "+credito
                    +"\nSeu Novo Saldo da Conta É: "+satual
                    +"\nSaldo Positivo");
        }else{
            JOptionPane.showMessageDialog(null,"Numero da Conta: "+nconta
                    +"\nSaldo: "+saldo
                    +"\nDebito: "+debito
                    +"\nCredito: "+credito
                    +"\nSeu Novo Saldo da Conta É: "+satual
                    +"\nSaldo Negativo");
        }
    }
}
