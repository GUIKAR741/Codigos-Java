package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo01;

public class Cliente {
    private String nome;
    private char sexo;
    private int idade;
    public Cliente(){
        super();
    }
    public Cliente(String nome, char sexo, int idade) {
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!=null)
            this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo=='m' || sexo=='f')
            this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade>0)
            this.idade = idade;
    }
}
