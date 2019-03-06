/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.logica_desafios_e_testes.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class Fatorial_Melhor {
    public static void main(String[] args) {
        int fat=1 ,cont,contini;    
        cont=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para calcular o seu fatorial :"));
        contini=cont;
        while(cont!=0){
            fat=fat*cont;
            cont--;
        }
        System.out.print("O fatorial de "+contini+" é ");
        while(contini!=0){
            if(contini!=1){
            System.out.print((contini--)+"x");
            }else{
                System.out.println((contini--)+"="+fat);
            }
        }
    }
}