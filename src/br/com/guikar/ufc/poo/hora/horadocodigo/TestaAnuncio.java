package br.com.guikar.ufc.poo.hora.horadocodigo;

import java.util.Scanner;

public class TestaAnuncio {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Digite o nome do anunciante:");
        String nome;
        nome=s.nextLine();
        Anunciante anunciante=new Anunciante(nome);
        System.out.print("Digite o numero do telefone1:");
        anunciante.setTelefone01(s.nextLine());
        System.out.print("Quer colocar outro telefone?sim ou nao ");
        String outroTel;
        outroTel=s.nextLine();
        if(outroTel.equals("sim")) {
            System.out.print("Digite o numero do telefone2:");
            anunciante.setTelefone02(s.nextLine());
        }
        Anuncio anuncio=new Anuncio(anunciante);
        System.out.print("Digite o Titulo do Anuncio:");
        anuncio.setTitulo(s.nextLine());
        System.out.print("Digite o Texto do Anuncio:");
        anuncio.setTexto(s.nextLine());
        System.out.print("Tem Imagem:Sim ou nao ");
        String temImagem;
        temImagem=s.nextLine();
        if(temImagem.equals("sim")){
            System.out.print("Digite o nome da Imagem:");
            anuncio.setImagem(s.nextLine());
        }
        anuncio.exibeConteudo();
    }
}
