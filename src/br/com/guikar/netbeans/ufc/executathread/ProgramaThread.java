package br.com.guikar.netbeans.ufc.executathread;

import java.util.concurrent.Semaphore;

public class ProgramaThread extends Thread{
    private int instrucoes;
    private int prioridade;
    private boolean es;
    private int executa=0;
    private Semaphore turn;
    private long tempo;

    public boolean isEs() {
        return es;
    }

    public void setEs(boolean es) {
        this.es = es;
    }

    public void setInstrucoes(int instrucoes) {
        if(instrucoes>0)
            this.instrucoes = instrucoes;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        if(prioridade>=0 && prioridade<5)
            this.prioridade = prioridade;
    }

    public long getTempo() {
        return tempo;
    }

    public Semaphore getTurn() {
        return turn;
    }

    public void setTempo(long tempo) {
        if(tempo>0)
            this.tempo = tempo;
    }

    public int getInstrucoes() {
        return instrucoes;
    }

    public ProgramaThread(String name,int instrucoes){
        if(name!=null)
            setName(name);
        if(instrucoes>0)
            setInstrucoes(instrucoes);
        setTempo(0);
        turn=new Semaphore(0);
    }

    public ProgramaThread(String name,int instrucoes,long tempo){
        this(name,instrucoes);
        if(tempo>0)
            setTempo(tempo);
    }
    public void dormir(){
        try {
            turn.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getExecuta() {
        return executa;
    }

    public void setExecuta(int executa) {
        if(executa==1 || executa==0)
            this.executa = executa;
    }

    public void setTurn(Semaphore turn) {
        this.turn = turn;
    }

    @Override
    public void run() {
        try{
            while(true) {
                turn.acquire(); // assim q a thread é criada ela dorme
                for (int i = 1; i <= instrucoes; i++) {
                    System.out.println("Sou a "+getName() + " e estou Executando a instrução " + i + " Com Prioridade "+getPrioridade());
                    sleep(1000);
                    if(executa==1) {
                        executa = 0;
                        turn.acquire(); // se o quantum acabar a thread dorme
                    }
//                    sleep(tempo);
                }
                executa=1;
                es=true;
                sleep(tempo);
                es=false;
                turn.acquire(); // se for para E/S a thread dorme 
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
