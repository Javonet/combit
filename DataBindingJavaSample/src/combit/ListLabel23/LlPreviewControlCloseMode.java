package combit.ListLabel23;

public enum LlPreviewControlCloseMode {
	DeleteFile(0),
	KeepFile(1);
	
	private int numVal;
	
	LlPreviewControlCloseMode(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}

