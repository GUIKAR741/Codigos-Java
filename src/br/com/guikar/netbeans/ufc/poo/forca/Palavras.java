package br.com.guikar.netbeans.ufc.poo.forca;

import java.util.Random;

public class Palavras {
    private String palavras[]={"carro","cachorro","russas ","chuva","copo","xicara","luz","monitor","gato","anel"};
    private String dica[]={"automovel","animal","buraco","agua","vidro","cafe","lampada","video","mia","dedo"};
    private Random aleatorio;
    public String[] getPalavra(){
        int posicao=aleatorio.nextInt(palavras.length);
        return new String[]{palavras[posicao],dica[posicao]};
    }
}
