package br.com.guikar.ufc.poo.cida;

import java.util.Scanner;

public class TestaCidade {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Digite o nome da cidade:");
        Cidade cidade=new Cidade(s.nextLine());
        int opcao;
        do {
            System.out.print("O que deseja Fazer:\n1-Leitura do clima\n2-Imprimir Relatorio" +
                    "\n3-Temperatura Media" +
                    "\n4-Sair" +
                    "\nescolha uma opção:");
            opcao=s.nextInt();
            s.nextLine();
            if(opcao==1) {
                float tempMax, tempMin;
                int dia, mes, ano;
                System.out.print("Digite o Dia:");
                dia = s.nextInt();
                s.nextLine();
                System.out.print("Digite o Mes:");
                mes = s.nextInt();
                s.nextLine();
                System.out.print("Digite o Ano:");
                ano = s.nextInt();
                s.nextLine();
                System.out.print("Digite o Temperatura Maxima:");
                tempMax = s.nextFloat();
                s.nextLine();
                System.out.print("Digite o Temperatura Minima:");
                tempMin = s.nextFloat();
                s.nextLine();
                cidade.addLeitura(dia, mes, ano, tempMax, tempMin);
            }else if(opcao==2){
                int mes, ano;
                System.out.print("Digite o Ano:");
                ano = s.nextInt();
                s.nextLine();
                System.out.print("Digite o Mes:");
                mes = s.nextInt();
                s.nextLine();
                String relatorio=cidade.gerarRelatorio(ano,mes);
                System.out.println("\n"+relatorio);
            }else if(opcao==3){
                System.out.println("Cidade:"+cidade.getNome()+"\nTemperatura Media:"+cidade.getTempMedia());
            }
        }while(opcao!=4);
    }
}