package br.com.guikar.netbeans.ufc.poo.hora;

public abstract class Conta{
    private float saldo;

    public Conta(float saldo) {
        this.saldo = saldo;
    }
    public void saca(float valor){
        setSaldo(saldo-valor);
    }
    public void deposita(float valor){
        setSaldo(saldo+valor);
    }
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo>=0)
            this.saldo = saldo;
    }
    public abstract void atualiza();
}
