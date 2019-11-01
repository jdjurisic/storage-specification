package exceptions.file;
/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom upload-a fajla.
 */
public class UploadFileExeption extends Exception {

	private static final long serialVersionUID = 1L;

	public UploadFileExeption() {
		super("Greska pri postavljanju file");
	}

}
