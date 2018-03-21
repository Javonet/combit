package combit.ListLabel23.ListLabelPreviewControl;

import com.javonet.api.INEventListener;
import com.javonet.api.NObject;

public class ButtonPressCommand implements INEventListener {
	private ButtonPressCommandDelegate _event;

	public ButtonPressCommand(ButtonPressCommandDelegate event) {
		_event = event;
	}

	@Override
	public void eventOccurred(Object[] arguments) {
		ButtonPressCommandEventArgs args = new ButtonPressCommandEventArgs((NObject) arguments[1]);

		_event.ButtonPressCommand(args);

		args.UpdateData();
	}
}