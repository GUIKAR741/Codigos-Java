
package br.com.guikar.ufc.poo.hora.hora12.Q2;

import java.util.Scanner;

public class RegistroRecebimentos {
    private static Recebivel[] registros=new Recebivel[100];
    public static void main(String[] args) {
        int op;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Menu:");
            System.out.println("1-Adicionar Item Vendido");
            System.out.println("2-Adicionar Serviço Prestado");
            System.out.println("0-Sair");
            System.out.print("Digite a Opção:");
            op=sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    String nome;
                    int quantidade;
                    double preco;
                    System.out.print("Digite o Nome do Item:");
                    nome=sc.nextLine();
                    System.out.print("Digite a quantidade do Item:");
                    quantidade=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o Preço do Item:");
                    preco=sc.nextDouble();
                    sc.nextLine();
                    ItemVenda itemVenda=new ItemVenda(nome,quantidade,preco);
                    System.out.println("Valor da Receita: "+itemVenda.totalizarReceita());
                    setRegistros(itemVenda);
                    break;
                case 2:
                    String descricao;
                    int horas;
                    double precoHora;
                    System.out.print("Digite a Descrição do Serviço:");
                    descricao=sc.nextLine();
                    System.out.print("Digite a quantidade de Horas:");
                    horas=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o Preço da Hora:");
                    precoHora=sc.nextDouble();
                    sc.nextLine();
                    Servico servico=new Servico(descricao,horas,precoHora);
                    System.out.println("Valor da Receita: "+servico.totalizarReceita());
                    setRegistros(servico);
                    break;
            }
        }while (op!=0);
        for (int i = 0; i < registros.length; i++) {
            if(registros[i]!=null){
                System.out.println(registros[i].toString());
            }
        }
    }

    private static void setRegistros(Recebivel registros) {
        for (int i = 0; i < RegistroRecebimentos.registros.length; i++) {
            if(RegistroRecebimentos.registros[i]==null) {
                RegistroRecebimentos.registros[i] = registros;
                break;
            }
        }
    }
}
