package br.com.guikar.ufc.poo.robo;

public class Robo {
    private String nome;
    private int nivelBateria;
    private Localizacao localizacao;
    private char direcao;
    private Mundo mundo;
    private int dorme;

    public Robo(){
        direcao='n';
        dorme=3;
        nivelBateria=100;
        localizacao=new Localizacao();
    }
    public Robo(String nome){
        this();
        setNome(nome);
    }
    public Robo(String nome,Mundo mundo){
        this(nome);
        setMundo(mundo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!=null)
            this.nome = nome;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        if(localizacao!=null)
            this.localizacao = localizacao;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        if(direcao=='n' || direcao=='s' || direcao=='o' || direcao=='l')
            this.direcao = direcao;
    }

    public Mundo getMundo() {
        return mundo;
    }

    public void setMundo(Mundo mundo) {
        if(mundo!=null)
            this.mundo = mundo;
    }

    public void andaFrente(){
        this.nivelBateria-=this.mundo.getDificuldade();
        if(nivelBateria<0)
            Tela.exibeMensagem("Sua Bateria acabou!");
        mundo.movimentaObjeto(this,this.localizacao);
        if(this.mundo.getComidaNoMapa()==0) {
            Tela.exibeMensagem("Você comeu todas comidas!");
            nivelBateria = 0;
        }
    }

    public void dormir(){
        if(dorme>0){
            if(nivelBateria<=80){
                nivelBateria+=20;
                dorme--;
            }else{
                Tela.exibeMensagem("Sua bateria já está carregada");
            }
        }else{
            Tela.exibeMensagem("Você já dormiu 3 vezes não pode dormir mais");
        }
    }

    public void dobraDireita(){
        switch (direcao){
            case 'n':
                setDirecao('l');
                break;
            case 's':
                setDirecao('o');
                break;
            case 'o':
                setDirecao('n');
                break;
            case 'l':
                setDirecao('s');
                break;
        }
    }

    public void dobraEsquerda(){
        switch (direcao){
            case 'n':
                setDirecao('o');
                break;
            case 's':
                setDirecao('l');
                break;
            case 'o':
                setDirecao('s');
                break;
            case 'l':
                setDirecao('n');
                break;
        }
    }

    public int getDorme() {
        return dorme;
    }

    public void comeComida(Comida comida){
        if(comida.getEnergia()<0){
            nivelBateria= (int) (nivelBateria*0.5);
            if(nivelBateria>5)
                Tela.exibeMensagem("Você comeu "+comida.getNome()+" que estáva estragado e perdeu 50% da sua vida!");
            else {
                Tela.exibeMensagem("Você comeu " + comida.getNome() + " que estáva estragado e você morreu!");
                nivelBateria = 0;
            }
        }else{
            nivelBateria+=comida.getEnergia();
            if(nivelBateria>100)
                nivelBateria=100;
            Tela.exibeMensagem("Você comeu "+comida.getNome()+" que estáva bom recuperou "
                    +comida.getEnergia()+" de energia!");
        }
    }

}
