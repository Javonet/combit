package combit.ListLabel23;

import com.javonet.Javonet;
import com.javonet.JavonetApartmentState;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;

public class ListLabelActivation {
	private static String email;
	private static String licenseKey;
	
	public static void setLicense(String javonetLicenseEmail, String javonetLicenseKey) {
		email=javonetLicenseEmail;
		licenseKey=javonetLicenseKey;
	}
	
	public static void initializeJavonet() {
		if (!Javonet.isActivated()) {
			try {
				Javonet.setApartmentState(JavonetApartmentState.STA);

				Javonet.activate(email, licenseKey, JavonetFramework.v45);
				Javonet.setUsePrivateHandleField(true);
				Javonet.addReference("combit.ListLabel23.dll");
				Javonet.addReference("System.Data");
			} catch (JavonetException e) {
				e.printStackTrace();
			}
		}
	}

}
