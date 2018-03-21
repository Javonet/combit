package combit.ListLabel23.ListLabelPreviewControl;

import com.javonet.api.NObject;
import com.javonet.JavonetException;

public class ButtonPressCommandEventArgs {
	NObject argumentsHandle;
	public int buttonID;
	public boolean ignore;

	public ButtonPressCommandEventArgs(NObject arguments) {
		try {
			// get all getter-properties from event arguments
			argumentsHandle = arguments;
			buttonID = argumentsHandle.get("ButtonID");
			ignore = argumentsHandle.get("Ignore");
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void UpdateData() {
		try {
			// set/write all setter-properties back to the arguments
			argumentsHandle.set("Ignore", ignore);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
}
