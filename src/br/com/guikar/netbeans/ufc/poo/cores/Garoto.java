package br.com.guikar.netbeans.ufc.poo.cores;

public class Garoto {
    private Cor[] cor;

    public Cor[] getCor() {
        return cor;
    }

    public void setCor(Cor[] cor) {
        this.cor = cor;
    }
    public String pegaCor(){
        for(int i =0;i<cor.length;i++){
            if(cor[i].getDono()==null){
                cor[i].setDono(this);
                return cor[i].getNome();
            }
        }
        return "";
    }
    public void devolveCor(){
        for(int i =0;i<cor.length;i++){
            if(this.equals(cor[i].getDono())){
                cor[i].setDono(null);
            }
        }
    }
}
