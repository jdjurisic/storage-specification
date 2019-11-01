package exceptions.file;

/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom kreiranja fajla.
 */
public class CreateFileException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CreateFileException() {
		super("Greska dok se pravi file");
	}

}
