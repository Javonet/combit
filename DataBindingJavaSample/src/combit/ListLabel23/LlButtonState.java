package combit.ListLabel23;

public enum LlButtonState {
    //
    // Summary:
    //     Invisible
    Invisible(0),
    //
    // Summary:
    //     Default
    Default(1),
    //
    // Summary:
    //     Enabled
    Enabled(2),
    //
    // Summary:
    //     Disabled
    Disabled(3);
	
	private int numVal;
	
	LlButtonState(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
