package br.com.guikar.ufc.poo.mvc;

import java.util.Scanner;

public class TelaPrincipal extends Observer{
    private TelaPrincipalController controller;
    private String nome;
    private int time;
    private Placar model;

    public Placar getModel() {
        return model;
    }

    public void setModel(Placar model) {
        if(model!=null)
        this.model = model;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if(time>=0)
            this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!=null)
            this.nome = nome;
    }

    public TelaPrincipal(Placar model) {
        setModel(model);
        this.controller = new TelaPrincipalController(this,model);
        model.addObserver(this);
        exibeMenu();
    }

    public void exibeMenu(){
        int opcao;
        do{
            System.out.println("Menu");
            System.out.println("[1] - Cadastrar nome time 1");
            System.out.println("[2] - Cadastrar nome time 2");
            System.out.println("[3] - Aumentar pontos time 1");
            System.out.println("[4] - Aumentar pontos time 2");
            Scanner sc = new Scanner(System.in);
            opcao=sc.nextInt();
            sc.nextLine();
        }while(opcao<1 || opcao>4);
        controller.acao(opcao);
    }

    public void lerTime(int time){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o nome do time %d: ",time);
        this.time=time;
        nome=sc.nextLine();
        controller.acao(5);
    }

    @Override
    public void update() {
        System.out.printf("%s %d x %d %s\n",model.getTime(1),model.getPontos(1),model.getPontos(2),model.getTime(2));
        exibeMenu();
    }
}