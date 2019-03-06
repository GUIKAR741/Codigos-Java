package br.com.guikar.ufc.poo.hora.hora09.Q1;
public class Cliente extends Pessoa{
    private float dinheiro;
    private Ingresso ingresso;
    private String nomeFilme;
    public Cliente() {
        super();
    }
    public Cliente(String nome, String sexo, float dinheiro) {
        super(nome, sexo);
        setDinheiro(dinheiro);
    }
    public Cliente(String nome, String sexo, float dinheiro, Ingresso ingresso) {
        this(nome, sexo, dinheiro);
        setIngresso(ingresso);
    }
    public Cliente(String nome, String sexo, float dinheiro, String nomeFilme) {
        this(nome, sexo, dinheiro);
        setNomeFilme(nomeFilme);
    }
    public float getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(float dinheiro) {
        if(dinheiro >= 0)
            this.dinheiro = dinheiro;
    }
    public Ingresso getIngresso() {
        return ingresso;
    }
    public void pegarInfoIngresso(){
        if(ingresso!=null){
            System.out.println("Descricao do Filme: "+ingresso.getDescricaoFilme());
            System.out.println("Preço: "+ingresso.getPreco());
            System.out.println("Sala: "+ingresso.getSala());
        }
    }
    public void setIngresso(Ingresso ingresso) {
        if(ingresso != null)
            this.ingresso = ingresso;
    }
    public void acao(){
        if(ingresso!=null)
            setDinheiro(dinheiro - ingresso.getPreco());
    }
    public String getNomeFilme() {
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        if(nomeFilme!=null)
            this.nomeFilme = nomeFilme;
    }
}
