package br.com.guikar.netbeans.ufc.poo.floricultura;

public class Floricultura {
    private String nome;
    private Planta estoque[]=new Planta[50];

    public Floricultura(String nome) {
        if(nome!=null)
            this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Planta[] getEstoque() {
        return estoque;
    }
    public void comprasDoDia(){
        for (Planta item : this.estoque) {
            if (item != null) {
                if (item.getTotalEstoque() < item.getEstoqueIdeal()) {
                    System.out.println("Nome Planta:"+item.getNome());
                    System.out.println("Quantidade em Estoque:"+item.getTotalEstoque());
                }
            }
        }
    }
    public void entradaNoEstoque(String nome,int total){
        for (int i = 0; i < this.estoque.length; i++) {
            Planta item=this.estoque[i];
            if (item != null) {
                if(item.getNome().equals(nome)){
                    item.setTotalEstoque(item.getTotalEstoque()+total);
                }
            }
        }
    }
    public void saidaNoEstoque(String nome,int total){
        for (int i = 0; i < this.estoque.length; i++) {
            Planta item=this.estoque[i];
            if (item != null) {
                if(item.getNome().equals(nome)){
                    item.setTotalEstoque(item.getTotalEstoque()-total);
                }
            }
        }
    }
    public void entradaNoEstoque(Planta planta){
        for (int i = 0; i < this.estoque.length; i++) {
            if (this.estoque[i]==null) {
                estoque[i]=planta;
                break;
            }
        }
    }
    public void saidaNoEstoque(Planta planta){
        for (int i = 0; i < this.estoque.length; i++) {
            Planta item = this.estoque[i];
            if (item != null) {
                if (item.getNome().equals(nome)) {
                    item=null;
                    break;
                }
            }
        }
    }
}
