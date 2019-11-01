package usersComponent;

/**
 *	Klasa korisnik,koja sadrzi username i password korisnika.
 *	Kao i podatke o dozvolama za snimanje,preuzimanje i brisanje.
 *  @author jovicadjurisic
 */
public class User {
	
	private String username;
	private String password;
	
	private boolean glavniAdmin;
	private boolean dozvolaZaSnimanje;
	private boolean dozvolaZaBrisanje;
	private boolean dozvolaZaPreuzimanje;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isGlavniAdmin() {
		return glavniAdmin;
	}
	public void setGlavniAdmin(boolean glavniAdmin) {
		this.glavniAdmin = glavniAdmin;
	}
	public boolean isDozvolaZaSnimanje() {
		return dozvolaZaSnimanje;
	}
	public void setDozvolaZaSnimanje(boolean dozvolaZaSnimanje) {
		this.dozvolaZaSnimanje = dozvolaZaSnimanje;
	}
	public boolean isDozvolaZaBrisanje() {
		return dozvolaZaBrisanje;
	}
	public void setDozvolaZaBrisanje(boolean dozvolaZaBrisanje) {
		this.dozvolaZaBrisanje = dozvolaZaBrisanje;
	}
	public boolean isDozvolaZaPreuzimanje() {
		return dozvolaZaPreuzimanje;
	}
	public void setDozvolaZaPreuzimanje(boolean dozvolaZaPreuzimanje) {
		this.dozvolaZaPreuzimanje = dozvolaZaPreuzimanje;
	}
	public User(String username, String password, boolean glavniAdmin, boolean dozvolaZaSnimanje,
			boolean dozvolaZaBrisanje, boolean dozvolaZaPreuzimanje) {
		super();
		this.username = username;
		this.password = password;
		this.glavniAdmin = glavniAdmin;
		this.dozvolaZaSnimanje = dozvolaZaSnimanje;
		this.dozvolaZaBrisanje = dozvolaZaBrisanje;
		this.dozvolaZaPreuzimanje = dozvolaZaPreuzimanje;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", glavniAdmin=" + glavniAdmin
				+ ", dozvolaZaSnimanje=" + dozvolaZaSnimanje + ", dozvolaZaBrisanje=" + dozvolaZaBrisanje
				+ ", dozvolaZaPreuzimanje=" + dozvolaZaPreuzimanje + "]";
	}
	public User() {
		
	}
	
	
	
	
	
}
