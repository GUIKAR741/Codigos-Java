package br.com.guikar.netbeans.ufc.ed.tadsDinamicas;

public class Pilha<E> {
    private No<E> inicio;
    private No<E> fim;
    private int tamanho=0;

    public int getTamanho() {
        return tamanho;
    }

    public void empilhar(E elemento){
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
    public E desempilhar(){
        E elemento=this.fim.getElemento();
        if(this.tamanho>0){
            if(this.tamanho==1){
                this.inicio=this.fim=null;
            }else{
                this.fim=this.fim.getAnterior();
                this.fim.setProximo(null);
            }
            this.tamanho--;
        }
        return elemento;
    }
    public void imprimir(){
        No<E> aux;
        for(aux=this.inicio;aux!=null;aux=aux.getProximo()){
            System.out.println(aux.getElemento());
        }
    }

}
