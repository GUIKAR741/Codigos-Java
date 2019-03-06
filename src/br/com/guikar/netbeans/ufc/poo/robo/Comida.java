package br.com.guikar.netbeans.ufc.poo.robo;

import java.util.Random;

public class Comida {
    private String nome;
    private int energia;

    public Comida(){
        String[] nomes={"Plasma","Oleo"};
        this.nome=nomes[new Random().nextInt(nomes.length)];
        int energia=new Random().nextInt(20)+1;
        this.energia=energia<=10 ?energia:energia*-1;
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }
}
