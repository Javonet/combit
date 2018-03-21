package combit.ListLabel23.Events;

import com.javonet.api.NObject;
import com.javonet.JavonetException;

public class AutoDefineElementEventArgs {
	NObject argumentsHandle;
	public String name;
	public Boolean suppress;
	public Boolean isDesignMode;
	public int progressPercentage;

	public AutoDefineElementEventArgs(NObject arguments) {
		try {
			// get all getter-properties from event arguments
			argumentsHandle = arguments;
			name = argumentsHandle.get("Name");
			suppress = argumentsHandle.get("Suppress");
			isDesignMode = argumentsHandle.get("IsDesignMode");
			progressPercentage = argumentsHandle.get("ProgressPercent");
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void UpdateData() {
		try {
			// set/write all setter-properties back to the arguments
			argumentsHandle.set("Suppress", suppress);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
}