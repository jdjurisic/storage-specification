package exceptions.directory;
/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom brisanja direktorijuma.
 */
public class DeleteDirectoryExceptions extends Exception {
	

	private static final long serialVersionUID = 1L;
	
	public DeleteDirectoryExceptions() {
		super("Greska pri brisanju direktorijuma");
	}

}
