/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.xti.logica;

/**
 *
 * @author Guilherme
 */
public class AutoBoxing {
    public static void main(String[] args) {
        /*Integer x=new Integer(555);//empacotado
        int a=x.intValue();//Desempacota
        a++;//Incrementa
        x=new Integer(a);//Re-Empacota
        System.out.println(x.intValue());*/
        
        Integer x=555;
        x++;//Desempacota,Incrementa,Re-Empacota
        System.out.println(x);
        
        Boolean v=new Boolean("true");
        if(v){
            System.out.println(v);
        }
    }
}
