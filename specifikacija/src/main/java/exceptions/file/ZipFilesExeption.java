package exceptions.file;
/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom zipovanja fajla.
 */
public class ZipFilesExeption extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ZipFilesExeption() {

		super("Greska pri zipovanju fajla");
	}

}
