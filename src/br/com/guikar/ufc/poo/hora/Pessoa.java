package br.com.guikar.ufc.poo.hora;

public class Pessoa {
    private String nome;
    private String email;
    private String endereco;
    private String fone;
    private Cachorro cachorro;
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        boolean arroba=false,ponto=false;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'|| arroba){
                if(i+1<email.length() && email.charAt(i)!='.' && email.charAt(0)!='@')
                    arroba=true;
                if(email.charAt(i)=='.'&& (i+1<email.length() && email.charAt(i)!=' '))
                    ponto=true;
            }
        }
        if(arroba && ponto)
            this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }
}
