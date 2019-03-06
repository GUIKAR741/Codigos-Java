package br.com.guikar.ufc.ed;

public class ListaCircular {
    private No inicio;
    private int tamanho=0;

    public int getTamanho() {
        return tamanho;
    }

    private void addInicio(int elemento){
        No novo=new No(elemento);
        if(this.inicio==null){
            this.inicio=novo;
            inicio.setProximo(inicio);
            inicio.setAnterior(inicio);
        }else{
            novo.setAnterior(inicio.getAnterior());
            novo.setProximo(inicio);
            inicio.getAnterior().setProximo(novo);
            inicio.setAnterior(novo);
            this.inicio=novo;
        }
        this.tamanho++;
    }
    private void addFim(int elemento){
        No novo=new No(elemento);
        if(this.inicio==null){
            this.inicio=novo;
            inicio.setProximo(inicio);
            inicio.setAnterior(inicio);
        }else{
            novo.setAnterior(inicio.getAnterior());
            novo.setProximo(inicio);
            inicio.getAnterior().setProximo(novo);
            inicio.setAnterior(novo);
            this.inicio=novo;
        }
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
                this.inicio=null;
            }else{
                this.inicio.getProximo().setAnterior(this.inicio.getProximo().getAnterior().getAnterior());
                this.inicio.getAnterior().setAnterior(inicio.getProximo());
                inicio=inicio.getProximo();
            }
            this.tamanho--;
        }
    }
    private void rmFim(){
        if(this.tamanho>0){
            if(this.tamanho==1){
                this.inicio=null;
            }else{
                this.inicio.getAnterior().setAnterior(this.inicio.getAnterior());
                this.inicio.getAnterior().setProximo(this.inicio);
            }
            this.tamanho--;
        }
    }
    public void rm(int posicao){
        if(posicao >= 0 && posicao <= this.tamanho){
            if(posicao==0){
                rmInicio();
            }else if(posicao==this.tamanho){
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
        No aux=this.inicio;
        if(this.inicio!=null){
            do {
                System.out.println(aux.getElemento());
                aux = aux.getProximo();
            }while (aux!=inicio);
        }
        System.out.println();
    }

    public int soma(No aux,int tamanho){
        if(tamanho>0)
            return aux.getElemento()+soma(aux.getProximo(),tamanho-1);
        return 0;
    }

    public static void main(String[] args) {
        ListaCircular circ=new ListaCircular();
//        circ.add(40,0);
//        circ.add(10,0);
//        circ.add(50,2);
//        circ.add(20,1);
//        circ.add(30,2);
        circ.add(8,0);
        circ.add(2,0);
        circ.add(4,0);
        circ.add(10,0);
        circ.add(3,0);
        circ.imprimir();
        System.out.println(circ.getTamanho()+" "+circ.soma(circ.inicio,circ.getTamanho()));
        System.out.println();
        circ.rm(0);
        circ.rm(0);
        circ.rm(0);
        circ.rm(0);
        circ.rm(0);
        circ.imprimir();
        System.out.println(circ.getTamanho()+" "+circ.soma(circ.inicio,circ.getTamanho()));
    }
}
