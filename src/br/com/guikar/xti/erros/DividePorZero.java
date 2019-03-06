/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class DividePorZero {
    public static void main(String[] args) {
        /*int x=Integer.parseInt(JOptionPane.showInputDialog("Numero: ")),
            y=Integer.parseInt(JOptionPane.showInputDialog("Divisor: "));*/
        Scanner s=new Scanner(System.in);
        boolean continua=true;
        do{
            try {
                System.out.print("Numero:");
                int x=s.nextInt();
                System.out.print("Divisor:");
                int y=s.nextInt();
                System.out.println(x/y);
                continua=false;
            } catch (InputMismatchException e1) {
                System.err.println("Numeros devem ser inteiros");
                s.nextLine();
            }catch(ArithmeticException e2){
                System.err.println("Deve ser Diferente de zero");
            }finally{
                System.out.println("Finally Executando...");
            }
        }while(continua);
    }
}
