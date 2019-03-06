
package br.com.guikar.ufc.poo.hora.hora11.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int op;
        double a;
        double b;
        OperacaoMatematica operacao = null;
        do{
            System.out.println("Escolha uma opção abaixo e se quiser encerrar digite 0");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            if(op==0){
                System.out.println("Programa encerrado");
                break;
            }
            if(op < 0 || op >4){
                System.out.println("Opção inválida");
                break;
            }
            System.out.println("Digite o valor de a");
            a = sc.nextDouble();
            System.out.println("Digite o valor de b");
            b = sc.nextDouble();
            switch(op){
                case 1:
                    operacao=new Soma();
                    break;
                case 2:
                    operacao=new Subtracao();
                    break;
                case 3:
                    operacao=new Multiplicacao();
                    break;
                case 4:
                    operacao=new Divisao();
                    break;
            }
            System.out.println("Resultado: "+operacao.calcula(a,b));
        }while(op!=0);
    }
    
}
