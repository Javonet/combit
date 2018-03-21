package combit.ListLabel23.ListLabelPreviewControl;

import java.awt.Dimension;
import java.awt.Point;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NControlJContainer;
import com.javonet.api.NEnum;
import com.javonet.api.NObject;

import System.Windows.Forms.DockStyle;
import combit.ListLabel23.JavonetActivation;
import combit.ListLabel23.LlPreviewControlCloseMode;

public class ListLabelPreviewControl extends NControlJContainer {
	
	private static final long serialVersionUID = -3935829477967255010L;
	private static NObject handle;
	
	public ListLabelPreviewControl() throws JavonetException {
		super(Javonet.New(ListLabelPreviewControl.class.getPackage().getName()));
		handle=this.getUserControl();
	}
	
	public void Dispose() {
		try {
			handle.invoke("Dispose");
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void attachButtonPressCommand(ButtonPressCommand event)
	{
		try {
		handle.addEventListener("ButtonPress", event);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void detachButtonPressCommand(ButtonPressCommand event)
	{
		try {
		handle.removeEventListener("ButtonPress", event);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setAllowRbuttonUsage(boolean allowRbuttonUsage) {
		try {
			handle.set("AllowRbuttonUsage", allowRbuttonUsage);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setBackColor(NObject color) {
		try {
			handle.set("BackColor", color);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setCloseMode(LlPreviewControlCloseMode closeMode) {
		try {
			handle.set("CloseMode", NEnum.fromJavaEnum(closeMode));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setCurrentPage(int currentPage) {
		try {
			handle.set("CurrentPage", currentPage);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	
	public void setForceReadOnly(boolean forceReadOnly) {
		try {
			handle.set("ForceReadOnly", forceReadOnly);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setLocation(Point point) {
		try {
			handle.set("Location", Javonet.New("System.Drawing.Point",point.x,point.y));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setName(String name) {
		try {
			handle.set("Name", name);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setSize(Dimension size){
		try {
			handle.set("Size", Javonet.New("System.Drawing.Size",size.width,size.height));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setSlideshowMode(boolean ssmode){
		try {
			handle.set("SlideshowMode", ssmode);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setTabIndex(int tabIndex){
		try {
			handle.set("TabIndex", tabIndex);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setText(String text){
		try {
			handle.set("Text", text);
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setDock(DockStyle dockStyle) {
		try {
			handle.set("Dock",NEnum.fromJavaEnum(dockStyle));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public ListLabelPreviewButtons getToolbarButtons() {
		try {
			return new ListLabelPreviewButtons(handle.get("ToolbarButtons"));
		} catch (JavonetException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	static {
		JavonetActivation.InitializeJavonet();
	}
}
