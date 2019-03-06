/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.logica;

import java.util.Arrays;

/**
 *
 * @author Guilherme
 */
public class ArraySimples {
    public static void main(String[] args) {
        String[] paises={"Brasil","Russia","India","China"};
        System.out.println(paises[0]);
        System.out.println(paises.length);
        System.out.println(Arrays.toString(paises));
        System.out.println(Arrays.binarySearch(paises, "Russia"));
        Arrays.sort(paises,0,paises.length);
        System.out.println(Arrays.toString(paises));
        int[] impares=new int[5];
        impares[0]=1;
        impares[1]=3;
        impares[2]=5;
        impares[3]=7;
        impares[4]=9;
    }
}
