package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length()>5)
            this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length()>=11)
            this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.length()>5)
            this.endereco = endereco;
    }
}
