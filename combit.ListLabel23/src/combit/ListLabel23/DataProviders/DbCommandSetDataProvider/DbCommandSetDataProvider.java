package combit.ListLabel23.DataProviders.DbCommandSetDataProvider;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NObject;

import System.Data.OleDb.OleDbCommand;
import combit.ListLabel23.ListLabelActivation;

public class DbCommandSetDataProvider {
	private NObject handle;
	
	public DbCommandSetDataProvider() {
		try {
			handle = Javonet.New(DbCommandSetDataProvider.class.getPackage().getName());
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void attachExecuteDbCommand(ExecuteDbCommand event)
	{
		try {
		handle.addEventListener("ExecuteDbCommand", event);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void AddCommand(OleDbCommand command, String tableName) {
		try {
			handle.invoke("AddCommand",command,tableName);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void AddCommand(OleDbCommand command, String tableName, String identifierDelimiterFormat, String parameterMarkerFormat) {
		try {
			handle.invoke("AddCommand",command,tableName,identifierDelimiterFormat,parameterMarkerFormat);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	static {
		ListLabelActivation.initializeJavonet();
	}
}
