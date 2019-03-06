/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.xti.logica;

/**
 *
 * @author Guilherme
 */
public class Break_Continue_Label {

    public static void main(String[] args) {
        /*um:
        for (int j=0;j<10;j++) {
            dois:
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    break um;
                }//break;
                System.out.println(i);
            }
        }*/
        boolean[][] matrix={
            {false,true,false,false,false,},
            {false,false,false,false,false,}
        };
        busca:
        for(int a=0;a<matrix.length;a++){
            System.out.print("A ");
            for(int b=0;b<matrix[a].length;b++){
                if(matrix[a][b]){
                    System.out.print("True ");
                    break busca;
                }
                System.out.print("B ");
            }System.out.println("");
        }
    }
}
