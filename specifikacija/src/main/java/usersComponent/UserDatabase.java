package usersComponent;

import java.util.ArrayList;


/**
 * @author jovicadjurisic
 *	Klasa u kojoj se cuva lista korisnika.
 */
public class UserDatabase {
	private ArrayList<User> users = new ArrayList<User>();

	public ArrayList<User> getUsers() {
		return users;
	}
	
	
	

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}




	public UserDatabase(ArrayList<User> users) {
		super();
		this.users = users;
	}

	public UserDatabase() {
		
	}
	
	
}
