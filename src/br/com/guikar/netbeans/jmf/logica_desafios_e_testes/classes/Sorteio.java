/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.logica_desafios_e_testes.classes;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Sorteio {
    public static void main(String[] args) {
        int valor,x,y;
        x=Integer.parseInt(JOptionPane.showInputDialog("QTD de Numeros?"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Nº de Sorteios?"));
        int vetor[]=new int[y];
        boolean confirma;
        Random r=new Random();
        for (int i=0;i<y;i++){
            valor=r.nextInt(x)+1;
            confirma=true;
            for (int j=0;j<=i;j++){
                if(vetor[j]==valor){
                    confirma=false;
                    i--;
                }
                }
                if (confirma){
                    vetor[i]=valor;
                    System.out.println("Questoes sorteadas "+(i+1)+": "+vetor[i]);
                }
        }
    }
}
