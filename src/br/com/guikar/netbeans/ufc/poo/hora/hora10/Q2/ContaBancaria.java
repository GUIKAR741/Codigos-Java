package br.com.guikar.netbeans.ufc.poo.hora.hora10.Q2;
public abstract class ContaBancaria extends Banco{
    private int numeroConta;
    private double saldo;
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public ContaBancaria() {}
    public ContaBancaria(int numeroConta) {
        setNumeroConta(numeroConta);
    }
    public ContaBancaria(int numeroConta, double saldo) {
        this(numeroConta);
        setSaldo(saldo);
    }
    public static void abc(){

    }
    public void transferir(double valor, ContaBancaria conta){
        this.sacar(valor);
        conta.depositar(valor);
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        if(numeroConta>=0)
            this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}