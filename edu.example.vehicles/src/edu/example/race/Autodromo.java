package edu.example.race;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("ch340");
		
		Moto z400 = new Moto();
		z400.setChassi("mt1010");
		
		Veiculo coringa = jeep;
		coringa.ligar();
		
		coringa = z400;
		coringa.ligar();
	}
}
