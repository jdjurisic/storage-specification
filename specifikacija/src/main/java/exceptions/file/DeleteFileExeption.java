package exceptions.file;
/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom brisanja fajla.
 */
public class DeleteFileExeption extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DeleteFileExeption() {
		super("Greska pri brisanju fijla");
	}

}
