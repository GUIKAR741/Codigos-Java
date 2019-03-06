/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.logica;

import java.util.ArrayList;
/**
 *
 * @author Guilherme
 */
public class ArrayLista {
    public static void main(String[] args) {
        ArrayList<String> cores=new ArrayList<>();
        cores.add("Branco");
        cores.add(0,"Vermelho");
        cores.add("Amarelo");
        cores.add("Azul");
        System.out.println(cores.toString());
        System.out.println("Tamanho="+cores.size());
        System.out.println("Elemento2="+cores.get(2));
        System.out.println("Indice Branco="+cores.indexOf("Branco"));
        cores.remove("Branco");
        System.out.println(cores.toString());
        System.out.println("Tem Cinza="+cores.contains("Cinza"));
    }
}
