package br.com.guikar.ufc.poo.hora.hora10.Q1;
public class Coordenador extends Funcionario{
    public Coordenador() {}
    public Coordenador(String nome) {
        super(nome);
    }
    public Coordenador(String nome, String matricula) {
        super(nome, matricula);
    }
    public Coordenador(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }
    @Override
    public double calculaSalario(){
        return getSalario_base()*2;
    }
}