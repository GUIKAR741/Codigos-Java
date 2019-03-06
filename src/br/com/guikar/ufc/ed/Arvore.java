package br.com.guikar.ufc.ed;

public class Arvore {
    private NoArvore raiz;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void imprimir_pre() {
        imprimir(raiz, 0);
        System.out.println();
    }

    public void imprimir_in() {
        imprimir(raiz, 1);
        System.out.println();
    }

    public void imprimir_pos() {
        imprimir(raiz, 2);
        System.out.println();
    }

    private void imprimir(NoArvore no, int forma) {
        if (forma == 0)
            if (no != null) {
                System.out.print(no.getElemento() + " ");
                imprimir(no.getEsquerda(), forma);
                imprimir(no.getDireita(), forma);
            }
        if (forma == 1)
            if (no != null) {
                imprimir(no.getEsquerda(), forma);
                System.out.print(no.getElemento() + " ");
                imprimir(no.getDireita(), forma);
            }
        if (forma == 2)
            if (no != null) {
                imprimir(no.getEsquerda(), forma);
                imprimir(no.getDireita(), forma);
                System.out.print(no.getElemento() + " ");
            }
    }

    public void insere(int elemento) {
        NoArvore no = busca_arv(elemento, raiz);
        if (no != null)
            if (no.getElemento() == elemento) System.out.println("insercao invalida");
            else {
                NoArvore novo=new NoArvore(elemento);
                if (elemento < no.getElemento()) {
                    novo.setPai(no);
                    no.setEsquerda(novo);
                }else {
                    novo.setPai(no);
                    no.setDireita(novo);
                }
            }
        else
            raiz = new NoArvore(elemento);
    }

    public NoArvore busca_arv(int elemento, NoArvore no) {
        if (no == null) return null;
        else if (elemento == no.getElemento()) return no;
        else if (elemento < no.getElemento()) {
            if (no.getEsquerda() == null) return no;
            else return busca_arv(elemento, no.getEsquerda());
        } else {
            if (no.getDireita() == null) return no;
            else return busca_arv(elemento, no.getDireita());
        }
    }

    public void remove(int elemento){
        busca_remove(raiz,raiz,elemento);
    }
    private void busca_remove(NoArvore pai,NoArvore atual,int elemento){
        if(raiz==null)return;
        if(atual!=null){
            if(elemento>atual.getElemento())
                busca_remove(atual,atual.getDireita(),elemento);
            else
                busca_remove(atual,atual.getEsquerda(),elemento);
            if(elemento==atual.getElemento()){
                if(atual==raiz){
                    raiz=remove_elemento(atual);
                }else{
                    if(pai!=null) {
                        if (pai.getDireita() == atual) {
                            pai.setDireita(remove_elemento(atual));
                        } else {
                            pai.setEsquerda(remove_elemento(atual));
                        }
                    }
                }
            }
        }
    }
    private NoArvore remove_elemento(NoArvore atual){
        NoArvore no1,no2;
        //Caso No folha ou com 1 filho
        if(atual.getEsquerda()==null){
            return atual.getDireita();
        }
        //Caso No com 2 filhos
        no1=atual;//Pai
        //Pegar No a esquerda depois o ultimo a direita
        no2=atual.getEsquerda();//Filho
        while(no2.getDireita()!=null){
            no1=no2;//Filho vira o Pai
            no2=no2.getDireita();//Filho aponta para filho da Direita
        }
        if(no1!=atual){
            no1.setDireita(no2.getEsquerda());//Pai aponta para esquerda do filho que será null
            no2.setEsquerda(atual.getEsquerda());//Filho aponta para esquerda do no que foi removido
        }
        no2.setDireita(atual.getDireita());//Filho aponta para direita do no que foi removido
        return no2;
    }

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        int[] num = {50, 25, 75, 10, 30, 65, 100, 15, 26, 64, 67, 200, 150, 24, 66};
        int[] res = {75};
        for(int i:num){
            arvore.insere(i);
        }
        arvore.imprimir_in();
        for(int i:res){
            arvore.remove(i);
        }
        arvore.imprimir_pre();
    }
}
