package exceptions.directory;

/**
 * Izuzetak koji se "baca" ukoliko dodje do greske priliko pravljenja direktorijuma.
 * @author Jovica
 *
 */
public class CreateDirectoryExceptions extends Exception {
	

	
private static final long serialVersionUID = 1L;
	
	public CreateDirectoryExceptions() {
		super("Greska dok se pravi folder");
	}

}
