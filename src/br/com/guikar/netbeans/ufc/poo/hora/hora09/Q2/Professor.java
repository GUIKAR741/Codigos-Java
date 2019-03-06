package br.com.guikar.netbeans.ufc.poo.hora.hora09.Q2;

public class Professor extends Funcionario{
    public Professor() {
        super();
    }
    public Professor(String nome, String sobrenome) {
        super(nome, sobrenome);
    }
    public Professor(String nome, String sobrenome, String matricula) {
        super(nome, sobrenome, matricula);
    }
    public Professor(String nome, String sobrenome, String matricula, float salario) {
        super(nome, sobrenome, matricula, salario);
    }
    @Override
    public void primeiraParcela() {
        System.out.println(getSalario());
    }
    @Override
    public void segundaParcela() {
        System.out.println("Você já recebeu seu salario!");
    }
}
