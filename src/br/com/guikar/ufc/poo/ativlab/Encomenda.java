package br.com.guikar.ufc.poo.ativlab;

public class Encomenda {
    private float altura;
    private float largura;
    private float precoSinal;
    private float precoServico;
    private String frase;
    private String corPlaca;
    private String corFrase;
    private String dataEntrega;
    private Cliente cliente;

    private boolean validaCorPlaca(String cor){
        return cor.toLowerCase().equals("branca") || cor.toLowerCase().equals("cinza");
    }
    private boolean validaCorFrase(String cor){
        return cor.toLowerCase().equals("azul") || cor.toLowerCase().equals("vermelho") ||
                cor.toLowerCase().equals("amarelo") || cor.toLowerCase().equals("preto") ||
                cor.toLowerCase().equals("verde");
    }

    public Encomenda(Cliente cliente,float altura, float largura, String frase, String corPlaca, String corFrase, String dataEntrega) {
        if(cliente!=null)
            this.cliente = cliente;
        if(altura>0)
            this.altura = altura;
        if(largura>0)
            this.largura = largura;
        if(frase.length()>5)
            this.frase = frase;
        if(validaCorPlaca(corPlaca))
            this.corPlaca = corPlaca;
        if(validaCorFrase(corFrase))
            this.corFrase = corFrase;
        if(dataEntrega.length()>8)
            this.dataEntrega = dataEntrega;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargura() {
        return largura;
    }

    public String getFrase() {
        return frase;
    }

    public String getCorPlaca() {
        return corPlaca;
    }

    public String getCorFrase() {
        return corFrase;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }
    private float calculaCusto(){
        float area=altura*largura;
        return area*147.30f;
    }
    private float calcularCustoDesenho(){
        int numLetras=frase.length();
        return numLetras*0.32f;
    }
    private void valorPlaca(){
        this.precoServico=calculaCusto()+calcularCustoDesenho();
        this.precoSinal=this.precoServico*0.5f;
    }
    public void gerarVia(){
        valorPlaca();
        System.out.println("----------------------------------");
        System.out.println("Via Empresa:");
        System.out.println("Placa");
        System.out.println("Altura:"+altura+" Largura:"+largura);
        System.out.println("Cor Placa:"+corPlaca);
        System.out.println("Frase:"+frase);
        System.out.println("Cor Frase:"+corFrase);
        System.out.printf("Preço Servico:R$ %.2f\n",precoServico);
        System.out.printf("Preço Sinal: R$ %.2f\n",precoSinal);
        System.out.println("Cliente");
        System.out.println("Nome:"+cliente.getNome());
        System.out.println("Telefone:"+cliente.getTelefone());
        System.out.println("----------------------------------");
        System.out.println("Via Cliente:");
        System.out.println("Placa");
        System.out.println("Altura:"+altura+" Largura:"+largura);
        System.out.println("Cor Placa:"+corPlaca);
        System.out.println("Frase:"+frase);
        System.out.println("Cor Frase:"+corFrase);
        System.out.printf("Preço Servico:R$ %.2f\n",precoServico);
        System.out.printf("Preço Sinal: R$ %.2f\n",precoSinal);
        System.out.println("Cliente");
        System.out.println("Nome:"+cliente.getNome());
        System.out.println("Telefone:"+cliente.getTelefone());

    }
}
