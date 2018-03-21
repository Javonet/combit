package combit.ListLabel23.DataProviders.DbCommandSetDataProvider;

import com.javonet.api.INEventListener;
import com.javonet.api.NObject;

public class ExecuteDbCommand implements INEventListener {
	private ExecuteDbCommandDelegate _event;

	public ExecuteDbCommand(ExecuteDbCommandDelegate event) {
		_event = event;
	}

	@Override
	public void eventOccurred(Object[] arguments) {
		ExecuteDbCommandEventArgs args = new ExecuteDbCommandEventArgs((NObject) arguments[1]);

		_event.ExecuteDbCommand(args);

		args.UpdateData();
	}
}