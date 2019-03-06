package br.com.guikar.ufc.poo.hora.horaq2;

public class InscricaoAssociacao {
    private String data;
    private boolean isProfissional;

    public InscricaoAssociacao() {
        super();
    }

    public InscricaoAssociacao(String data, boolean isProfissional) {
        setData(data);
        setIsProfissional(isProfissional);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(data!=null)
            this.data = data;
    }

    public boolean isIsProfissional() {
        return isProfissional;
    }

    public void setIsProfissional(boolean isProfissional) {
        if(isProfissional)
            this.isProfissional = isProfissional;
    }
}
