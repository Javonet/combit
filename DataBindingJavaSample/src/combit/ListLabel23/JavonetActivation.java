package combit.ListLabel23;

import com.javonet.Javonet;
import com.javonet.JavonetApartmentState;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;

public class JavonetActivation {
	public static void InitializeJavonet() {
		if (!Javonet.isActivated()) {
			try {
				Javonet.setApartmentState(JavonetApartmentState.STA);
				// Here you need to call Javonet.activate(...) and use your licensing information from Javonet
				// e.g. Javonet.activate("<Your eMail address>", "<Your Javonet licensing key>", JavonetFramework.v45);
				// You can obtain your own Javonet free trial license key at: https://my.javonet.com/signup/?type=free
				Javonet.activate("*******", "**********", JavonetFramework.v45);
				Javonet.setUsePrivateHandleField(true);
				Javonet.addReference("combit.ListLabel23.dll");
				Javonet.addReference("System.Data");
			} catch (JavonetException e) {
				e.printStackTrace();
			}
		}
	}
}
