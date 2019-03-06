package br.com.guikar.ufc.so.executathread;

import java.util.Date;

public class ES extends Thread {
    private ListaDuplamenteEncadeada<Fila<ProgramaThread>> prioridade;
    private Fila<ProgramaThread> es;
    private int entSai;
    public ES(ListaDuplamenteEncadeada<Fila<ProgramaThread>> prioridade,Fila<ProgramaThread> es,int entSai){
        this.prioridade=prioridade;
        this.es=es;
        this.entSai=entSai;
    }
    @Override
    public void run() {
        while(true){
            for (int i = 0; i < es.getTamanho(); i++) {
                try {
                    ProgramaThread threadPrograma = es.remover();
                    if ((new Date().getTime() - threadPrograma.getTempo()) >= entSai && threadPrograma.isEs()) {
                        threadPrograma.setEs(false);
                        Fila<ProgramaThread> filaT=prioridade.buscar(threadPrograma.getPrioridade());
                        filaT.adicionar(threadPrograma);
//                    System.out.println(es.getTamanho()+" " + Integer.toString(prioridade.buscar(threadPrograma.getPrioridade()).getTamanho()));
                    } else {

                        es.adicionar(threadPrograma);
                    }
                }catch (NullPointerException n){
                    continue;
                }
            }
        }
    }
}
