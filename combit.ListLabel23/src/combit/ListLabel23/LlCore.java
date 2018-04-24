package combit.ListLabel23;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NObject;

/**
 * This is strongly typed wrapper for Combit ListLabel control. This wrappers is
 * exposing only the key operartions required for this sample. You can extend
 * this class further to expose the strongly typed methods with signature
 * matching Combit API and forwarding the calls with Javonet.
 * 
 * @author combit
 */
public class LlCore {
	/**
	 * This property holds the reference to the .NET object associated with
	 * particular instance of this class. <br>
	 * <br>
	 * This is private property which by naming convention is detected by Javonet to
	 * resolve proper .NET instance while instances of this object are passed to
	 * .NET side. It is also used to forward the calls to .NET side.
	 */
	private NObject handle;

	public LlCore(ListLabel LL) {

		try {
			handle = LL.getHandle().get("Core");
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setParentHandle(java.awt.Component component) throws JavonetException {
		int windowHandle = combit.WinHelper.getWindowHandle(component);
		NObject intPtr = Javonet.New("IntPtr", windowHandle);
		handle.set("ParentHandle", intPtr);
	}

	public int getParentHandle() throws JavonetException {
		NObject intPtr = Javonet.New("IntPtr");
		intPtr = handle.get("ParentHandle");

		String callMethod = "ToInt32";
		String vmArch = System.getProperty("sun.arch.data.model");
		if (vmArch.compareTo("64") == 0)
			callMethod = "ToInt64";

		int result = intPtr.invoke(callMethod);

		return result;
	}
}