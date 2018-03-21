package System.Drawing;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NObject;

public class SystemColors {
private static NObject handle;
	
	public SystemColors() {
		try {
			handle = Javonet.New(SystemColors.class.getName());
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public static NObject getWindow() {
		try {
			return Javonet.getType(SystemColors.class.getName()).get("Window");
		} catch (JavonetException e) {
			e.printStackTrace();
			return null;
		}
	}
}
