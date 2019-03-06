package br.com.guikar.ufc.so.trabalhoso;

import java.util.function.Consumer;

public class Fila<E> {
    private No<E> inicio;
    private No<E> fim;
    private int tamanho=0;

    public int getTamanho() {
        return tamanho;
    }

    public void adicionar(E elemento){
        No<E> novo=new No<>(elemento);
        if(this.tamanho==0){
            this.inicio=novo;
        }else{
            this.fim.setProximo(novo);
            novo.setAnterior(this.fim);
            this.fim=novo;
        }
        this.fim=novo;
        this.tamanho++;
    }
    public E remover(){
        E aux=inicio.getElemento();
        if(this.tamanho>0){
            if(this.tamanho==1){
                this.inicio=this.fim=null;
            }else{
                this.inicio=this.inicio.getProximo();
                this.inicio.setAnterior(null);
            }
            this.tamanho--;
        }
        return aux;
    }

    public void imprimir(Consumer<E> con){
        No<E> aux;
        for(aux=this.inicio;aux!=null;aux=aux.getProximo()){
            if(con!=null)
                con.accept(aux.getElemento());
            else
                System.out.println(aux.getElemento());
        }
    }
}
