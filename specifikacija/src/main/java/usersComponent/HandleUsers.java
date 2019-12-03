package usersComponent;

/**
 * Komponenta zaduzena za rukovanje podacima o korisnicima.
 * @author Jovica
 *
 */
public interface HandleUsers {
	
	
	/**
	 * Pravi novi fajl sa podacima o korisnicima.
	 * @param path putanja na kojoj se kreira fajl.
	 */
	public void createNewUserDatabase(String path);
	
	/**
	 * Cita podatke o korisnicima sa zadate putanje.
	 * @param path putanja sa koje se citaju podaci o korisnicima.
	 */
	public UserDatabase readFromUserDatabase(String path);
	
	/**
	 * Po zavrsetku operativnog rada,cuva instancu baze korisnika u fajl na zadatoj putanji.
	 * @param  path putanja na kojoj se podaci cuvaju
	 * @param  ub konkretna baza podataka koju zelimo da sacuvamo.
	 */
	public void saveUserDatabase(String path,UserDatabase ub);
	
	
	

}
