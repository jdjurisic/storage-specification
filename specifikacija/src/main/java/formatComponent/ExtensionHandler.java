package formatComponent;

/**
 * Komponenta zaduzena za cuvanje podataka o nepozeljnim ekstenzijama,kao i za
 * rukovanje podacima o ekstenzijama.
 * @author Jovica
 *
 */
public interface ExtensionHandler {
	
	/**
	 * Prima putanju skladista i pravi json koji sluzi za cuvanje podataka o nedozvoljenim formatima.
	 * @param path Putanja na kojoj se kreira json.
	 */
	public void createNewExtensionsList(String path);
	
	
	/**
	 * Ucitava podatke o korisnicima.
	 * @param  path Putanja do jsona koji sadrzi podatke o ekstenzijama.
	 * @return Vraca listu formata ucitanu iz fajla.
	 */
	public ExtensionList readExtensions(String path);
	
	/**
	 * Metoda koja listu iz operativnog rada cuva na zadatoj putanji.
	 * @param path Putanja na kojoj se cuva fajl.
	 * @param fl Lista formata koju zelimo da sacuvamo.
	 */
	public void saveExtensions(String path,ExtensionList fl);
}
