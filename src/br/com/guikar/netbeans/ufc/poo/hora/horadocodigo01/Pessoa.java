package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo01;

public class Pessoa {
    private String nome;
    private float altura;
    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!=null)
            this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura>0)
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso>0)
            this.peso = peso;
    }

    public Pessoa(){
        super();
    }

    public Pessoa(String nome, float altura) {
        this();
        setNome(nome);
        setAltura(altura);
    }

    public Pessoa(String nome, float altura, float peso) {
        this(nome,altura);
        setPeso(peso);
    }
}
