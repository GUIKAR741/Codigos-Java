package br.com.guikar.ufc.poo.hora.hora12.Q1;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        int op;
        double a;
        double b;
        OperacaoMatematica operacaoMatematica;
        do {
            System.out.println("Escolha uma opção abaixo e se quiser encerrar digite 0");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("0- Sair");
            System.out.print("Digite sua Escolha:");
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            if (op == 0) {
                System.out.println("Programa encerrado");
                break;
            }
            if (op < 0 || op > 4) {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println("Digite o valor de a");
            a = sc.nextDouble();
            System.out.println("Digite o valor de b");
            b = sc.nextDouble();
            if (op == 1)
                operacaoMatematica=new Soma();
            else if (op == 2)
                operacaoMatematica=new Subtracao();
            else if (op == 3)
                operacaoMatematica=new Multiplicacao();
            else
                operacaoMatematica=new Divisao();
            System.out.println("Resultado: "+operacaoMatematica.calcula(a,b));
        } while (op != 0);
    }
}