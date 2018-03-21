package combit.ListLabel23;

import java.util.EnumSet;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NEnum;
import com.javonet.api.NException;
import com.javonet.api.NObject;

import combit.ListLabel23.Events.*;

/**
 * This example demonstrate the usage of the List & Label .NET component
 * (https://www.combit.net/en/reporting-tool) in Java with the third party
 * component Javonet (https://www.javonet.com). This is a strongly typed wrapper
 * for the combit List & Label .NET component. It exposes only the key
 * operations required for this sample. You can further extend this class to expose 
 * the strongly typed methods with signatures matching the 
 * combit List & Label .NET component (see also the .NET help at https://docu.combit.net/en)
 * and forwarding the calls via Javonet. To learn more how to perform different types 
 * of calls from Java to .NET API using Javonet, go to Javonet Guides 
 * for Java developers (https://www.javonet.com/java-devs/guides/).
 * 
 * @author combit GmbH & Javonet
 */
public class ListLabel {
	/**
	 * This property holds the reference to the .NET object associated with
	 * particular instance of this class. <br>
	 * <br>
	 * This is private property which by naming convention is detected by Javonet to
	 * resolve proper .NET instance while instances of this object are passed to
	 * .NET side. It is also used to forward the calls to .NET side.
	 */
	private NObject handle;

	public ListLabel() {
		try {
			handle = Javonet.New(ListLabel.class.getName());
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public NObject getHandle() {
		return handle;
	}

	public void Dispose() {
		try {
			handle.invoke("Dispose");
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void attachAutoDefineField(AutoDefineField event) {
		try {
			handle.addEventListener("AutoDefineField", event);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void detachAutoDefineField(AutoDefineField event) {
		try {
			handle.removeEventListener("AutoDefineField", event);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void attachAutoDefineVariable(AutoDefineVariable event) {
		try {
			handle.addEventListener("AutoDefineVariable", event);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void detachAutoDefineVariable(AutoDefineVariable event) {
		try {
			handle.removeEventListener("AutoDefineVariable", event);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setDataSource(Object provider) {
		try {
			handle.set("DataSource", provider);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setAutoProjectFile(String autoProjectFile) {
		try {
			handle.set("AutoProjectFile", autoProjectFile);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setAutoProjectType(EnumSet<LlProject> projectType) {
		try {
			handle.set("AutoProjectType", LlProject.enumSetToInt(projectType));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setAutoProjectType(LlProject projectType) {
		try {
			handle.set("AutoProjectType", projectType.getValue());
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setAutoShowSelectFile(boolean autoShowSelectFile) {
		try {
			handle.set("AutoShowSelectFile", autoShowSelectFile);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void Print(java.awt.Component component) throws LL_User_Aborted_Exception, ListLabelException {
		try {
			Core().setParentHandle(component);
			handle.invoke("Print");
		} catch (NException e) {
			if (e.getExceptionTypeName().endsWith("LL_User_Aborted_Exception")) {
				throw new LL_User_Aborted_Exception(e);
			} else if (e.getExceptionTypeName().endsWith("ListLabelException")) {
				throw new ListLabelException(e);
			}
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void Design(java.awt.Component component) throws LL_User_Aborted_Exception, ListLabelException {
		try {
			Core().setParentHandle(component);
			handle.invoke("Design");
		} catch (NException e) {
			if (e.getExceptionTypeName().endsWith("LL_User_Aborted_Exception")) {
				throw new LL_User_Aborted_Exception(e);
			} else if (e.getExceptionTypeName().endsWith("ListLabelException")) {
				throw new ListLabelException(e);
			}
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setAutoPrinterSettingsStream(Object stream) {
		try {
			handle.set("AutoPrinterSettingsStream", stream);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setAutoProjectStream(Object stream) {
		try {
			handle.set("AutoProjectStream", stream);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setCompressStorage(boolean compressStorage) {
		try {
			handle.set("CompressStorage", compressStorage);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setDataBindingMode(DataBindingMode mode) {
		try {
			handle.set("DataBindingMode", NEnum.fromJavaEnum(mode));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void SetDataBinding(Object dataSource, String dataMember) {
		try {
			handle.invoke("SetDataBinding", dataSource, dataMember);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setDrilldownAvailable(boolean drilldownAvailable) {
		try {
			handle.set("DrilldownAvailable", drilldownAvailable);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setEMFResolution(int emfResolution) {
		try {
			handle.set("EMFResolution", emfResolution);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setLockNextChar(int lockNextChar) {
		try {
			handle.set("LockNextChar", lockNextChar);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setMaxRTFVersion(int maxRTFVersion) {
		try {
			handle.set("MaxRTFVersion", maxRTFVersion);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setPhantomSpace(int phantomSpace) {
		try {
			handle.set("PhantomSpace", phantomSpace);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setPreviewControl(Object previewControl) {
		try {
			handle.set("PreviewControl", previewControl);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setUnit(LlUnits units) {
		try {
			handle.set("Unit", NEnum.fromJavaEnum(units));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setUseHardwareCopiesForLabels(boolean uUseHardwareCopiesForLabels) {
		try {
			handle.set("UseHardwareCopiesForLabels", uUseHardwareCopiesForLabels);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	public void setUseTableSchemaForDesignMode(boolean useTableSchemaForDesignMode) {
		try {
			handle.set("UseHardwareCopiesForLabels", useTableSchemaForDesignMode);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}

	private LlCore _core = null;

	public LlCore Core() throws JavonetException {
		if (_core == null)
			_core = new LlCore(this);

		return _core;
	}

	static {
		JavonetActivation.InitializeJavonet();
	}
}