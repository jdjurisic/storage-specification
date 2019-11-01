package exceptions.file;


/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom promene imena fajla.
 */
public class RenameFileExeption extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RenameFileExeption() {
		super("Greska pri promjeni imena file");
	}
	
	

}
