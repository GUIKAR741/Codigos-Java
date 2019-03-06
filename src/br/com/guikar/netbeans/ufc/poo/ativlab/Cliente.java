package br.com.guikar.netbeans.ufc.poo.ativlab;

public class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        if(nome.length()>5)
            this.nome = nome;
        if(telefone.length()>10)
            this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
