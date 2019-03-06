package br.com.guikar.ufc.poo.hora;

public class ContaCorrente extends Conta {

    public ContaCorrente(float saldo) {
        super(saldo);
    }

    @Override
    public void atualiza() {
        setSaldo((float) (1.145*getSaldo()));
    }

    public static abstract class abc extends ContaCorrente{
        public abc(float saldo) {
            super(saldo);
        }

        public static void main(String[] args) {
            abc abc[] = new abc[10];
        }
    }

    public static void main(String[] args) {
//        Conta c[]=new Conta[10];
        Conta n=new ContaCorrente(100f);
        n.atualiza();
        System.out.println(n.getSaldo());
    }
}
