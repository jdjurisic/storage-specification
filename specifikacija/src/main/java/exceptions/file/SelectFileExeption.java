package exceptions.file;

/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom selektovanja fajla.
 */
public class SelectFileExeption extends Exception {

	private static final long serialVersionUID = 1L;
	
	public SelectFileExeption() {
		super("GReska pri selektovanju fajla");
	}
	
	
	

}
