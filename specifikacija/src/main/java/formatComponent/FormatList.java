package formatComponent;
import java.util.ArrayList;


/**
 * Klasa koja cuva listu formata koje ne prihvatamo u skladistu.
 * @author Jovica
 *
 */
public class FormatList {
	private ArrayList<String> formatList = new ArrayList<String>();

	public FormatList(ArrayList<String> formatList) {
		super();
		this.formatList = formatList;
	}

	public FormatList() {
		super();
	}

	public ArrayList<String> getFormatList() {
		return formatList;
	}

	public void setFormatList(ArrayList<String> formatList) {
		this.formatList = formatList;
	}
	
	
}
