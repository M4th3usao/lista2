package ex2;

public class Cliente {
	private String nome;
	private double limite, saldo, verifica;
	
	public Cliente(String nome, double limite, double saldo) {
		this.nome = nome;
		this.limite = limite;
		this.saldo = saldo;	
	}

	public String getNome() {
		return nome;
	}

	public double getLimite() {
		return limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double val) {
		if (verifica >= val) {
			saldo = saldo - val;
		}else {
			System.out.println("Seu saldo é insulficiente!");
		}
	}
	
	public void depositar(double val) {
		saldo = saldo + val;
	}
	
	public double verificarSaldo() {
		verifica = saldo + limite;
		return verifica;
	}
	
	public void exibirDados() {
		System.out.println("==+==+==+==Dados==+==+==+==+");
		System.out.println("Cliente: " + nome);
		System.out.println("Saldo atual: " + saldo);
		System.out.println("Limite atual: " + limite);
		System.out.println("==+==+==+==+==+==+==+==+==+");
	}
}
