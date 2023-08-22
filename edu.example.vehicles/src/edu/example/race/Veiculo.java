package edu.example.race;

public abstract class Veiculo {
	private String chassi;
	
	protected boolean confereCombustivel() {
		return true;
	}
	
	protected boolean confereCambio() {
		return true;
	}
	
	public void acelerar() {
		System.out.println("Acelerando carro");
	}
	
	public void frear() {
		System.out.println("Freando carro");
	}
	
	public String getChassi() {
		return this.chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public abstract void ligar();
	public abstract void desligar();
}
