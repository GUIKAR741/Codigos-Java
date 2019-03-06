package br.com.guikar.ufc.poo.hora.horadocodigo;

public class Anunciante {
    private String nome;
    private String telefone01;
    private String telefone02;

    public String getNome() {
        return nome;
    }

    public String getTelefone01() {
        return telefone01;
    }

    public String getTelefone02() {
        return telefone02;
    }

    public void setTelefone01(String telefone01) {
        if(telefone01!=null)
            this.telefone01 = telefone01;
    }

    public void setTelefone02(String telefone02) {
        if(telefone02!=null)
            this.telefone02 = telefone02;
    }

    public Anunciante(String nome) {
        if(nome.length()>5)
            this.nome = nome;
    }
}
