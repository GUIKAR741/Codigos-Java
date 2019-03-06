package br.com.guikar.ufc.poo.hora.hora09.Q1;
public class Pessoa {
    private String nome;
    private String sexo;
    public Pessoa() {
        super();
    }

    public Pessoa(String nome) {
        setNome(nome);
    }

    public Pessoa(String nome, String sexo) {
        this(nome);
        setSexo(sexo);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome != null)
            this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        if(sexo != null)
            this.sexo = sexo;
    }
    public void acao(){}
}
