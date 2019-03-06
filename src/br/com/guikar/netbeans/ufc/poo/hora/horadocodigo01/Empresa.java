package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo01;

public class Empresa {
    private String nome;
    private Cliente cliente[];
    private int tamanhoCliente=0;

    public Empresa() {
        super();
    }

    public Empresa(String nome,int numClientes) {
        setNome(nome);
        if(numClientes>0)
            cliente=new Cliente[numClientes];
    }

    public void setTotalCliente(int numClientes){
        if(numClientes>0)
            cliente=new Cliente[numClientes];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!=null)
            this.nome = nome;
    }

    public String mostrarClientes(){
        StringBuilder clientes=new StringBuilder();
        for(int i=0;i<cliente.length;i++){
            if(cliente[i]!=null){
                clientes.append("Cliente, ").append(cliente[i].getNome())
                        .append(", do sexo ").append(cliente[i].getSexo() == 'm' ? "masculino" : "feminino")
                        .append(", possui ").append(cliente[i].getIdade()).append(" anos").append("\n");
            }
        }
        return clientes.toString();
    }
    public boolean push(Cliente novoCliente){
        if(tamanhoCliente<cliente.length){
            cliente[tamanhoCliente]=novoCliente;
            tamanhoCliente++;
            return true;
        }
        return false;
    }
    public Cliente pop(){
        Cliente cli=cliente[tamanhoCliente-1];
        cliente[tamanhoCliente-1]=null;
        tamanhoCliente--;
        return cli;
    }
}
