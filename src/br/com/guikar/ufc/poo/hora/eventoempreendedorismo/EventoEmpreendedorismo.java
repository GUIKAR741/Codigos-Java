package br.com.guikar.ufc.poo.hora.eventoempreendedorismo;
public class EventoEmpreendedorismo {
    public static void main(String[] args) {
        Empresa empresa=new Empresa("Abc","20","teste");
        empresa.setFuncionario(new Funcionario("Guilherme1","07860281309","1000"));
        empresa.setFuncionario(new Funcionario("Guilherme2","0760281309","2000"));
        empresa.setFuncionario(new Funcionario("Guilherme3","07a60281309","3000"));
        empresa.setFuncionario(new Funcionario("Guilherme4","07560281309","4000"));
        empresa.setFuncionario(new Funcionario("Guilherme5","12345678909","5000"));
        empresa.setFuncionario(new Funcionario("Guilherme6","12345678909","1100"));
        empresa.checar();
    }
}