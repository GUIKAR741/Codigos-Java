package br.com.guikar.ufc.poo.forca;

public class Forca {
    private Palavras palavras=new Palavras();
    private String palavra;
    private int erros;
    private int acertos;
    
    public boolean verificaPalpite(char[] palavra,String palavraOriginal,char palpite){
        int verErro=0;
        for(int i=0;i<palavra.length;i++){
            if(palavraOriginal.charAt(i)==palpite){
                palavra[i]=palpite;
            }else{
                verErro++;
            }
        }
        return verErro != palavraOriginal.length();
    }
}
