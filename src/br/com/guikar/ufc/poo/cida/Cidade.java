package br.com.guikar.ufc.poo.cida;

public class Cidade {
    private String nome;
    private LeituraClima leituraCLima[][][]=new LeituraClima[100][12][31];
    private double somatorioTemp=0;
    private double qtdTemp=0;

    public String getNome() {
        return nome;
    }

    public Cidade(String nome) {
        if(nome!=null)
            this.nome = nome;
    }

    public void addLeitura(int dia,int mes, int ano, float tempMax,float temoMin){
        LeituraClima leitura=new LeituraClima(tempMax,temoMin);
        ano=ano-2000;
        somatorioTemp+=((tempMax+temoMin)/2);
        qtdTemp++;
        leituraCLima[ano][mes][dia]=leitura;
    }

    public String gerarRelatorio(int ano,int mes){
        StringBuilder relatorio= new StringBuilder();
        ano=ano-2000;
        for(int i=0;i<leituraCLima[ano][mes].length;i++){
            LeituraClima atual=leituraCLima[ano][mes][i];
            if(atual!=null){
                relatorio.append("Dia:").append(i).append("\nTemperatura Maxima:").append(atual.getTempMax()).append("\nTemperatura Minima:").append(atual.getTempMin()).append("\n");
            }
        }
        return relatorio.toString();
    }

    public double getTempMedia() {
        return qtdTemp==0?0:somatorioTemp / qtdTemp;
    }
}
