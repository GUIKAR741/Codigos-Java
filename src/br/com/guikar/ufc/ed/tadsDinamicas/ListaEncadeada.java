package br.com.guikar.ufc.ed.tadsDinamicas;

public class ListaEncadeada<E> {
    private No<E> inicio;
    private No<E> fim;
    private int tamanho=0;

    public int getTamanho() {
        return tamanho;
    }

    private void addInicio(E elemento){
        No<E> novo=new No<>(elemento);
        if(this.tamanho==0){
           this.fim=novo;
        }else{
            novo.setProximo(this.inicio);
        }
        this.inicio=novo;
        this.tamanho++;
    }
    private void addFim(E elemento){
        No<E> novo=new No<>(elemento);
        if(this.tamanho==0){
            this.inicio=novo;
        }else{
            this.fim.setProximo(novo);
        }
        this.fim=novo;
        this.tamanho++;
    }
    public void add(E elemento,int posicao){
        if(posicao>=0 && posicao<=this.tamanho){
            if(posicao==0){
                addInicio(elemento);
            }else if(posicao==this.tamanho){
                addFim(elemento);
            }else{
                No<E> auxiliar=this.inicio;
                for(int i=0;i<posicao-1;i++)auxiliar=auxiliar.getProximo();
                No<E> novo=new No<>(elemento);
                novo.setProximo(auxiliar.getProximo());
                auxiliar.setProximo(novo);
                this.tamanho++;
            }
        }
    }
    private E rmInicio(){
        E aux=this.inicio.getElemento();
        if(this.tamanho>0){
            if(this.tamanho==1){
                this.inicio=this.fim=null;
            }else{
                this.inicio=this.inicio.getProximo();
            }
            this.tamanho--;
        }
        return aux;
    }
    public E rm(int posicao){
        E aux = null;
        if(posicao >= 0 && posicao < this.tamanho){
            if(posicao==0){
                aux=rmInicio();
            }else{
                No<E> auxiliar=this.inicio;
                for(int i=0;i<posicao-1;i++)auxiliar=auxiliar.getProximo();
                aux=auxiliar.getElemento();
                auxiliar.setProximo(auxiliar.getProximo().getProximo());
                if (posicao==this.tamanho-1){
                    this.fim=auxiliar;
                }
                this.tamanho--;
            }
        }
        return aux;
    }
    public void imprimir(){
        No<E> aux;
        for(aux=this.inicio;aux!=null;aux=aux.getProximo()){
            System.out.println(aux.getElemento());
        }
    }

}
