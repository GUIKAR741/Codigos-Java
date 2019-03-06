/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.ufc.ed;

/**
 *
 * @author tatiane
 */
public class ListaEncadeada1 {

    No1 inicio;
    No1 fim;
    int tam=0;

    void addInicio(int elemento){

        No1 novo = new No1();
        novo.elemento = elemento;
        if(tam == 0){
            fim = novo;
            inicio = novo;
        }else{
            novo.prox = inicio;
            inicio = novo;
        }
        tam++;
    }

    void imprimir(){
        No1 aux;
        for (aux = inicio; aux != null; aux=aux.prox){
            System.out.println(" " + aux.elemento);

        }
    }
}
