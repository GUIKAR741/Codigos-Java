package br.com.guikar.netbeans.ufc.ed;

public class Arvore {
    private NoArvore raiz;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void add(int elemento) {
        add(raiz, elemento);
    }

    private void add(NoArvore no, int elemento) {
        if (no == null) {
            raiz = new NoArvore(elemento);
            tamanho++;
        } else {
            if (elemento < no.getElemento()) {
                if (no.getEsquerda() == null) {
                    no.setEsquerda(new NoArvore(elemento));
                    tamanho++;
                } else
                    add(no.getEsquerda(), elemento);
            } else {
                if (no.getDireita() == null) {
                    no.setDireita(new NoArvore(elemento));
                    tamanho++;
                } else
                    add(no.getDireita(), elemento);
            }
        }
    }

    public void imprimir() {
        imprimir(raiz);
    }

    private void imprimir(NoArvore no) {
        if (no != null) {
            imprimir(no.getEsquerda());
            System.out.println(no.getElemento());
            imprimir(no.getDireita());
        }
    }

    public void insere(int elemento) {
        NoArvore no = raiz;
        NoArvore no1 = busca_arv(elemento, no);
        if (no1 != null)
            if (no1.equals(no)) System.out.println("insercao invalida");
            else {

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

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.add(10);
        arvore.add(8);
        arvore.add(9);
        arvore.add(11);
        arvore.add(12);
        arvore.imprimir();
    }
}
