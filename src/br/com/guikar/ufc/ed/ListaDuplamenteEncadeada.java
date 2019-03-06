package br.com.guikar.ufc.ed;

public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;
    private int tamanho=0;

    public int getTamanho() {
        return tamanho;
    }

    private void addInicio(int elemento){
        No novo=new No(elemento);
        if(this.tamanho==0){
           this.fim=novo;
        }else{
            novo.setProximo(this.inicio);
            inicio.setAnterior(novo);
            this.inicio=novo;
        }
        this.inicio=novo;
        this.tamanho++;
    }
    private void addFim(int elemento){
        No novo=new No(elemento);
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
    public void add(int elemento,int posicao){
        if(posicao>=0 && posicao<=this.tamanho){
            if(posicao==0){
                addInicio(elemento);
            }else if(posicao==this.tamanho){
                addFim(elemento);
            }else{
                No auxiliar=this.inicio;
                for(int i=0;i<posicao-1;i++)auxiliar=auxiliar.getProximo();
                No novo=new No(elemento);
                novo.setProximo(auxiliar.getProximo());
                novo.setAnterior(auxiliar);
                auxiliar.getProximo().setAnterior(novo);
                auxiliar.setProximo(novo);
                this.tamanho++;
            }
        }
    }
    private void rmInicio(){
        if(this.tamanho>0){
            if(this.tamanho==1){
                this.inicio=this.fim=null;
            }else{
                this.inicio=this.inicio.getProximo();
                this.inicio.setAnterior(null);
            }
            this.tamanho--;
        }
    }
    private void rmFim(){
        if(this.tamanho>0){
            if(this.tamanho==1){
                this.inicio=this.fim=null;
            }else{
                this.fim=this.fim.getAnterior();
                this.fim.setProximo(null);
            }
            this.tamanho--;
        }
    }
    public void rm(int posicao){
        if(posicao >= 0 && posicao < this.tamanho){
            if(posicao==0){
                rmInicio();
            }else if(posicao==this.tamanho-1){
                rmFim();
            }else{
                No auxiliar=this.inicio;
                for(int i=0;i<posicao-1;i++)auxiliar=auxiliar.getProximo();
                auxiliar.setProximo(auxiliar.getProximo().getProximo());
                auxiliar.getProximo().setAnterior(auxiliar);
                this.tamanho--;
            }
        }
    }
    public void imprimir(){
        No aux;
        for(aux=this.inicio;aux!=null;aux=aux.getProximo()){
            System.out.println(aux.getElemento());
        }
    }

}
