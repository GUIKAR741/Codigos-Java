package br.com.guikar.netbeans.ufc.poo.hora;

public class CifraDecifra {
    private String mensagem;
    private char chave;
    private int espaco;
    private int tipo;

    public void setMensagem(String mensagem) {
        if(mensagem!=null)
            this.mensagem = mensagem;
    }

    public void setChave(char chave) {
        if(chave!=' ')
            this.chave = chave;
    }

    public void setEspaco(int espaco) {
        if((espaco == 1) || (espaco == 2))
            this.espaco = espaco;
    }

    public void setTipo(int tipo) {
        if(tipo==1 || tipo==2)
            this.tipo = tipo;
    }

    private String[] ordenaAlfabeto(char chave){
        String let[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};
        String letCif[]=new String[26];
        int nLet[] = new int[26];
        int nChav = 0, cont = 0;
        for (int i = 0; i < let.length; i++) {
            if (let[i].lastIndexOf(chave) == 0) {
                nChav = i;
                break;
            }
        }
        for (int i = nChav; i < let.length; i++) {
            nLet[cont] = i;
            cont++;
            if (i == 25) {
                for (int j = 0; j < nChav; j++) {
                    nLet[cont] = j;
                    cont++;
                }
            }
        }
        for(int i=0;i<nLet.length;i++){
            letCif[i]=let[nLet[i]];
        }
        return letCif;
    }
    public char[] criptografaDescriptografa(){
        String let[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};
        String esp=" ";
        String letCif[]=ordenaAlfabeto(this.chave);
        char rMsg[] = new char[mensagem.length()];
        if(this.espaco==1) this.mensagem.replaceAll(" ","");
        for (int i = 0; i < this.mensagem.length(); i++) {
            for (int j = 0; j < letCif.length; j++) {
                if (this.tipo==1){
                    if (this.mensagem.charAt(i) == let[j].charAt(0)) {
                        rMsg[i] = letCif[j].charAt(0);
                    }else if(this.mensagem.charAt(i)==esp.charAt(0) && this.espaco==1){
                        rMsg[i]=esp.charAt(0);
                    }
                }else if(this.tipo==2) {
                    if (this.mensagem.charAt(i) == letCif[j].charAt(0)) {
                        rMsg[i] = let[j].charAt(0);
                    } else if (this.mensagem.charAt(i) == esp.charAt(0) && this.espaco==1) {
                        rMsg[i]=esp.charAt(0);
                    }
                }
            }
        }
        return rMsg;
    }
}