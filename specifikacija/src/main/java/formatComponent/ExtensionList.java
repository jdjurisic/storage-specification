package formatComponent;
import java.util.ArrayList;


/**
 * Klasa koja cuva listu formata koje ne prihvatamo u skladistu.
 * @author Jovica
 *
 */
public class ExtensionList {
	private ArrayList<String> extensionList = new ArrayList<String>();

	public ExtensionList(ArrayList<String> formatList) {
		super();
		this.extensionList = formatList;
	}

	public ExtensionList() {
		super();
	}

	public ArrayList<String> getExtensionList() {
		return extensionList;
	}

	public void setExtensionList(ArrayList<String> extensionList) {
		this.extensionList = extensionList;
	}
	
	

	
	
	
}
