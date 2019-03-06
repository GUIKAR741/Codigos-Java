/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.jmf.logica_desafios_e_testes.classes;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class Primo {
    public static void main(String[] args) {
        int cont=0;
//        x=Integer.parseInt(JOptionPane.showInputDialog(""));
        for(int x=1;x<=100;x++){
//            cont=0;
            for (int i=2;i<=x;i++){
                if (((x-1)%i)==0){
                    cont++;
                }
                if(cont==0){
                    System.out.println(x);    
                }
                cont=0;
            }}
        }
         /*Scanner scan = new Scanner (System.in);    
              
          int numero, elemesmo=0, resto, contador=0;    
              
          System.out.println("Digite um Número: ");    
          numero = scan.nextInt();    
              
            while ( numero >= elemesmo){  
                ++elemesmo;  
                  
                resto = numero % elemesmo;   
                  
                if ( resto == 0){  
                      contador++;  
              }  
             
                  
            }  
            if ( contador <= 2)  {  
                  
                System.out.println("O Número "+numero+" é primo");  
            }  
            else  
            {  
                System.out.println("Numéro "+numero+" não é primo");  
            }   */        
           /*int numero, elemesmo=0, resto, contador=0;  
//           numero=Integer.parseInt(JOptionPane.showInputDialog(""));
           for(numero=0;numero<100;numero++){
           for(int i=1;i<numero;i++){
                resto = numero % i;                    
                if ( resto == 0){  
                      contador++;  
                }
           }
           if ( contador <= 2)  {  
                  
                System.out.println("O Número "+numero+" é primo");  
                contador=0;
            }  
            else  
            {  
                System.out.println("Numéro "+numero+" não é primo");  
                contador=0;
            }*/
              
    }
         