package br.com.guikar.ufc.poo.hora.eventoempreendedorismo;
public class CpfInvalidoException extends Exception {
    public CpfInvalidoException(Funcionario funcionario) {
        super("CPF Invalido");
        setFuncionario(funcionario);
    }
    private Funcionario funcionario;
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        if(funcionario!=null)
            this.funcionario = funcionario;
    }
}