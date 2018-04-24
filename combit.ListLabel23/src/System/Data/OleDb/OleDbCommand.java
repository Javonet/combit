package System.Data.OleDb;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NObject;

public class OleDbCommand {
	@SuppressWarnings("unused")
	private NObject handle;
	
	public OleDbCommand(String command, OleDbConnection connection) {
		try {
			handle = Javonet.New(OleDbCommand.class.getName(),command,connection);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
}

