package br.com.guikar.ufc.poo.hora.hora10.Q2;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaC=new ContaCorrente(313,1100f,2.5f);
        System.out.println("Conta Corrente");
        System.out.println("saldo "+contaC.getSaldo());
        contaC.sacar(10f);
        System.out.println("saldo depois saque "+contaC.getSaldo());
        contaC.depositar(20f);
        System.out.println("saldo depois deposito "+contaC.getSaldo());
        System.out.println("--------");
        ContaPoupanca contaP=new ContaPoupanca(313,500f,500f);
        System.out.println("Conta Poupanca");
        System.out.println("saldo "+contaP.getSaldo());
        contaP.sacar(600f);
        System.out.println("saldo depois saque "+contaP.getSaldo());
        contaP.depositar(20f);
        System.out.println("saldo depois deposito "+contaP.getSaldo());
        System.out.println("--------");
        System.out.println("Transferencia");
        System.out.println("saldo Corrente "+contaC.getSaldo());
        System.out.println("saldo Poupanca "+contaP.getSaldo());
        contaC.transferir(100f,contaP);
        System.out.println("Apos Transferencia");
        System.out.println("saldo Corrente "+contaC.getSaldo());
        System.out.println("saldo Poupanca "+contaP.getSaldo());
    }
}
