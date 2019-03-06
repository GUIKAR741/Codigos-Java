package br.com.guikar.ufc.ed.l2q4;

public class Pilha4 {
    private NoP4 inicio;
    private NoP4 fim;
    private int tamanho=0;

    public int getTamanho() {
        return tamanho;
    }

    public void add(String elemento){
        if(verificaResultado(elemento)){
            int n1=Integer.parseInt(remover());
            int n2=Integer.parseInt(remover());
            int resultado = 0;
            switch (elemento){
                case "+":
                    resultado=n2+n1;
                    break;
                case "-":
                    resultado=n2-n1;
                    break;
                case "*":
                    resultado=n2*n1;
                    break;
                case "/":
                    resultado=n2/n1;
                    break;
            }
            elemento=Integer.toString(resultado);
        }
        NoP4 novo=new NoP4(elemento);
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
    public String remover(){
        String elemento=this.fim.getElemento();
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
    private boolean verificaResultado(String entrada){
        switch (entrada){
            case "+":
                return true;
            case "-":
                return true;
            case "*":
                return true;
            case "/":
                return true;
        }
        return false;
    }
    
    public void imprimir(){
        NoP4 aux;
        for(aux=this.inicio;aux!=null;aux=aux.getProximo()){
            System.out.println(aux.getElemento());
        }
    }

}
