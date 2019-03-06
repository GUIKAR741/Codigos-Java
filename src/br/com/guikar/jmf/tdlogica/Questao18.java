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
public class Questao18 {
    public static void main (String[]args){
        double qtdhtrabalho , nensinoprof , sprofessor , sprofinal;
        final double nv1=12 , nv2=17 , nv3=25;
        qtdhtrabalho=Double.parseDouble(JOptionPane.showInputDialog("Quantidade de Horas Trabalhadas: "));
        nensinoprof=Double.parseDouble(JOptionPane.showInputDialog("Nivel de Ensino Profesor"+"\n"
                +"Nivel 1 R$12 Hora/Aula"+"\n"
                +"Nivel 2 R$17 Hora/Aula"+"\n"
                +"Nivel 3 R$25 Hora/Aula"+"\n"));
        if (nensinoprof==1){
            sprofessor = qtdhtrabalho * nv1;
            JOptionPane.showMessageDialog(null,"Salario Ganho: "+sprofessor);
        }
        if (nensinoprof==2){
            sprofessor = qtdhtrabalho * nv2;
            JOptionPane.showMessageDialog(null,"Salario Ganho: "+sprofessor);
        }
        if (nensinoprof==3){
            sprofessor = qtdhtrabalho * nv3;
            JOptionPane.showMessageDialog(null,"Salario Ganho: "+sprofessor);
        }
    }
}
