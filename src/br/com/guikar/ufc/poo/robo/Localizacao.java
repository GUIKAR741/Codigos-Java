package br.com.guikar.ufc.poo.robo;

public class Localizacao {
    private int coordX;
    private int coordY;

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        if(coordX>=0 && coordX<100)
            this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        if(coordY>=0 && coordY<100)
            this.coordY = coordY;
    }
}
