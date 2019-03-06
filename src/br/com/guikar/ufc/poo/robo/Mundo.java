package br.com.guikar.ufc.poo.robo;

import java.util.Random;

public class Mundo {
    private String nome;
    private Object mapa[][][];
    private int dificuldade;
    private int x,y,comidaNoMapa;

    public Mundo(){
        super();
    }
    public Mundo(String nome){
        setNome(nome);
    }
    public Mundo(String nome,int x,int y){
        this(nome);
        setMapa(x,y);
        comidaNoMapa= (x*y)*0.7 <= 50? (int) ((x * y) * 0.7) :50;
        for (int i = 0; i < comidaNoMapa; i++) {
            Comida comida=new Comida();
            movimentaObjeto(comida,new Localizacao());
        }
    }
    public Mundo(String nome,int x,int y, int dificuldade){
        this(nome,x,y);
        setDificuldade(dificuldade);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!=null)
            this.nome = nome;
    }
    private void setMapa(int x, int y){
        if(x>0 && y>0) {
            this.x=x;
            this.y=y;
            this.mapa = new Object[x][y][2];
        }
    }
    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        if(dificuldade>0 && dificuldade<=10)
            this.dificuldade = dificuldade;
    }

    public int getComidaNoMapa() {
        return comidaNoMapa;
    }

    public void movimentaObjeto(Object objeto, Localizacao destino){
        if(objeto instanceof Robo){
            mapa[destino.getCoordX()][destino.getCoordY()][0]=null;
            switch (((Robo) objeto).getDirecao()){
                case 'n':
                    if(destino.getCoordY()+1<this.y)
                        destino.setCoordY(destino.getCoordY()+1);
                    else
                        Tela.exibeMensagem("Não é possivel andar para fora do mapa!");
                    break;
                case 's':
                    if(destino.getCoordY()-1>=0)
                        destino.setCoordY(destino.getCoordY()-1);
                    else
                        Tela.exibeMensagem("Não é possivel andar para fora do mapa!");
                    break;
                case 'o':
                    if(destino.getCoordX()+1<this.x)
                        destino.setCoordX(destino.getCoordX()+1);
                    else
                        Tela.exibeMensagem("Não é possivel andar para fora do mapa!");
                    break;
                case 'l':
                    if(destino.getCoordX()-1>=0)
                        destino.setCoordX(destino.getCoordX()-1);
                    else
                        Tela.exibeMensagem("Não é possivel andar para fora do mapa!");
                    break;
            }
            mapa[destino.getCoordX()][destino.getCoordY()][0]=objeto;
            if(mapa[destino.getCoordX()][destino.getCoordY()][1]!=null){
                ((Robo) objeto).comeComida((Comida) mapa[destino.getCoordX()][destino.getCoordY()][1]);
                mapa[destino.getCoordX()][destino.getCoordY()][1]=null;
                comidaNoMapa--;
            }
        }
        if(objeto instanceof Comida){
            Random aleatorio=new Random();
            int xPos=aleatorio.nextInt(this.x),yPos=aleatorio.nextInt(this.y);
            mapa[xPos][yPos][1]=objeto;
        }
    }
}
