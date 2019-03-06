package br.com.guikar.ufc.poo.hora.eventoempreendedorismo;
public class CpfErradoException extends Exception {
    private Funcionario funcionario;
    public CpfErradoException(Funcionario funcionario) {
        super("CPF Errado");
        setFuncionario(funcionario);
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        if(funcionario!=null)
            this.funcionario = funcionario;
    }
}