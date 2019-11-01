package usersComponent;

/**
 * Komponenta zaduzena za rukovanje podacima o korisnicima.
 * @author Jovica
 *
 */
public interface HandleUsers {
	
	
	/**
	 * Pravi novi fajl sa podacima o korisnicima.
	 * @param path
	 */
	public void createNewUserDatabase(String path);
	
	/**
	 * Cita podatke o korisnicima sa zadate putanje.
	 * @param path
	 */
	public void readFromUserDatabase(String path);
	
	/**
	 * Po zavrsetku operativnog rada,cuva instancu baze korisnika u fajl na zadatoj putanji.
	 * @param path
	 * @param ub
	 */
	public void saveUserDatabase(String path,UserDatabase ub);
	
	
	/**
	 * Dodaje novog korisnika,ukoliko ima privilegiju za pomenutu operaciju.
	 * @param u
	 */
	public void addNewUser(User u);
	
	/**
	 * Brise korisnika iz baze,ako ima dozvolu za to(ukoliko operaciju poziva admin skladista).
	 * @param u
	 */
	public void deleteUser(User u);

	/**
	 * Menja podatke o korisniku (username,password ili dozvole za operativni rad).
	 * @param u
	 */
	public void editUser(User u);

}
