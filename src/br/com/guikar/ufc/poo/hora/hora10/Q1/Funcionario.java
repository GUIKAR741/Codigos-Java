package br.com.guikar.ufc.poo.hora.hora10.Q1;
public abstract class Funcionario {
    private String nome;
    private String matricula;
    private double salario_base;
    public Funcionario() {
    }
    public Funcionario(String nome) {
        setNome(nome);
    }
    public Funcionario(String nome, String matricula) {
        this(nome);
        setMatricula(matricula);
    }
    public static void abc(){

    }
    public Funcionario(String nome, String matricula, double salario_base) {
        this(nome,matricula);
        setSalario_base(salario_base);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome != null)
            this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        if(matricula != null)
            this.matricula = matricula;
    }
    public double getSalario_base() {
        return salario_base;
    }
    public void setSalario_base(double salario_base) {
        if(salario_base >= 0)
            this.salario_base = salario_base;
    }
    public abstract double calculaSalario();
}