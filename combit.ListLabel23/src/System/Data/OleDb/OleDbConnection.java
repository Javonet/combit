package System.Data.OleDb;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NException;
import com.javonet.api.NObject;

public class OleDbConnection {
	private NObject handle;
	
	public OleDbConnection(String connectionString) {
		try {
			handle = Javonet.New(OleDbConnection.class.getName(), connectionString);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void Open() {
		try {
			handle.invoke("Open");
		} catch (NException e) {
			e.printStackTrace();
			if (e.getInnerException()!=null)
			e.getInnerException().printStackTrace();
		} catch (JavonetException e) {
			e.printStackTrace();
			
		}
	}
	
	public void Close() {
		try {
			handle.invoke("Close");
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
}
