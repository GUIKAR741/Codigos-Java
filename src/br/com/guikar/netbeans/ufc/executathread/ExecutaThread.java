package br.com.guikar.netbeans.ufc.executathread;

import java.util.Date;
import java.util.Scanner;

public class ExecutaThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdThreads, qtdPrioridades = 5, eS, quantum, tempoSimulacao;
        ListaDuplamenteEncadeada<Fila<ProgramaThread>> lista = new ListaDuplamenteEncadeada<>();
        for (int i = 0; i < qtdPrioridades; i++) {
            lista.addFim(new Fila<>());
        }
        do {
            System.out.print("Digite quantas threads deseja:");
            qtdThreads = sc.nextInt();
//            sc.nextLine();
        } while (qtdThreads <= 0);
        for (int i = 0; i < qtdThreads; i++) {
            int prioridade, instrucoes;
            do {
                System.out.print("Digite a Prioridade da Thread " + i + ":(Entre 0 a 4, 0 mais alta 4 mais baixa)");
                prioridade = sc.nextInt();
                sc.nextLine();
            } while (prioridade < 0 || prioridade > 4);
            do {
                System.out.print("Digite a Quantidade de instrucoes da Thread " + i + ":");
                instrucoes = sc.nextInt();
                sc.nextLine();
            } while (instrucoes <= 0);
            lista.buscar(prioridade).adicionar(new ProgramaThread("Thread " + i, instrucoes, 1000));
        }
        do {
            System.out.print("Digite o tempo de E/S:(Em segundos)");
            eS = sc.nextInt();
            sc.nextLine();
        } while (eS <= 0);
        eS=eS*1000;
        do {
            System.out.print("Digite o quantum:(Em segundos)");
            quantum = sc.nextInt();
            sc.nextLine();
        } while (quantum <= 0);
        quantum=quantum*1000;
        do {
            System.out.print("Digite o tempo de Execução da simulação:(Em minutos)");
            tempoSimulacao = sc.nextInt();
            sc.nextLine();
        } while (tempoSimulacao <= 0);
        tempoSimulacao=tempoSimulacao*(1000*60); // tranforma o tempo de min p/ ms
        for (int i = 0; i < lista.getTamanho(); i++) { // 
            Fila<ProgramaThread> filaT = lista.buscar(i);
            for (int j = 0; j < filaT.getTamanho(); j++) {
                ProgramaThread prog = filaT.remover();
                prog.setPrioridade(i);
                prog.setTempo(eS);
                prog.start();
                filaT.adicionar(prog);
            }
        }
        long tempoInicio = new Date().getTime();
        while (true) {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Fila<ProgramaThread> filaT = lista.buscar(i);
                int contaDormindo=0,tamFila=filaT.getTamanho();
                for (int j = 0; j < tamFila; j++) {
                    ProgramaThread prog = filaT.remover();
                    if(prog.isEs()) {
                        filaT.adicionar(prog);
                        contaDormindo++;
                        continue;
                    }
                    long date = new Date().getTime();
                    if (prog.getTurn().availablePermits() <= 0) // incrementa no semáforo
                        prog.getTurn().release();
                    while (true) {
                        if ((((new Date().getTime()) - date) > quantum || prog.getExecuta() == 1)) {
                            break;
                        }
                    }
                    if (prog.getExecuta()==1 && prog.isEs()){ // quando a thread termina o tempo de E/S
                        prog.setExecuta(0);
                        filaT.adicionar(prog);
                    }else{ // quando a thread vai para E/S
                        prog.setExecuta(1);
                        filaT.adicionar(prog);
                    }
                    if (((new Date().getTime()) - tempoInicio) > tempoSimulacao) { // verifica se o tempo de simulação acabou
                        System.exit(0);
                    }
                }
                if(contaDormindo<tamFila){
                    break;
                }
            }
        }
    }
}
