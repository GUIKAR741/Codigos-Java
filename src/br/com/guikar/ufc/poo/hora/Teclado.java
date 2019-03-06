package br.com.guikar.ufc.poo.hora;

import java.util.Scanner;  // É necessário fazer importação da classe Scanner

public class Teclado {
	public static void main(String[] args) {
		// declaração de variáveis locais
		String nome;
		int idade;
		float altura;
		String cpf;
		
		Scanner sc = new Scanner(System.in); // instancia um objeto do tipo Scanner
		
		System.out.println("Digite o nome completo: ");
		nome = sc.nextLine(); // insere uma palavra composta na variavel
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt(); // insere um numero inteiro na variavel
		
		System.out.println("Digite a altura: ");
		altura = sc.nextFloat(); // insere um numero decimal na variavel
		
		System.out.println("Digite o CPF: ");
		cpf = sc.next(); // insere um palavra simples(sem espacos) na variavel
		
		System.out.println("Nome: "+nome+"\nCPF: "+cpf+"\nIdade: "+idade+"\nAltura: "+altura);
	}
}
