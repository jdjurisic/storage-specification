package formatComponent;

/**
 * Komponenta zaduzena za cuvanje podataka o nepozeljnim ekstenzijama,kao i za
 * rukovanje podacima o ekstenzijama.
 * @author Jovica
 *
 */
public interface FormatHandler {
	
	/**
	 * Prima putanju skladista i pravi json koji sluzi za cuvanje podataka o nedozvoljenim formatima.
	 * @param Putanja na kojoj se kreira json.
	 */
	public void createNewFormatList(String path);
	
	
	/**
	 * Ucitava podatke o korisnicima.
	 * @param Putanja do jsona koji sadrzi podatke o ekstenzijama.
	 * @return Vraca listu formata ucitanu iz fajla.
	 */
	public FormatList readFormats(String path);
	
	/**
	 * Metoda koja listu iz operativnog rada cuva na zadatoj putanji.
	 * @param Putanja na kojoj se cuva fajl.
	 * @param Lista formata koju zelimo da sacuvamo.
	 */
	public void saveFormats(String path,FormatList fl);
}
