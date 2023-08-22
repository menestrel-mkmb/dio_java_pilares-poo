package equipaments.multifunction;

import equipaments.copier.Copiadora;
import equipaments.printer.Impressora;
import equipaments.scanner.Digitalizadora;

public class Multifuncional implements Copiadora, Impressora, Digitalizadora{

	@Override
	public void escanear() {
		System.out.println("Escaneando na multifuncional");
	}

	@Override
	public void imprimir() {
		sentirPressa();
		System.out.println("Imprimindo na multifuncional");
	}

	@Override
	public void copiar() {
		System.out.println("Copiando na multifuncional");
	}
	
	private void sentirPressa() {
		darProblema();
	}
	
	private void darProblema() {
		System.out.println("Algum erro aconteceu, tentando imprimir para gastar mais tinta");
	}
	
}
