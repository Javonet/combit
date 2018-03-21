package combit.ListLabel23.Events;

import com.javonet.api.INEventListener;
import com.javonet.api.NObject;

public class AutoDefineVariable implements INEventListener {
	private AutoDefineVariableDelegate _event;

	public AutoDefineVariable(AutoDefineVariableDelegate event) {
		_event = event;
	}

	@Override
	public void eventOccurred(Object[] arguments) {
		AutoDefineElementEventArgs args = new AutoDefineElementEventArgs((NObject) arguments[1]);

		_event.AutoDefineVariable(args);

		args.UpdateData();
	}
}