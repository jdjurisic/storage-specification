package exceptions.file;

public class CreateFileException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CreateFileException() {
		super("Greska dok se pravi file");
	}

}
