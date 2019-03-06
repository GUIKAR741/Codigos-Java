package br.com.guikar.netbeans.ufc.ed;

public class TestaLista {
    public static void main(String[] args) {
//        ListaEncadeada lista=new ListaEncadeada();
//        lista.add(8,0);
//        lista.add(9,1);
//        lista.add(10,0);
//        lista.add(11,1);
//        lista.imprimir();
//        System.out.println("-----");
//        lista.rm(0);
//        lista.rm(2);
//        lista.imprimir();
        System.out.println("--dupla--");
        ListaDuplamenteEncadeada dupla=new ListaDuplamenteEncadeada();
        dupla.add(8,0);
        dupla.add(9,1);
        dupla.add(10,2);
        dupla.add(11,1);
        dupla.add(12,1);
        dupla.add(13,1);
        dupla.imprimir();
        System.out.println("----");
        dupla.rm(0);
        dupla.rm(4);
        dupla.rm(2);
        dupla.imprimir();
    }
}
