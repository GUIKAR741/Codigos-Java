package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo;

public class Anuncio {
    private Anunciante anunciante;
    private float preco;
    private String titulo;
    private String texto;
    private String imagem;

    public Anuncio(Anunciante anunciante) {
        this.anunciante = anunciante;
    }

    public void setTitulo(String titulo) {
        if(titulo!=null)
            this.titulo = titulo;
    }

    public void setTexto(String texto) {
        if(texto.length()>0 && texto.length()<=150) {
            this.texto = texto;
            if(texto.length()<=60)
                this.preco=2.0f;
            else
                this.preco=5.0f;
        }
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
        this.preco=5.0f;
    }
    public void exibeConteudo(){
        String telefone="";
        if(anunciante.getTelefone01()!=null)
            telefone+=anunciante.getTelefone01()+" ";
        if(anunciante.getTelefone02()!=null)
            telefone+=anunciante.getTelefone02()+" ";
        System.out.println("Titulo:"+titulo+"\nTexto:"+texto+"\nNome do Anunciante:"+anunciante.getNome()+
                "\nTelefones:"+telefone+"\nPreco:"+preco);
    }
}
