/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.xti.logica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Dado {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Qual o seu Palpite?");
        int palpite=s.nextInt();
        Random r=new Random();
        int dado=r.nextInt(6)+1;//(0-5)+1=(1-6)
        System.out.println("Palpite = "+palpite);
        System.out.println("Dado = "+dado);
        if(palpite==dado){
            System.out.println("Acertou!");
        }else{
            System.out.println("Errou!");
        }
    }
}
