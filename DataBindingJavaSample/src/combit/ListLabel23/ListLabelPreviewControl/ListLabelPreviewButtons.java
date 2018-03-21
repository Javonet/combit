package combit.ListLabel23.ListLabelPreviewControl;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NEnum;
import com.javonet.api.NObject;

import combit.ListLabel23.LlButtonState;

public class ListLabelPreviewButtons {
private NObject handle;
	
	public ListLabelPreviewButtons() {
		try {
			handle = Javonet.New(ListLabelPreviewButtons.class.getPackage().getName());
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public ListLabelPreviewButtons(NObject nObject) {
		handle = nObject;
	}
	
	public void setExit(LlButtonState llButtonState) {
		try {
			handle.set("Exit",NEnum.fromJavaEnum(llButtonState));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setGotoFirst(LlButtonState gotoFirst) {
		try {
			handle.set("GotoFirst",NEnum.fromJavaEnum(gotoFirst));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setGotoLast(LlButtonState gotoLast) {
		try {
			handle.set("GotoLast",NEnum.fromJavaEnum(gotoLast));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setGotoNext(LlButtonState gotoNext) {
		try {
			handle.set("GotoNext",NEnum.fromJavaEnum(gotoNext));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setGotoPrev(LlButtonState gotoPrev) {
		try {
			handle.set("GotoPrev",NEnum.fromJavaEnum(gotoPrev));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setMouseModeMove(LlButtonState mouseModeMove) {
		try {
			handle.set("MouseModeMove",NEnum.fromJavaEnum(mouseModeMove));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setMouseModeZoom(LlButtonState mouseModeZoom) {
		try {
			handle.set("MouseModeZoom",NEnum.fromJavaEnum(mouseModeZoom));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setNextFile(LlButtonState nextFile) {
		try {
			handle.set("NextFile",NEnum.fromJavaEnum(nextFile));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setPageRange(LlButtonState pageRange) {
		try {
			handle.set("PageRange",NEnum.fromJavaEnum(pageRange));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setPreviousFile(LlButtonState previousFile) {
		try {
			handle.set("PreviousFile",NEnum.fromJavaEnum(previousFile));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setPrintAllPages(LlButtonState printAllPages) {
		try {
			handle.set("PrintAllPages",NEnum.fromJavaEnum(printAllPages));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setPrintCurrentPage(LlButtonState printCurrentPage) {
		try {
			handle.set("PrintCurrentPage",NEnum.fromJavaEnum(printCurrentPage));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setPrintToFax(LlButtonState printToFax) {
		try {
			handle.set("PrintToFax",NEnum.fromJavaEnum(printToFax));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setSaveAs(LlButtonState saveAs) {
		try {
			handle.set("SaveAs",NEnum.fromJavaEnum(saveAs));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setSearchNext(LlButtonState searchNext) {
		try {
			handle.set("SearchNext",NEnum.fromJavaEnum(searchNext));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setSearchOptions(LlButtonState searchOptions) {
		try {
			handle.set("SearchOptions",NEnum.fromJavaEnum(searchOptions));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setSearchStart(LlButtonState searchStart) {
		try {
			handle.set("SearchStart",NEnum.fromJavaEnum(searchStart));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setSearchText(LlButtonState searchText) {
		try {
			handle.set("SearchText",NEnum.fromJavaEnum(searchText));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setSendTo(LlButtonState sendTo) {
		try {
			handle.set("SendTo",NEnum.fromJavaEnum(sendTo));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setSlideshowMode(LlButtonState slideshowMode) {
		try {
			handle.set("SlideshowMode",NEnum.fromJavaEnum(slideshowMode));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setZoomCombo(LlButtonState zoomCombo) {
		try {
			handle.set("ZoomCombo",NEnum.fromJavaEnum(zoomCombo));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setZoomReset(LlButtonState zoomReset) {
		try {
			handle.set("ZoomReset",NEnum.fromJavaEnum(zoomReset));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setZoomRevert(LlButtonState zoomRevert) {
		try {
			handle.set("ZoomRevert",NEnum.fromJavaEnum(zoomRevert));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
	
	public void setZoomTimes2(LlButtonState zoomTimes2) {
		try {
			handle.set("ZoomTimes2",NEnum.fromJavaEnum(zoomTimes2));
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
}
