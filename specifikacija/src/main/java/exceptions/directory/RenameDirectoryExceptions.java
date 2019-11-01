package exceptions.directory;
/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske prilikom izmene imena direktorijuma.
 */
public class RenameDirectoryExceptions extends Exception {
	

	private static final long serialVersionUID = 1L;
	
	public RenameDirectoryExceptions() {

		super("Greska pri promjeni imena foldera");
	}
	

}
