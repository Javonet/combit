package combit.ListLabel23.Events;

import com.javonet.api.INEventListener;
import com.javonet.api.NObject;

public class AutoDefineField implements INEventListener {
	private AutoDefineFieldDelegate _event;

	public AutoDefineField(AutoDefineFieldDelegate event) {
		_event = event;
	}

	@Override
	public void eventOccurred(Object[] arguments) {
		AutoDefineElementEventArgs args = new AutoDefineElementEventArgs((NObject) arguments[1]);

		_event.AutoDefineField(args);

		args.UpdateData();
	}
}