package usersComponent;

/**
 * Komponenta zaduzena za rukovanje podacima o korisnicima.
 * @author Jovica
 *
 */
public interface HandleUsers {
	
	
	/**
	 * Pravi novi fajl sa podacima o korisnicima.
	 * @param putanja na kojoj se kreira fajl.
	 */
	public void createNewUserDatabase(String path);
	
	/**
	 * Cita podatke o korisnicima sa zadate putanje.
	 * @param putanja sa koje se citaju podaci o korisnicima.
	 */
	public void readFromUserDatabase(String path);
	
	/**
	 * Po zavrsetku operativnog rada,cuva instancu baze korisnika u fajl na zadatoj putanji.
	 * @param putanja na kojoj se podaci cuvaju
	 * @param konkretna baza podataka koju zelimo da sacuvamo.
	 */
	public void saveUserDatabase(String path,UserDatabase ub);
	
	
	/**
	 * Dodaje novog korisnika,ukoliko ima privilegiju za pomenutu operaciju.
	 * @param Korisnik kojeg zelimo da dodamo u listu korisnika.
	 */
	public void addNewUser(User u);
	
	/**
	 * Brise korisnika iz baze,ako ima dozvolu za to(ukoliko operaciju poziva admin skladista).
	 * @param Korisnik kojeg zelimo da obrisemo iz liste korisnika.
	 */
	public void deleteUser(User u);

	/**
	 * Menja podatke o korisniku (username,password ili dozvole za operativni rad).
	 * @param Korisnik cije podatke menjamo.
	 */
	public void editUser(User u);

}
