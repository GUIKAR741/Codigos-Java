/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.jmf.exercicio_sanzio.exemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Media {
    public static void main(String[] args) {
        int num,soma = 0,total = -1,par = -1,impar = 0,mCem = 0;
        float media;
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "<html>"
                    + "<p align=\"center\">"
                    + "Informe um Número!"
                    + "<br>"
                    + "<em>"
                    + "(Digite ZERO para encerrar o processo)"
                    + "</em>"
                    + "</p>"
                    + "</html>"));
            if(num>=100){mCem++;}
            else if(num%2==0){par++;}
            else{impar++;}
            soma+=num;
            total++;
        }while (num!=0);
        media = soma/total;
        JOptionPane.showConfirmDialog(null,
                  "<html>"
                + "<p align=\"center\">"
                + "Relatorio Final"
                + "<hr>"
                + "Somatorio do Valores:"+soma
                + "<br>Total de Valores:"+total
                + "<br>Total de Pares:"+par
                + "<br>Total de Impares:"+impar
                + "<br>Valores acima de 100:"+mCem
                + "<br>A média dos valores é:"+media
                + "<hr>"
                + "</p>"
                + "</html>");
    }
}