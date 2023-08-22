package edu.example.race;

public class Carro extends Veiculo {
	String veiculo = "carro";
	
	public void ligar() {
		if(this.confereCambio() && this.confereCombustivel()) {
			System.out.println("Ligar " + veiculo);
		}
	}
	
	public void desligar() {
		System.out.println("Desligar " + veiculo);
	}
}
