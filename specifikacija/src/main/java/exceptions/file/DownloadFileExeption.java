package exceptions.file;
/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom preuzimanja fajla.
 */
public class DownloadFileExeption extends Exception {

	private static final long serialVersionUID = 1L;

	public DownloadFileExeption() {
		super("Greska pri skidanju fajla");
		
	}

	

}
