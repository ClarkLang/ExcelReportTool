package versionone.bean;

import jxl.format.Colour; 
 

public class ColourBean {

	public Colour taskColour = Colour.TAN;
	public Colour taskDesignColour; 
	public Colour taskExecutionColour; 
	public Colour leaveOthersMeetingColour;
	
	public Colour getTaskColour() {
		return taskColour;
	}

	public void setTaskColour(Colour taskColour) {
		this.taskColour = taskColour;
	}
}
