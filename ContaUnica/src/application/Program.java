package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int response;
		System.out.print("Digite o nome do titular: ");
		String name = sc.nextLine();
		
		Conta c1 = new Conta(name);
		
		System.out.print("Cadastre um ID para a conta: ");
		int id = sc.nextInt();
		c1.setId(id);
		
		c1.dataAccount();
		
		do {
			System.out.println();
			System.out.println("--- MENU ---");
			System.out.println("1) Dados Bancários");
			System.out.println("2) Depositar");
			System.out.println("3) Sacar");
			System.out.println("0) Sair");
			System.out.println("------------");
			System.out.println();
			
			System.out.print("Digite sua opção: ");
			response = sc.nextInt();
			
			switch (response) {
			case 1:
				c1.dataAccount();
				break;
			case 2:
				System.out.print("Digite o valor a ser depositado: ");
				double deposito = sc.nextDouble();
				c1.deposit(deposito);
				System.out.println();
				break;
			case 3:
				System.out.println("Digite o valor a ser sacado: ");
				double saque = sc.nextDouble();
				c1.withDraw(saque);
				System.out.println();
				break;
			case 0:
				System.out.println("--- Fim da Operação ---");
				System.out.println();
				continue;
			default:
				System.out.println("--- Opção Inválida ---");
				System.out.println();
				break;
			}			
		} while(response != 0);
		
		sc.close();
	}

}
