package combit.ListLabel23;

import java.util.EnumSet;

/**
 * This is standard Java enum which has the same 
 * package as .NET namespace of the same named enum
 * with corresponding values.
 * 
 * It can be used as Java strongly typed wrapper over
 * .NET enum.
 * 
 * @author Javonet
 *
 */
public enum LlProject {
	Label(1),
	List(2),
	Card(3),
	NoNameInTitle(2048),
	FileAlsoNew(32768);
	
	private int value;
    private LlProject(int value){
        this.value = value;
    }
    
    public int getValue() {
    	return this.value;
    }
	
	public static final EnumSet<LlProject> ALL_OPTS = EnumSet.allOf(LlProject.class);
	
	public static <T extends Enum<LlProject>> int enumSetToInt(EnumSet<LlProject> set)
	{
	    int r = 0;
	    for(LlProject value : set){
	    	r += value.getValue();
	    }
	    return r;
	}
}
