package edu.example.race;

public class Moto extends Veiculo {
	String veiculo = "moto";
	
	public void ligar() {
		if(this.confereCambio() && this.confereCombustivel()) {
			System.out.println("Ligar " + veiculo);
		}
	}
	
	public void desligar() {
		System.out.println("Desligar " + veiculo);
	}
}

