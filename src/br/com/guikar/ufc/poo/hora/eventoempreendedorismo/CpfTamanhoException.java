package br.com.guikar.ufc.poo.hora.eventoempreendedorismo;
public class CpfTamanhoException extends Exception {
    private Funcionario funcionario;
    public CpfTamanhoException(Funcionario funcionario) {
        super("Tamanho do CPF errado");
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