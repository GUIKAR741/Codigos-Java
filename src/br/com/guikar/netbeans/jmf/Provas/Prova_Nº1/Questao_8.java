/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.Provas.Prova_Nº1;

/**
 *
 * @author aluno
 */
public class Questao_8 {
    public static void main(String[]args){
        int num[]=new int[10];
        int resto[]=new int[10];
        int impar[]=new int[10];
        int par[]=new int[10];
        num[0]=58;
        num[1]=33;
        num[2]=29;
        num[3]=67;
        num[4]=98;
        num[5]=40;
        num[6]=31;
        num[7]=18;
        num[8]=85;
        num[9]=76;
        for(int i=0;i<num.length;i++){
            resto[i]=num[i]%2;
            if(resto[i]==0){
                par[i]=num[i];
                System.out.println("O vetor "+(i+1)+" tem o valor "+num[i]+" e este valor é par.");
            }else{
                impar[i]=num[i];
                System.out.println("O vetor "+(i+1)+" tem o valor "+num[i]+" e este valor é impar.");
            }
        }
    }
}
