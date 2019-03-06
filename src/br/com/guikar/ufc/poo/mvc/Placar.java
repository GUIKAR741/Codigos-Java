package br.com.guikar.ufc.poo.mvc;

public class Placar{
    private String[] times=new String[2];
    private int[] pontos=new int[2];
    private Observer observer;

    public String getTime(int numero) {
        String time="";
        if(numero>=1 && numero<=2)
            time=times[numero-1];
        return time;
    }

    public void setTime(int numero,String time) {
        if(numero>=1 && numero<=2)
            if(time!=null){
                this.times[numero-1] = time;
                if(observer!=null)
                    observer.update();
            }
    }

    public int getPontos(int numero) {
        int ponto=0;
        if(numero>=1 && numero<=2)
            ponto=pontos[numero-1];
        return ponto;
    }

    public void addPonto(int numero) {
        if(numero>=1 && numero<=2) {
            this.pontos[numero - 1]++;
            if(observer!=null)
                observer.update();
        }
    }

    public void addObserver(Observer observer){
        if(observer!=null)
            this.observer=observer;
    }

    public void removeObserver(Observer observer){
        if(this.observer.equals(observer))
            this.observer=null;
    }
}
