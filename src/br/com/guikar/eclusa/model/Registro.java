package br.com.guikar.eclusa.model;

import br.com.guikar.eclusa.exceptions.MenorQueZeroException;
import br.com.guikar.eclusa.exceptions.VazioException;

public class Registro {
    private Embarcacao embarcacao;
    private Data data;
    private float preco;

    @Override
    public String toString() {
        return embarcacao +", "+ data +", Peso "+embarcacao.getCargaAtual()+" kg, Preco R$" + preco;
    }

    
    
    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }

    public void setEmbarcacao(Embarcacao embarcacao) throws VazioException {
        if (embarcacao != null)
            this.embarcacao = embarcacao;
        else
            throw new VazioException("Embarcação");
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) throws VazioException {
        if (data != null)
            this.data = data;
        else
            throw new VazioException("Data");
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) throws MenorQueZeroException {
        if (preco > 0)
            this.preco = preco;
        else
            throw new MenorQueZeroException("Preço");
    }
}
