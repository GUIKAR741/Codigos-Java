/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.logica;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Entrada {
    public static void main(String[] args) {
        /*Scanner s=new Scanner(System.in);
        System.out.println("qual o seu nome?");
        String nome=(s.nextLine());
        System.out.println("bem vindo "+nome);*/
        
        String nome=JOptionPane.showInputDialog("qual o seu nome?");
        JOptionPane.showMessageDialog(null, nome);
    }
}
