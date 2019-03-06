package br.com.guikar.netbeans.ufc.poo.hora.hora09.Q1;
public class Funcionario extends Pessoa{
    private String codigoFuncionario;
    private Ingresso[] ingressos;
    private Caixa caixa;
    public Funcionario() {
        super();
    }
    public Funcionario(String codigoFuncionario, Ingresso[] ingressos, Caixa caixa, String nome, String sexo) {
        super(nome, sexo);
        setCodigoFuncionario(codigoFuncionario);
        setIngressos(ingressos);
        setCaixa(caixa);
    }
    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }
    public void setCodigoFuncionario(String codigoFuncionario) {
        if(codigoFuncionario!=null)
            this.codigoFuncionario = codigoFuncionario;
    }
    public Ingresso[] getIngressos() {
        return ingressos;
    }
    public void setIngressos(Ingresso[] ingressos) {
        this.ingressos = ingressos;
    }
    public Caixa getCaixa() {
        return caixa;
    }
    public void setCaixa(Caixa caixa) {
        if(caixa != null)
            this.caixa = caixa;
    }
    public void acao(Cliente cliente){
        int contaFilme=0;
        for(int i=0;i<ingressos.length;i++){
            if(ingressos[i].getDescricaoFilme().equalsIgnoreCase(cliente.getNomeFilme())){
                if(cliente.getDinheiro() >= ingressos[i].getPreco()){
                    ingressos[i].setQuantidade(ingressos[i].getQuantidade()-1);
                    caixa.setLucro(caixa.getLucro()+ingressos[i].getPreco());
                    cliente.setIngresso(ingressos[i]);
                    cliente.acao();
                }else{
                    System.out.println("Dinheiro insuficiente");
                }
            }else{
                contaFilme++;
            }
        }
        if(contaFilme==ingressos.length){
            System.out.println("Filme não encontrado");
        }
    }
}
