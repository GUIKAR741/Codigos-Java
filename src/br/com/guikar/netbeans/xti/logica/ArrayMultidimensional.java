/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.logica;

import java.util.Random;

/**
 *
 * @author Guilherme
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        String[] uma={"Guilherme","Nepomuceno"};
        String[][] duas={{"Guilherme","M","CE"},{"Sandra","F","MG"}};
        String[] faces={"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei",};
        String[] nipes={"Espadas","Paus","Copas","Ouros",};
        Random r=new Random();
        int fac=r.nextInt(faces.length),nip=r.nextInt(nipes.length);
        String face=faces[fac],nipe=nipes[nip],carta=face+" "+nipe;
        System.out.println(carta);
    }
}
