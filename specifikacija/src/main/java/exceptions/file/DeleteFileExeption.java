package exceptions.file;

public class DeleteFileExeption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DeleteFileExeption() {
		super("Greska pri brisanju fijla");
	}

}
