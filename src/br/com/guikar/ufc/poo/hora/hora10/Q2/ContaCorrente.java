package br.com.guikar.ufc.poo.hora.hora10.Q2;
public class ContaCorrente extends ContaBancaria {
    private double taxaDeOperacao;
    public ContaCorrente() {}
    public ContaCorrente(int numeroConta) {
        super(numeroConta);
    }
    public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }
    public ContaCorrente(int numeroConta, double saldo, double taxaDeOperacao) {
        super(numeroConta, saldo);
        setTaxaDeOperacao(taxaDeOperacao);
    }
    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo()-valor-taxaDeOperacao);
    }
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo()+valor-taxaDeOperacao);
    }
    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }
    public void setTaxaDeOperacao(double taxaDeOperacao) {
        if(taxaDeOperacao>=0)
            this.taxaDeOperacao = taxaDeOperacao;
    }
    @Override
    public void setSaldo(double saldo) {
        if(saldo>=0)
            super.setSaldo(saldo);
    }
}