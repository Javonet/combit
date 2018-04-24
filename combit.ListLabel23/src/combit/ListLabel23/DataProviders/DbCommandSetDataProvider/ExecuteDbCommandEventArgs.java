package combit.ListLabel23.DataProviders.DbCommandSetDataProvider;

import com.javonet.api.NObject;
import com.javonet.JavonetException;

public class ExecuteDbCommandEventArgs {
	NObject argumentsHandle;
	private DbCommand command;

	public ExecuteDbCommandEventArgs(NObject arguments) {
		try {
			// get all getter-properties from event arguments
			argumentsHandle = arguments;
			command = new DbCommand(argumentsHandle.get("Command"));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public DbCommand getCommand()
	{
		return command;
	}
	
	public void UpdateData() {
		try {
			// set/write all setter-properties back to the arguments
			argumentsHandle.set("Command", command);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public class DbCommand {
		private NObject handle;
		
		public DbCommand(NObject handle) {
			this.handle = handle;
		}
		
		public String getCommandText()
		{
			String commandText = "";
			try {
				commandText = handle.get("CommandText");
			} catch (JavonetException e) {
				e.printStackTrace();
			}
			return commandText;
		}
		
		public void setCommandText(String commandText)
		{
			try{
			handle.set("CommandText", commandText);
			} catch (JavonetException e) {
				e.printStackTrace();
			}
		}
	}
}
