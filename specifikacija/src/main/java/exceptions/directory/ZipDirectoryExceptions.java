package exceptions.directory;
/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom zipovanja direktorijuma.
 */
public class ZipDirectoryExceptions extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public ZipDirectoryExceptions() {

		super("Greska pri zipovanju foldera");
	}

}
