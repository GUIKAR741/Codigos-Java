/*
package br.com.guikar.ufc.ed;

public class ArvoreTeste {
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
                if (elemento < no.getElemento())
                    no.setEsquerda(new NoArvore(elemento));
                else
                    no.setDireita(new NoArvore(elemento));
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

    public void remove(int elemento) {
        //caso em que a arvore está vazia
        if (raiz == null)
            System.out.println("Arvore vazia");
            //caso em que há apenas a raiz
        else if (raiz.getElemento() == elemento &&
                raiz.getEsquerda() == null &&
                raiz.getDireita() == null) {
            raiz = null;
        } else {
            remove(raiz, raiz, elemento);
        }
    }

    public void remove(NoArvore no, NoArvore pai, int valor) {
        //se o no em questao nao possui o valor a ser removido
        if (no.getElemento() != valor) {
            if (valor < no.getElemento()) {
                if (no.getEsquerda() != null) {
                    remove(no.getEsquerda(), no, valor);
                } else {
                    System.out.println("O valor " + valor + " nao esta na arvore");
                }
            } else {
                if (no.getDireita() != null) {
                    remove(no.getDireita(), no, valor);
                } else {
                    System.out.println("O valor " + valor + " nao esta na arvore");
                }
            }

        }
        //se o no em questao possui o valor a ser removido
        else {
            NoArvore aux;
            //caso de remocao de folha
            if (no.getDireita() == null && no.getEsquerda() == null) {

                // se o no a ser removido for filho direito do pai
                if (pai.getDireita() == no) {
                    pai.setDireita(null);
                } else {
                    pai.setEsquerda(null);
                }
            }
            //caso onde o no possui 1 filho
            else if (no.getDireita() == null || no.getEsquerda() == null) {

                //se nao há subarvore à direita, pegue o antecessor
                if (no.getEsquerda() != null) {
                    if (no == this.raiz) {
                        this.raiz = no.getEsquerda();
                    } else {
                        if (no.getEsquerda() != null)
                            pai.setEsquerda(no.getEsquerda());
                        else
                            pai.setDireita(no.getDireita());
                    }
                }
                //se nao há subarvore à esquerda, pegue o sucessor
                else {
                    if (no == this.raiz)
                        this.raiz = no.getDireita();
                    else {
                        if (no.getDireita() != null)
                            pai.setDireita(no.getDireita());
                        else
                            pai.setDireita(no.getEsquerda());
                    }
                }
            }
            */
