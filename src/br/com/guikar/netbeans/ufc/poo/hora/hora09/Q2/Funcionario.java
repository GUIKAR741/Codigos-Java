package br.com.guikar.netbeans.ufc.poo.hora.hora09.Q2;
public class Funcionario extends Pessoa{
    private String matricula;
    private float salario;
    public Funcionario() {
        super();
    }
    public Funcionario(String nome, String sobrenome) {
        super(nome, sobrenome);
    }
    public Funcionario(String nome, String sobrenome, String matricula) {
        this(nome, sobrenome);
        setMatricula(matricula);
    }
    public Funcionario(String nome, String sobrenome, String matricula, float salario) {
        this(nome,sobrenome,matricula);
        setSalario(salario);
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        if(matricula!=null)
            this.matricula = matricula;
    }
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if(salario>0)
            this.salario = salario;
    }
    public void primeiraParcela(){
        System.out.println(salario*0.6);
    }
    public void segundaParcela(){
        System.out.println(salario*0.4);
    }
}
