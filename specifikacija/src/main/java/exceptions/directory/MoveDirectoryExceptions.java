package exceptions.directory;

/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom premestanja direktorijuma.
 */
public class MoveDirectoryExceptions extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public MoveDirectoryExceptions() {
		
		super("Greska pri pomjeranju foldera");
	}

}
