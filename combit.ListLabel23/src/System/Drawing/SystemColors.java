package System.Drawing;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NObject;
import com.javonet.api.NType;

public class SystemColors {
	@SuppressWarnings("unused")
	private static NObject handle;
	private static NType typeHandle;
	
	public SystemColors() {
		try {
			handle = Javonet.New(SystemColors.class.getName());
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public static Color getWindow() {
		try {
			return new Color(typeHandle.get("Window"));
		} catch (JavonetException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	static {
		try {
			typeHandle = Javonet.getType(SystemColors.class.getName());
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
}
