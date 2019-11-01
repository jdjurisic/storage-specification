package exceptions.directory;
/**
 *  Izuzetak koji se "baca" ukoliko dodje do greske pretrage direktorijuma.
 */
public class SearchDirectoryExceptions extends Exception {

	private static final long serialVersionUID = 1L;
	
	
	public SearchDirectoryExceptions() {
		
		super("Greska pri pretrazi foldera");
	}
	
	

}
