package br.com.aula02.app;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String mensagem = "Digite um numero";
		
		System.out.print(mensagem);
		
		System.out.println("***********************************");
		System.out.println("CALCULADORA");
		System.out.println("***********************************");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("***********************************");
		System.out.println("Qual operação Deseja realizar? ");
		int opcao = teclado.nextInt();
		
		if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
			if (opcao == 1) {
			
				System.out.println("Digite o primeiro numero para adição: ");
				int numero = teclado.nextInt();
			
				System.out.println("Digite outro numero: ");
				int numero2 = teclado.nextInt();
			
				int adicao = numero + numero2;
			
				System.out.println("a adição é igual a: " + adicao);
				
			}
			
			if (opcao == 2) {
			
				System.out.println("Digite o primeiro numero para a subtração: ");
				int sub = teclado.nextInt();
				
				System.out.println("Digite outro numero: ");
				int sub2 = teclado.nextInt();
				
				int subtracao = sub - sub2;
				
				System.out.println("a subtração é igual a: " + subtracao);
				
			
			}
		
			if (opcao == 3) {
			
				System.out.println("Digite o primeiro numero para a multiplicação: ");
				int mult = teclado.nextInt();
				
				System.out.println("Digite outro numero: ");
				int mult2 = teclado.nextInt();
				
				int multiplicacao = mult * mult2;
				
				System.out.println("a multiplicação é igual a: " + multiplicacao);
				
				
			
			}
		
			if(opcao == 4) {
				System.out.println("Digite o primeiro numero para a divisão: ");
				float div = teclado.nextInt();
				
				System.out.println("Digite outro numero: ");
				float div2 = teclado.nextInt();
				
				float divisao = div / div2;
				
				System.out.println("a divisão é igual a: " + divisao);
			}
		}else {
			System.out.println("Opção Invalida");
		}
	}

}
