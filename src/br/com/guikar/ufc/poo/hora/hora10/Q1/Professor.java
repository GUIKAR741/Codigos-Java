package br.com.guikar.ufc.poo.hora.hora10.Q1;
public class Professor extends Funcionario{
    private int aulas_extras;
    public Professor() {}
    public Professor(String nome) {
        super(nome);
    }
    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }
    public Professor(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }
    public Professor(String nome, String matricula, double salario_base, int aulas_extras) {
        super(nome, matricula, salario_base);
        setAulas_extras(aulas_extras);
    }
    public int getAulas_extras() {
        return aulas_extras;
    }
    public void setAulas_extras(int aulas_extras) {
        if(aulas_extras >= 0)
            this.aulas_extras = aulas_extras;
    }
    @Override
    public double calculaSalario(){
        return getSalario_base()+getAulas_extras();
    }
}