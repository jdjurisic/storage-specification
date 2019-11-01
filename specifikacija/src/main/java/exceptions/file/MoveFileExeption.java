package exceptions.file;
/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom premestanja fajla.
 */
public class MoveFileExeption extends Exception {


	private static final long serialVersionUID = 1L;
	
	public MoveFileExeption() {
		
		super("Greska pri pomjeranju fajla");
	}
	
	

}
