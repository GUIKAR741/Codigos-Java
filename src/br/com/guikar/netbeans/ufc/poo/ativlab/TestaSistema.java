package br.com.guikar.netbeans.ufc.poo.ativlab;

import java.util.Scanner;

public class TestaSistema {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String nome,telefone,frase,corFrase,corPlaca,dataEntrega;
        float altura,largura;
        System.out.print("Digite o nome do Cliente:");
        nome=s.nextLine();
        System.out.print("Digite o numero do Cliente:");
        telefone=s.nextLine();
        Cliente cliente=new Cliente(nome,telefone);
        System.out.print("Digite a altura da Placa:");
        altura=s.nextFloat();
        System.out.print("Digite a largura da Placa:");
        largura=s.nextFloat();
        s.nextLine();
        System.out.print("Digite a cor da Placa:branca ou cinza ");
        corPlaca=s.nextLine();
        System.out.print("Digite a frase da Placa:");
        frase=s.nextLine();
        System.out.print("Digite a cor da Frase:azul ou vermelho ou amarelo ou preto ou verde ");
        corFrase=s.nextLine();
        System.out.print("Digite a data de entrega da Placa:");
        dataEntrega=s.nextLine();
        Encomenda encomenda=new Encomenda(cliente,altura,largura,frase,corPlaca,corFrase,dataEntrega);
        encomenda.gerarVia();
    }
}
