package System.Windows.Forms;

public enum DockStyle {
			None(0),
	        //
	        // Summary:
	        //     The control's top edge is docked to the top of its containing control.
	        Top(1),
	        //
	        // Summary:
	        //     The control's bottom edge is docked to the bottom of its containing control.
	        Bottom(2),
	        //
	        // Summary:
	        //     The control's left edge is docked to the left edge of its containing control.
	        Left(3),
	        //
	        // Summary:
	        //     The control's right edge is docked to the right edge of its containing control.
	        Right(4),
	        //
	        // Summary:
	        //     All the control's edges are docked to the all edges of its containing control
	        //     and sized appropriately.
	        Fill(5);
	
			private int numVal;
				
			DockStyle(int numVal) {
		        this.numVal = numVal;
		    }
		
		    public int getNumVal() {
		        return numVal;
		    }
}
