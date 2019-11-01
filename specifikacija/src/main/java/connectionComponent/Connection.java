package connectionComponent;

/**
 * Komponenta odgovorna za povezivanje na skladiste,prekidanje veze sa skladistem,kao i kreaciju skladista.
 * @author Jovica
 *
 */
public interface Connection {

/**
 * Metoda koja kreira novo skladiste.
 * @param Putanja na kojoj se pravi skladiste.
 */
public void createNewStorage(String path);


/**
 * Metoda koja se koristi za povezivanje na skladiste.
 * @param Putanja do skladista.
 */
public void connectToStorage(String path);

/**
 * Prekida konekciju sa skladistem i obezbedjuje konzistentnost korisnickih podataka prilikom zatvaranja konekcije.
 * @param Putanja do skladista.
 */
public void disconnectFromStorage(String path);

}


