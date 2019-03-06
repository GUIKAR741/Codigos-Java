package br.com.guikar.ufc.poo.hora.horadocodigo;

public class Carta {
    private int valor;
    private int naipe;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if(valor>=1 && valor<=13)
            this.valor = valor;
        else
            this.valor=1;
    }

    public int getNaipe() {
        return naipe;
    }

    public void setNaipe(int naipe) {
        if(naipe>=1 && naipe<=4)
            this.naipe = naipe;
        else
            this.naipe=1;
    }

    public Carta(){
        super();
    }
    public Carta(int valor, int naipe) {
        this();
        setValor(valor);
        setNaipe(naipe);
    }

    @Override
    public String toString() {
        String numero="",naipe="";
        switch (this.valor){
            case 1:
                numero="as";
                break;
            case 2:
                numero="dois";
                break;
            case 3:
                numero="tres";
                break;
            case 4:
                numero="quatro";
                break;
            case 5:
                numero="cinco";
                break;
            case 6:
                numero="seis";
                break;
            case 7:
                numero="sete";
                break;
            case 8:
                numero="oito";
                break;
            case 9:
                numero="nove";
                break;
            case 10:
                numero="dez";
                break;
            case 11:
                numero="valete";
                break;
            case 12:
                numero="rainha";
                break;
            case 13:
                numero="rei";
                break;
            default:
                numero="as";
        }
        switch (this.naipe){
            case 1:
                naipe="ouros";
                break;
            case 2:
                naipe="paus";
                break;
            case 3:
                naipe="copas";
                break;
            case 4:
                naipe="espadas";
                break;
            default:
                naipe="ouros";
        }
        return numero+" de "+naipe;
    }
}
