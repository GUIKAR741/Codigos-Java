package br.com.guikar.netbeans.ufc.poo.hora.horaq2;

public class Estado {
    private String nome;
    private float pesoMaximo;
    private float valorMultaPorQuiloExcedente;

    public Estado() {
        super();
    }

    public Estado(String nome, float pesoMaximo, float valorMultaPorQuiloExcedente) {
        setNome(nome);
        setPesoMaximo(pesoMaximo);
        setValorMultaPorQuiloExcedente(valorMultaPorQuiloExcedente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!=null)
            this.nome = nome;
    }

    public float getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(float pesoMaximo) {
        if(pesoMaximo>0)
            this.pesoMaximo = pesoMaximo;
    }

    public float getValorMultaPorQuiloExcedente() {
        return valorMultaPorQuiloExcedente;
    }

    public void setValorMultaPorQuiloExcedente(float valorMultaPorQuiloExcedente) {
        if(valorMultaPorQuiloExcedente>0)
            this.valorMultaPorQuiloExcedente = valorMultaPorQuiloExcedente;
    }
    
    public float verificaPescador(Pescador p1){
        if(p1.pesoSacola() > this.pesoMaximo)
            return ((p1.pesoSacola()-this.pesoMaximo)*this.valorMultaPorQuiloExcedente);
        return 0;
    }
}