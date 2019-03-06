package br.com.guikar.ufc.poo.hora.eventoempreendedorismo;
public class Funcionario {
    private String nome;
    private String cpf;
    private String salario;
    public Funcionario() {
        super();
    }
    public Funcionario(String nome) {
        this();
        setNome(nome);
    }
    public Funcionario(String nome, String cpf) {
        this(nome);
        setCpf(cpf);
    }
    public Funcionario(String nome, String cpf, String salario) {
        this(nome,cpf);
        setSalario(salario);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome != null)
            this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        if(cpf != null)
            this.cpf = cpf;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        if(salario != null)
            this.salario = salario;
    }
}
