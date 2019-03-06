package br.com.guikar.netbeans.ufc.poo.hora.hora09.Q1;
public class Caixa {
    private float lucro;
    public Caixa() {
        super();
    }
    public Caixa(float lucro) {
        setLucro(lucro);
    }
    public float getLucro() {
        return lucro;
    }
    public void setLucro(float lucro) {
        if(lucro > 0)
            this.lucro = lucro;
    }
    public void exibeLucro(){
        System.out.println("Lucro: R$ "+lucro);
    }
}
