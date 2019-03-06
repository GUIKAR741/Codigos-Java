package br.com.guikar.netbeans.ufc.poo.eclusa.model;

import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.CargaMaximaException;
import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.MenorQueZeroException;
import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.NecessarioUmContainerException;
import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.VazioException;

public abstract class Embarcacao {
    private int id;
    private float largura;
    private float comprimento;
    private float cargaMaxima;
    private float cargaAtual;
    private String portoDeOrigem;
    private String portoDeDestino;
    private String pais;
    private String capitao;
    private String sentido;
    private Data dataViagem;

    @Override
    public String toString() {
        return "Capitão: "+getCapitao()+" Sentido: "+getSentido();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) throws MenorQueZeroException  {
        if(id>=0)
            this.id = id;
        else
            throw new MenorQueZeroException("ID");
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws MenorQueZeroException {
        if(largura>0)
            this.largura = largura;
        else
            throw new MenorQueZeroException("Largura");
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws MenorQueZeroException {
        if(comprimento>0)
            this.comprimento = comprimento;
        else
            throw new MenorQueZeroException("Comprimento");
    }

    public float getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(float cargaAtual) throws MenorQueZeroException {
        if(cargaAtual>0)
            this.cargaAtual = cargaAtual;
        else
            throw new MenorQueZeroException("Carga Atual");
    }
    
    public float getCargaMaxima() {
        return cargaMaxima;
    }
    
    public void setCargaMaxima(float cargaMaxima) throws MenorQueZeroException {
        if(cargaMaxima>0)
            this.cargaMaxima = cargaMaxima;
        else
            throw new MenorQueZeroException("Carga Maxima");
    }

    public String getPortoDeOrigem() {
        return portoDeOrigem;
    }

    public void setPortoDeOrigem(String portoDeOrigem) throws VazioException {
        if(portoDeOrigem!=null && !portoDeOrigem.equals(""))
            this.portoDeOrigem = portoDeOrigem;
        else
            throw new VazioException("Porto de Origem");
    }

    public String getPortoDeDestino() {
        return portoDeDestino;
    }

    public void setPortoDeDestino(String portoDeDestino) throws VazioException {
        if(portoDeDestino!=null && !portoDeDestino.equals(""))
            this.portoDeDestino = portoDeDestino;
        else
            throw new VazioException("Porto de Destino");
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) throws VazioException {
        if(pais!=null && !pais.equals(""))
            this.pais = pais;
        else
            throw new VazioException("Pais");
    }

    public String getCapitao() {
        return capitao;
    }

    public void setCapitao(String capitao) throws VazioException {
        if(capitao !=null && !capitao.equals(""))
            this.capitao = capitao;
        else
            throw new VazioException("Capitão");
    }

    public String getSentido() {
        return sentido;
    }

    public void setSentido(String sentido) throws VazioException {
        if(sentido!=null && !sentido.equals(""))
            this.sentido = sentido;
        else
            throw new VazioException("Sentido");
    }

    public Data getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(Data dataViagem) throws VazioException {
        if(dataViagem!=null)
            this.dataViagem = dataViagem;
        else
            throw new VazioException("Data da Viagem");
    }

    
    
    public abstract void calcularCarga() throws CargaMaximaException, NecessarioUmContainerException, MenorQueZeroException;
}
