package connectionComponent;

import formatComponent.ExtensionHandler;
import formatComponent.ExtensionList;
import model.MyPath;
import usersComponent.User;
import usersComponent.UserDatabase;

/**
 * Komponenta odgovorna za povezivanje na skladiste,prekidanje veze sa skladistem,kao i kreaciju skladista.
 * @author Jovica
 *
 */
public interface Connection {

/**
 * Metoda koja kreira novo skladiste.
 * @param path putanja do skladista.
 */
public void createNewStorage(String path);


/**
 * Metoda koja se koristi za povezivanje na skladiste.
 */
public void connectToStorage();

/**
 * Prekida konekciju sa skladistem i obezbedjuje konzistentnost korisnickih podataka prilikom zatvaranja konekcije.
 * 
 */
public void disconnectFromStorage();


public MyPath getMyPath();

public UserDatabase getUsers();

public ExtensionList getExtension();

public User getLogin();

}


