package Microsoft.Win32;

import com.javonet.JavonetException;
import com.javonet.api.NObject;

public class RegistryKey {
	private NObject handle;
	
	RegistryKey(NObject handle) {
		this.handle=handle;
	}
	
	public Object GetValue(String name, Object defaultValue) {
		try {
			return this.handle.invoke("GetValue",name,defaultValue);
		} catch (JavonetException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public RegistryKey CreateSubKey(String subkey) {
		try {
			return new RegistryKey(this.handle.invoke("CreateSubKey",subkey));
		} catch (JavonetException e) {
			e.printStackTrace();
			return null;
		}
	}
}
