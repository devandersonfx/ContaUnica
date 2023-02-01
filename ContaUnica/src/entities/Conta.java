package entities;

public class Conta {
	
	private int id;
	private String name;
	private double balance;
	static int qtdcontas;
	
	public Conta(String name) {
		this.name = name;
		this.id = id;
		qtdcontas++;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void dataAccount() {
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("--- Dados Banc�rios ---");
		System.out.println("- ID: " + id);
		System.out.println("- Nome: " + name);
		System.out.println("- Saldo: " + balance);
		System.out.println("-----------------------");
		System.out.println();
	}
	
	public void deposit(double deposito) {
		System.out.println();
		System.out.println("--- Realizando Dep�sito ---");
		System.out.printf("- Saldo Anterior: %.2f%n", balance);
		this.balance += deposito;
		System.out.printf("- Saldo Atualizado: %.2f%n", balance);
		System.out.println("--- Fim da Opera��o ---");
		System.out.println();
	}
	
	public void withDraw(double saque) {
		if (balance < saque) {
			System.out.println("--- Opera��o Inv�lida ---");
		} else {
			System.out.println();
			System.out.println("--- Realizando Saque ---");
			System.out.printf("- Saldo Anterior: %.2f%n", balance);
			this.balance -= saque;
			System.out.printf("- Saldo Atualizado: %.2f%n", balance);
			System.out.println("--- Fim da Opera��o ---");
			System.out.println();
		}
	}
	
}
