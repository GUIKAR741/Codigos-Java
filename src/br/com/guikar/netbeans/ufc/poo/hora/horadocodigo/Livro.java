package br.com.guikar.netbeans.ufc.poo.hora.horadocodigo;

public class Livro {
    private String nome;
    private String edicao;
    private String autor;
    private int ano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length()>5)
            this.nome = nome;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        if(edicao.length()>5)
            this.edicao = edicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor.length()>5)
            this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano>0)
            this.ano = ano;
    }
}
