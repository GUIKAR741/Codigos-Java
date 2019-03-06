package br.com.guikar.netbeans.ufc.poo.cores;

public class Cor {
    private String nome;
    private Object dono;

    public Cor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Object getDono() {
        return dono;
    }

    public void setDono(Object dono) {
        this.dono = dono;
    }
    //        public String pegaCor(){
//        for(int i =0;i<nome.length;i++){
//            if(dono[i]==null){
//                return nome[i];
//            }
//        }
//        return "";
//    }
}