/*caso de remocao de no com dois filhos: copie o sucessor para o no a ser removido
            e remova o sucessor*//*

            else {
                aux = no.getDireita();
                while (aux.getEsquerda() != null)
                    aux = aux.getEsquerda();
                no.setElemento(aux.getElemento());
                remove(no.getDireita(), no, aux.getElemento());
            }
        }
    }

    public void rem(int elemento){
        if(raiz==null)return;
        NoArvore ant=null;
        NoArvore atual=raiz;
        while(atual!=null){
            if(elemento==atual.getElemento()){
                if(atual==raiz){
                    raiz=remo(atual);
                }else{
                    if(ant.getDireita()==atual){
                        ant.setDireita(remo(atual));
                    }else{
                        ant.setEsquerda(remo(atual));
                    }
                    return;
                }
            }
            ant=atual;
            if(elemento>atual.getElemento())
                atual=atual.getDireita();
            else
                atual=atual.getEsquerda();
        }
    }
    public NoArvore remo(NoArvore atual){
        NoArvore no1,no2;
        if(atual.getEsquerda()==null){
            no2=atual.getDireita();
            return no2;
        }
        no1=atual;
        no2=atual.getEsquerda();
        while(no2.getDireita()!=null){
            no1=no2;
            no2=no2.getDireita();
        }
        if(no1!=atual){
            no1.setDireita(no2.getEsquerda());
            no2.setEsquerda(atual.getEsquerda());
        }
        no2.setDireita(atual.getDireita());
        return no2;
    }

    public static void main(String[] args) {
//        Arvore arvore = new Arvore();
//        arvore.insere(10);
//        arvore.insere(20);
//        arvore.insere(33);
//        arvore.insere(30);
//        arvore.insere(5);
//        arvore.insere(7);
//        arvore.insere(1);
//        arvore.insere(2);
//        arvore.imprimir_pre();
//        System.out.println();
//        arvore.imprimir_in();
//        System.out.println();
//        arvore.imprimir_pos();
//        System.out.println();
//        arvore.remover(10);
//        arvore.imprimir_in();
        ArvoreTeste tree = new ArvoreTeste();

        tree.insere(8);

        //Caso 1.1 Remover Raiz
        tree.remove(8);
        System.out.println("Imprimindo a arvore - Caso 1.1:");
        tree.imprimir_in();


        //Caso 1.2 Remover Raiz com Filho Esquerdo
        tree.insere(8);
        tree.insere(3);
        tree.remove(8);
        System.out.println("Imprimindo a arvore - Caso 1.2:");
        tree.imprimir_in();
        tree.remove(3);

        //Caso 1.3 Remover Raiz com Filho Direito
        tree.insere(8);
        tree.insere(14);
        tree.remove(8);
        System.out.println("Imprimindo a arvore - Caso 1.3:");
        tree.imprimir_in();
        tree.remove(14);


        //Caso 1.4 Remover Raiz com Filhos Direito e Esquerdo
        tree.insere(8);
        tree.insere(3);
        tree.insere(14);
        tree.remove(8);
        System.out.println("Imprimindo a arvore - Caso 1.4:");
        tree.imprimir_in();
        tree.remove(14);
        tree.remove(3);


        tree.insere(8);
        tree.insere(3);
        tree.insere(10);
        tree.insere(1);
        tree.insere(6);
        tree.insere(14);
        tree.insere(4);
        tree.insere(7);
        tree.insere(13);


        System.out.println("Imprimindo a arvore completa");
        tree.imprimir_in();


        //Caso 2  Remover folha
        tree.remove(4);
        System.out.println("Imprimindo a arvore - Caso 2");
        tree.imprimir_in();

        //Caso 3.1 Remover no com apenas o filho direito
        tree.remove(6);
        System.out.println("Imprimindo a arvore - Caso 3.1");
        tree.imprimir_in();

        //Caso 3.2 Remover no com apenas o filho esquerdo
        tree.remove(14);
        System.out.println("Imprimindo a arvore - Caso 3.2");
        tree.imprimir_in();

        //Caso 4  Remover no com dois filhos (no nao raiz)
        tree.remove(3);
        System.out.println("Imprimindo a arvore - Caso 4");
        tree.imprimir_in();

        tree.remove(8);
        System.out.println("Imprimindo a arvore");
        tree.imprimir_in();

        tree.remove(1);
        System.out.println("Imprimindo a arvore");
        tree.imprimir_in();

        tree.remove(7);
        System.out.println("Imprimindo a arvore");
        tree.imprimir_in();

        tree.remove(10);
        System.out.println("Imprimindo a arvore");
        tree.imprimir_in();

        tree.remove(13);
        System.out.println("Imprimindo a arvore");
        tree.imprimir_in();

        tree.insere(8);
        tree.insere(3);
        tree.insere(10);
        tree.insere(1);
        tree.insere(6);
        tree.insere(14);
        tree.insere(4);
        tree.insere(7);
        tree.insere(13);

        System.out.println("Imprimindo a arvore completa");
        tree.imprimir_in();

        //Caso 4  Remover no com dois filhos (no nao raiz)
        tree.remove(3);
        System.out.println("Imprimindo a arvore - Caso 4 (testando novamente, com arvore mais completa)");
        tree.imprimir_in();
    }
}
*/
