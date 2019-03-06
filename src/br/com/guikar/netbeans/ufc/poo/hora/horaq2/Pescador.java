
package br.com.guikar.netbeans.ufc.poo.hora.horaq2;

public class Pescador {
    private String nome;
    private String rg;
    private InscricaoAssociacao inscricao;
    private Peixe[] sacola;
    private int tam=0;

    public Pescador() {
        super();
    }

    public Pescador(String nome, String rg) {
        setNome(nome);
        setRg(rg);
    }

    public Pescador(String nome, String rg, InscricaoAssociacao inscricao) {
        this(nome,rg);
        setInscricao(inscricao);
        if(inscricao.isIsProfissional())
            sacola = new Peixe[25];
        else
            sacola = new Peixe[5];
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null)
            this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if(rg!=null)
            this.rg = rg;
    }

    public InscricaoAssociacao getInscricao() {
        return inscricao;
    }

    public void setInscricao(InscricaoAssociacao inscricao) {
        if(inscricao!=null)
            this.inscricao = inscricao;
    }

    public Peixe[] getSacola() {
        return sacola;
    }

    public void retiraPeixeMaisPesado(){
        if(tam>0){
            float maisPesado=0;
            int posicaoDoPeixeMaisPesado = 0;
            for(int i=0;i<sacola.length;i++)
                if(sacola[i]!=null)
                    if(sacola[i].getPeso()>maisPesado){
                        maisPesado = sacola[i].getPeso();
                        posicaoDoPeixeMaisPesado = i;
                    }
            sacola[posicaoDoPeixeMaisPesado]=null;
            tam--;
        }
    }

    public void colocarNaSacola(Peixe peixe){
        if(inscricao.isIsProfissional()){
            if(tam<25)
                sacola[tam++]=peixe;
        }else {
            if (tam < 5)
                sacola[tam++] = peixe;
        }
    }

    public float pesoSacola(){
        float peso = 0;
        for (Peixe sacola1 : sacola)
            if(sacola1!=null)
                peso += sacola1.getPeso();
        return peso;
    }
}
