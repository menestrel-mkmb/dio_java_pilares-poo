package places;

import equipaments.copier.Copiadora;
import equipaments.multifunction.Multifuncional;
import equipaments.scanner.Digitalizadora;
import equipaments.printer.Impressora;

public class Fabrica {
	public static void main(String[] args) {
		Multifuncional mfn = new Multifuncional();
		Impressora imp = mfn;
		Copiadora cop = mfn;
		Digitalizadora dig = mfn;
		
		imp.imprimir();
		cop.copiar();
		dig.escanear();
	}
}
