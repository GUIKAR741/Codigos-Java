package br.com.guikar.netbeans.ufc.poo.hora.hora10.Q1;
public class Secretario extends Funcionario{
    public Secretario() {}
    public Secretario(String nome) {
        super(nome);
    }
    public Secretario(String nome, String matricula) {
        super(nome, matricula);
    }
    public Secretario(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }
    @Override
    public double calculaSalario(){
        return getSalario_base();
    }
}