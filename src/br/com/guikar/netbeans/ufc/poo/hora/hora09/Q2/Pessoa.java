package br.com.guikar.netbeans.ufc.poo.hora.hora09.Q2;
public class Pessoa {
    private String nome;
    private String sobrenome;
    public Pessoa(){
        super();
    }
    public Pessoa(String nome) {
        setNome(nome);
    }
    public Pessoa(String nome, String sobrenome) {
        this(nome);
        setSobrenome(sobrenome);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        if(sobrenome!=null)
            this.sobrenome = sobrenome;
    }
    public String nomeCompleto(){
        return nome+" "+sobrenome;
    }
}
