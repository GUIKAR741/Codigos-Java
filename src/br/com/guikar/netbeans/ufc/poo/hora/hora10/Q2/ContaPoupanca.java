package br.com.guikar.netbeans.ufc.poo.hora.hora10.Q2;
public class ContaPoupanca extends ContaBancaria {
    private double limite;
    public ContaPoupanca(){}
    public ContaPoupanca(int numeroConta) {
        super(numeroConta);
    }
    public ContaPoupanca(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }
    public ContaPoupanca(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        setLimite(limite);
    }
    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo()-valor);
    }
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo()+valor);
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        if(limite>=0)
            this.limite = -limite;
    }
    @Override
    public void setSaldo(double saldo) {
        if(saldo>=limite)
            super.setSaldo(saldo);
    }
}