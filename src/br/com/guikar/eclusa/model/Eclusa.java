package br.com.guikar.eclusa.model;

import br.com.guikar.eclusa.exceptions.MenorQueZeroException;
import br.com.guikar.eclusa.exceptions.VazioException;

import java.util.ArrayList;

public class Eclusa {

    private float largura;
    private float comprimento;
    private float vazao;
    private ArrayList<Embarcacao> filaRioMar;
    private ArrayList<Embarcacao> filaMarRio;
    private float capacidadeMaxima;
    private float capacidadeMinima;
    private ArrayList<Observer> observer = new ArrayList<>();
    private Caixa caixa = new Caixa();

    public Eclusa() {
        this.filaMarRio = new ArrayList<>();
        this.filaRioMar = new ArrayList<>();
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws MenorQueZeroException {
        if (largura > 0) {
            this.largura = largura;
            updateObserver();
        } else {
            throw new MenorQueZeroException("Largura");
        }
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws MenorQueZeroException {
        if (comprimento > 0) {
            this.comprimento = comprimento;
            updateObserver();
        } else {
            throw new MenorQueZeroException("Comprimento");
        }
    }

    public float getVazao() {
        return vazao;
    }

    public void setVazao(float vazao) throws MenorQueZeroException, Exception {
        if (vazao > 0) {
            this.vazao = vazao;
            updateObserver();
        } else {
            throw new MenorQueZeroException("Vazão");
        }
    }

    public ArrayList<Embarcacao> getFilaRioMar() {
        return filaRioMar;
    }

    public ArrayList<Embarcacao> getFilaMarRio() {
        return filaMarRio;
    }

    public float getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(float capacidadeMaxima) throws MenorQueZeroException, Exception {
        if (capacidadeMaxima > 0) {
            this.capacidadeMaxima = capacidadeMaxima;
            updateObserver();
        } else {
            throw new MenorQueZeroException("Capacidade Maxima");
        }
    }

    public float getCapacidadeMinima() {
        return capacidadeMinima;
    }

    public void setCapacidadeMinima(float capacidadeMinima) throws MenorQueZeroException, Exception {
        if (capacidadeMinima > 0) {
            this.capacidadeMinima = capacidadeMinima;
            updateObserver();
        } else {
            throw new MenorQueZeroException("Capacidade Minima deve ser Menor que a Maxima!");
        }
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void entrarEmbarcacaoNaFila(Embarcacao embarcacao) {
        if (embarcacao.getSentido().equals("Rio - Mar")) {
            filaRioMar.add(embarcacao);
        } else if (embarcacao.getSentido().equals("Mar - Rio")) {
            filaMarRio.add(embarcacao);
        }
        updateObserver();
    }

    public void atualizarEmbarcacaoNaFila(Embarcacao embarcacao) {
        for (int i = 0; i < filaRioMar.size(); i++) 
            if (filaRioMar.get(i).getId() == embarcacao.getId()) 
//                filaRioMar.set(i, embarcacao);
                filaRioMar.remove(i);
        for (int i = 0; i < filaMarRio.size(); i++) 
            if (filaMarRio.get(i).getId() == embarcacao.getId()) 
//                filaMarRio.set(i, embarcacao);
                filaMarRio.remove(i);
        if(embarcacao.getSentido().equals("Rio - Mar"))
            filaRioMar.add(embarcacao);
        else
            filaMarRio.add(embarcacao);
       
        updateObserver();
    }

    public void sairEmbarcacaoDaFila(Embarcacao embarcacao) {
        if (embarcacao.getSentido().equals("Rio - Mar")) {
            filaRioMar.remove(embarcacao);
        } else if (embarcacao.getSentido().equals("Mar - Rio")) {
            filaMarRio.remove(embarcacao);
        }
        updateObserver();
    }

    public void calcularPreco() throws VazioException, MenorQueZeroException {
        Registro reg;
        float taxa;
        for (Embarcacao embarcacao:filaRioMar) {
            if(embarcacao instanceof Cargueiro)
                taxa=5f;
            else if(embarcacao instanceof Balsa)
                taxa=3f;
            else
                taxa=1f;
            reg=new Registro();
            reg.setData(embarcacao.getDataViagem());
            reg.setEmbarcacao(embarcacao);
            reg.setPreco(embarcacao.getCargaAtual()*taxa);
            caixa.addRegistro(reg);
        }
        for (Embarcacao embarcacao:filaMarRio) {
            if(embarcacao instanceof Cargueiro)
                taxa=5f;
            else if(embarcacao instanceof Balsa)
                taxa=3f;
            else
                taxa=1f;
            reg=new Registro();
            reg.setData(embarcacao.getDataViagem());
            reg.setEmbarcacao(embarcacao);
            reg.setPreco(embarcacao.getCargaAtual()*taxa);
            caixa.addRegistro(reg);
        }
    }

    public void addObserver(Observer observer) {
        if (observer != null) {
            this.observer.add(observer);
        }
    }

    private void updateObserver() {
        for (int i = 0; i < observer.size(); i++) {
            observer.get(i).update();
        }
    }
}
