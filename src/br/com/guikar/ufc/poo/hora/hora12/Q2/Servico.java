
package br.com.guikar.ufc.poo.hora.hora12.Q2;

public class Servico implements Recebivel {
    private String descricao;
    private int horas;
    private double precoHora;

    public Servico() {
    }

    public Servico(String descricao, int horas, double precoHora) {
        setDescricao(descricao);
        setHoras(horas);
        setPrecoHora(precoHora);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao != null)
            this.descricao = descricao;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horas > 0)
            this.horas = horas;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        if(precoHora > 0)
            this.precoHora = precoHora;
    }
    
    @Override
    public double totalizarReceita(){
        return getHoras()*getPrecoHora();
    }

    @Override
    public String toString() {
        return "Serviço"+
                "\nDescrição: "+getDescricao()+
                "\nQuantidade de Horas: "+getHoras()+
                "\nPreço por Hora: "+getPrecoHora()+
                "\nReceita: "+totalizarReceita();
    }
}
