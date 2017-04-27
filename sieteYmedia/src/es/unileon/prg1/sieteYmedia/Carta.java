package es.unileon.prg1.sieteYmedia;

public class Carta {
private int numero;
private Palo palo;

public Carta(int numero, Palo palo) throws SieteYmediaException{
	if (numero <1 || numero > 10) {
		throw new SieteYmediaException("Carta - Numero " + numero +" no valido. Debe estar entre 1 y 10");
	}else {
		this.
	}
}
}
