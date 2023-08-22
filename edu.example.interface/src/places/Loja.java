package places;

import equipaments.copier.Copiadora;
import equipaments.multifunction.Multifuncional;
import equipaments.scanner.Digitalizadora;
import equipaments.printer.Impressora;

public class Loja {
	public static void main(String[] args) {
		Impressora imp = new Multifuncional();
		Copiadora cop = new Multifuncional();
		Digitalizadora dig = new Multifuncional();
		
		imp.imprimir();
		cop.copiar();
		dig.escanear();
	}
}
