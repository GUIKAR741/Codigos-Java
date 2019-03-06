package br.com.guikar.ufc.poo.hora;

public class Estudante {
    private String nome;
    private int matricula;
    private String curso;
    private float ira;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!=null && nome.length()>5) {
            this.nome = nome;
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula>0) {
            this.matricula = matricula;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getIra() {
        return ira;
    }

    public void setIra(float ira) {
        if( ira>=0 && ira<=10) {
            this.ira = ira;
        }
    }
    public Estudante(String nome, int matricula){
        this(nome);
        setMatricula(matricula);
    }
    public Estudante(String nome){
        this.nome=nome;
    }
    public Estudante(){
//        super();
        this("nao informado");
//        this.nome="nao informado";
    }
    public void exibe(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Matricula:"+this.matricula);
        System.out.println("Curso:"+this.curso);
        System.out.println("Ira:"+this.ira);
    }
}
